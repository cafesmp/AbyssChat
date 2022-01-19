package net.pvpville.chat.format;

import io.papermc.paper.chat.ChatRenderer;
import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.serializer.plain.PlainComponentSerializer;
import net.luckperms.api.model.user.User;
import net.pvpville.chat.VilleChat;
import net.pvpville.chat.renderer.VilleChatRenderer;
import net.pvpville.commons.text.builder.AbstractMessageBuilder;
import net.pvpville.commons.text.builder.MessageFactory;
import net.pvpville.commons.text.color.Color;
import org.aspect.aspectcommons.abstracts.AspectListener;
import org.aspect.aspectcommons.builders.PlaceholderReplacer;
import org.bukkit.Bukkit;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class ChatFormat extends AspectListener<VilleChat> {

    private final PlaceholderReplacer replacer = new PlaceholderReplacer().setUsePlaceholderAPI(true);
    private final Map<String, ConfigurationSection> formats = new HashMap<>();

    public ChatFormat(final VilleChat plugin) {
        super(plugin);

        for (final String group : plugin.getFormats().getConfigurationSection("formats").getKeys(false)) {
            this.formats.put(group, plugin.getFormats().getConfigurationSection("formats." + group));
        }
    }

    @EventHandler
    public void format(final AsyncChatEvent event) {

        final Player player = event.getPlayer();
        final String group = this.getGroup(player);
        final ConfigurationSection section = this.formats.get(this.formats.containsKey(group) ? group : "default");

        final String prefixString = this.replacer.parse(player, Color.parse(section.getString("prefix")));
        final String suffixString = this.replacer.parse(player, Color.parse(section.getString("suffix")));
        final String nameColor = this.replacer.parse(player, Color.parse(section.getString("name_color")));
        final String nameString = this.replacer.parse(player, Color.parse(section.getString("name")));
        final String chatColor = section.getString("chat_color").replaceAll("&", "");

        final List<String> prefixTooltipList = this.replacer.parse(player, Color.parse(section.getStringList("prefix_tooltip")));
        final List<String> nameTooltipList = this.replacer.parse(player, Color.parse(section.getStringList("name_tooltip")));
        final List<String> suffixTooltipList = this.replacer.parse(player, Color.parse(section.getStringList("suffix_tooltip")));
        final String prefixCommand = this.replacer.parse(player, section.getString("prefix_click_command"));
        final String nameCommand = this.replacer.parse(player, section.getString("name_click_command"));
        final String suffixCommand = this.replacer.parse(player, section.getString("suffix_click_command"));

        final AbstractMessageBuilder<TextComponent.Builder, Component> prefix = MessageFactory.paper(prefixString)
                .tooltip(prefixTooltipList)
                .suggest(prefixCommand);
        final AbstractMessageBuilder<TextComponent.Builder, Component> name = MessageFactory.paper(nameColor + nameString)
                .tooltip(nameTooltipList)
                .suggest(nameCommand);
        final AbstractMessageBuilder<TextComponent.Builder, Component> suffix = MessageFactory.paper(suffixString)
                .tooltip(suffixTooltipList)
                .suggest(suffixCommand);
        final TextComponent component = Component.text()
                .append(prefix.build())
                .append(name.build())
                .append(suffix.build()).build();

        final ChatRenderer renderer = new VilleChatRenderer(component, chatColor);
        final String message = PlainComponentSerializer.plain().serialize(event.message());

        renderer.render(player, Component.text(Color.parse(player.getDisplayName())), Component.text().content(Color.parse(message)).build(), Bukkit.getServer());
        event.renderer(renderer);

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

}



