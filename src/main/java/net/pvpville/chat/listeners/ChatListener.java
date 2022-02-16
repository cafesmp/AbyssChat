package net.pvpville.chat.listeners;

import net.luckperms.api.model.user.User;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.chat.ComponentSerializer;
import net.pvpville.chat.VilleChat;
import net.pvpville.chat.variable.ChatVariable;
import net.pvpville.commons.text.builder.AbstractMessageBuilder;
import net.pvpville.commons.text.builder.MessageFactory;
import org.aspect.aspectcommons.abstracts.AspectListener;
import org.aspect.aspectcommons.builders.PlaceholderReplacer;
import org.aspect.aspectcommons.chat.Color;
import org.bukkit.Bukkit;
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

        final AbstractMessageBuilder<TextComponent, BaseComponent[]> prefix = MessageFactory.spigot(prefixString)
                .tooltip(prefixTooltipList)
                .suggest(prefixCommand);

        final AbstractMessageBuilder<TextComponent, BaseComponent[]> name = MessageFactory.spigot(nameColor + nameString)
                .tooltip(nameTooltipList)
                .suggest(nameCommand);

        final AbstractMessageBuilder<TextComponent, BaseComponent[]> suffix = MessageFactory.spigot(suffixString + chatColor)
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

        final BaseComponent[] component = new ComponentBuilder()
                .append(prefix.build())
                .append(name.build())
                .append(suffix.build())
                .append(event.getMessage())
                .create();

        event.setFormat("%2$s");
        event.setMessage(this.getFormattedMessage(component));
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
            if (!sb.isEmpty()) {
                sb.append(" ").append(((TextComponent) component).getText());
                continue;
            }

            sb.append(((TextComponent) component).getText());
        }
        return sb.toString();
    }

}



