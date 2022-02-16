package net.pvpville.chat.listener;

import net.luckperms.api.model.user.User;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.TextComponent;
import net.pvpville.chat.VilleChat;
import net.pvpville.chat.util.GroupMessage;
import net.pvpville.chat.variable.ChatVariable;
import org.aspect.aspectcommons.abstracts.AspectListener;
import org.aspect.aspectcommons.builders.PlaceholderReplacer;
import org.aspect.aspectcommons.chat.Color;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class ChatListener extends AspectListener<VilleChat> {

    private final PlaceholderReplacer replacer = new PlaceholderReplacer().setUsePlaceholderAPI(true);
    private final Map<String, ConfigurationSection> formats = new HashMap<>();

    public ChatListener(final VilleChat plugin) {
        super(plugin);

        for (final String group : plugin.getFormats().getConfigurationSection("formats").getKeys(false)) {
            this.formats.put(group, plugin.getFormats().getConfigurationSection("formats." + group));
        }
    }

    @EventHandler
    public void format(final AsyncPlayerChatEvent event) {

        event.setCancelled(true);

        final Player player = event.getPlayer();
        final String group = this.getGroup(player);
        final ConfigurationSection section = this.formats.get(this.formats.containsKey(group) ? group : "default");

        final String prefixString = this.replacer.parse(player, Color.colorize(section.getString("prefix")));
        final String suffixString = this.replacer.parse(player, Color.colorize(section.getString("suffix")));
        final String nameColor = this.replacer.parse(player, Color.colorize(section.getString("name_color")));
        final String nameString = this.replacer.parse(player, Color.colorize(section.getString("name")));
        final String chatColor = Color.colorize(section.getString("chat_color"));

        final List<String> prefixTooltipList = this.replacer.parse(player, Color.colorizeList(section.getStringList("prefix_tooltip")));
        final List<String> nameTooltipList = this.replacer.parse(player, Color.colorizeList(section.getStringList("name_tooltip")));
        final List<String> suffixTooltipList = this.replacer.parse(player, Color.colorizeList(section.getStringList("suffix_tooltip")));
        final String prefixCommand = this.replacer.parse(player, section.getString("prefix_click_command"));
        final String nameCommand = this.replacer.parse(player, section.getString("name_click_command"));
        final String suffixCommand = this.replacer.parse(player, section.getString("suffix_click_command"));

        final GroupMessage prefix = new GroupMessage(prefixString)
                .tooltip(prefixTooltipList)
                .suggest(prefixCommand);

        final GroupMessage name = new GroupMessage(nameColor + nameString)
                .tooltip(nameTooltipList)
                .suggest(nameCommand);

        final GroupMessage suffix = new GroupMessage(suffixString + chatColor)
                .tooltip(suffixTooltipList)
                .suggest(suffixCommand);

        for (final ChatVariable variable : this.getPlugin().getChatVariableSet().getSet()) {
            for (final String var : variable.getVariables()) {
                if (!event.getMessage().toLowerCase().contains(var)) {
                    continue;
                }

                if (!variable.canUse(player)) {
                    event.setCancelled(true);
                    this.getPlugin().getMessageCache().sendMessage(player, "Messages.NO-PERMISSION-FOR-VAR", new PlaceholderReplacer()
                            .addPlaceholder("%var%", var));
                    return;
                }

                event.setMessage(event.getMessage().replace(var, this.getFormattedMessage(variable.getReplacement(player))));
            }
        }


        final ComponentBuilder builder = new ComponentBuilder()
                .append(prefix.getFormattedMessage())
                .append(name.getFormattedMessage())
                .append(suffix.getFormattedMessage())
                .append(event.getMessage());


        for (final Player online : this.getPlugin().getServer().getOnlinePlayers()) {
            online.spigot().sendMessage(builder.create());
        }


    }

    private String getGroup(final Player player) {
        User user = null;
        try {
            user = this.getPlugin().getLuckPerms().getUserManager().loadUser(player.getUniqueId()).get();
        } catch (final InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return user.getPrimaryGroup();
    }

    private String getFormattedMessage(final BaseComponent[] components) {
        final StringBuilder sb = new StringBuilder();
        for (final BaseComponent component : components){
            if (sb.length() == 0) {
                sb.append(" ").append(((TextComponent) component).getText());
                continue;
            }

            sb.append(((TextComponent) component).getText());
        }
        return sb.toString();
    }

}



