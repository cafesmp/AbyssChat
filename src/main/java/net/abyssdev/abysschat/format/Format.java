package net.abyssdev.abysschat.format;

import lombok.Getter;
import net.abyssdev.abysschat.util.ChatMessage;
import net.abyssdev.abysslib.placeholder.PlaceholderReplacer;
import net.abyssdev.abysslib.text.Color;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;

import java.util.List;

@Getter
public final class Format {

    private static final PlaceholderReplacer REPLACER = new PlaceholderReplacer().setUsePlaceholderAPI(true);

    private final int priority;

    private final String prefix;
    private final String suffix;
    private final String nameColor;
    private final String name;
    private final String chatColor;
    private final String prefixCommand;
    private final String nameCommand;
    private final String suffixCommand;

    private final List<String> prefixTooltip;
    private final List<String> nameTooltip;
    private final List<String> suffixTooltip;
    
    public Format(final ConfigurationSection section) {

        this.priority = section.getInt("priority");

        this.prefix = Color.parse(section.getString("prefix"));
        this.suffix = Color.parse(section.getString("suffix"));
        this.nameColor = Color.parse(section.getString("name-color"));
        this.name = Color.parse(section.getString("name"));
        this.chatColor = section.getString("chat-color");
        this.prefixCommand = section.getString("prefix-click-command");
        this.nameCommand = section.getString("name-click-command");
        this.suffixCommand = section.getString("suffix-click-command");

        this.prefixTooltip = Color.parse(section.getStringList("prefix-tooltip"));
        this.nameTooltip = Color.parse(section.getStringList("name-tooltip"));
        this.suffixTooltip = Color.parse(section.getStringList("suffix-tooltip"));

    }

    public ChatMessage getPrefixMessage(final Player player) {
        return new ChatMessage(Format.REPLACER.parse(player, this.prefix))
                .tooltip(Format.REPLACER.parse(player, this.prefixTooltip))
                .suggest(Format.REPLACER.parse(player, this.prefixCommand));
    }

    public ChatMessage getNameMessage(final Player player) {
        return new ChatMessage(Format.REPLACER.parse(player, this.name))
                .tooltip(Format.REPLACER.parse(player, this.nameTooltip))
                .suggest(Format.REPLACER.parse(player, this.nameCommand));
    }

    public ChatMessage getSuffixMessage(final Player player) {
        return new ChatMessage(Format.REPLACER.parse(player, this.suffix))
                .tooltip(Format.REPLACER.parse(player, this.suffixTooltip))
                .suggest(Format.REPLACER.parse(player, this.suffixCommand));
    }

    public TextComponent getComponent(final Player player) {
        return Component.text()
                .append(this.getPrefixMessage(player).getComponent())
                .append(this.getNameMessage(player).getComponent())
                .append(this.getSuffixMessage(player).getComponent()).build();
    }



}
