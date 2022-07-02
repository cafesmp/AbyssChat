package net.abyssdev.abysschat.format;

import lombok.Getter;
import net.abyssdev.abysslib.placeholder.PlaceholderReplacer;
import net.abyssdev.abysslib.text.Color;
import net.abyssdev.abysslib.text.builder.MessageFactory;
import net.abyssdev.abysslib.utils.AbyssComponentBuilder;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.stream.Collectors;

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

    private final String prefixTooltip;
    private final String nameTooltip;
    private final String suffixTooltip;
    
    public Format(final ConfigurationSection section) {

        this.priority = section.getInt("priority");

        this.prefix = Format.REPLACER.parse(Color.parse(section.getString("prefix")));
        this.suffix = Format.REPLACER.parse(Color.parse(section.getString("suffix")));
        this.nameColor = Format.REPLACER.parse(Color.parse(section.getString("name-color")));
        this.name = Format.REPLACER.parse(Color.parse(section.getString("name")));
        this.chatColor = Format.REPLACER.parse(section.getString("chat-color"));
        this.prefixCommand = Format.REPLACER.parse(section.getString("prefix-click-command"));
        this.nameCommand = Format.REPLACER.parse(section.getString("name-click-command"));
        this.suffixCommand = Format.REPLACER.parse(section.getString("suffix-click-command"));

        this.prefixTooltip = Format.REPLACER.parse(Color.parse(section.getStringList("prefix-tooltip")).stream().map(string -> string + "\n").collect(Collectors.joining()));
        this.nameTooltip = Format.REPLACER.parse(Color.parse(section.getStringList("name-tooltip")).stream().map(string -> string + "\n").collect(Collectors.joining()));
        this.suffixTooltip = Format.REPLACER.parse(Color.parse(section.getStringList("suffix-tooltip")).stream().map(string -> string + "\n").collect(Collectors.joining()));

    }


    public TextComponent getPrefixMessage(final Player player) {
        final TextComponent component = new TextComponent(TextComponent.fromLegacyText(Format.REPLACER.parse(player, this.prefix)));

        component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText(this.prefixTooltip)));
        component.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, this.prefixCommand));

        return component;
    }

    public TextComponent getNameMessage(final Player player) {
        final TextComponent component = new TextComponent(TextComponent.fromLegacyText(Format.REPLACER.parse(player, this.name)));

        component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText(this.nameTooltip)));
        component.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, this.nameCommand));

        return component;
    }

    public TextComponent getSuffixMessage(final Player player) {
        final TextComponent component = new TextComponent(TextComponent.fromLegacyText(Format.REPLACER.parse(player, this.suffix)));

        component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText(this.suffixTooltip)));
        component.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, this.suffixCommand));

        return component;
    }

    public TextComponent[] getComponent(final Player player) {
        return new TextComponent[] {this.getPrefixMessage(player), this.getNameMessage(player), this.getSuffixMessage(player)};
    }



}
