package net.abyssdev.abysschat.variable.impl;

import com.google.common.collect.ImmutableSet;
import net.abyssdev.abysschat.AbyssChat;
import net.abyssdev.abysschat.variable.ChatVariable;
import net.abyssdev.abysslib.placeholder.PlaceholderReplacer;
import net.abyssdev.abysslib.text.Color;
import net.abyssdev.abysslib.text.builder.MessageFactory;
import net.abyssdev.abysslib.utils.Utils;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BalanceChatVariable implements ChatVariable {

    private final AbyssChat plugin;

    private final String show;
    private final String tooltip;

    public BalanceChatVariable(final AbyssChat plugin) {
        this.plugin = plugin;

        this.show = plugin.getVariables().getString("variables.balance.show");
        this.tooltip = plugin.getVariables().getStringList("variables.balance.tooltip").stream().map(string -> string + "\n").collect(Collectors.joining());
    }

    private final Set<String> variables = ImmutableSet.of("[balance]", "[bal]");

    @Override
    public boolean canUse(final Player player) {
        return player.hasPermission("abysschat.balance");
    }

    @Override
    public @NotNull Set<String> getVariables() {
        return this.variables;
    }

    @Override
    public @NotNull TextComponent getReplacement(final Player player) {
        final PlaceholderReplacer replacer = new PlaceholderReplacer()
                .setUsePlaceholderAPI(true)
                .addPlaceholder("%balance%", Utils.format(this.plugin.getEconomy().getBalance(player)))
                .addPlaceholder("%player%", player.getName());

        final TextComponent component = new TextComponent(TextComponent.fromLegacyText(replacer.parse(Color.parse(this.show))));
        component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText(replacer.parse(Color.parse(this.tooltip)))));

        return component;
    }
}
