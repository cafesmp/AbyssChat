package net.abyssdev.abysschat.variable.impl;

import com.google.common.collect.ImmutableSet;
import net.abyssdev.abysschat.AbyssChat;
import net.abyssdev.abysschat.variable.ChatVariable;
import net.abyssdev.abysslib.placeholder.PlaceholderReplacer;
import net.abyssdev.abysslib.text.builder.MessageFactory;
import net.abyssdev.abysslib.utils.Utils;
import net.kyori.adventure.text.Component;
import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Set;

public class BalanceChatVariable implements ChatVariable {

    private final AbyssChat plugin;

    private final String show;
    private final List<String> tooltip;

    public BalanceChatVariable(final AbyssChat plugin) {
        this.plugin = plugin;

        this.show = plugin.getVariables().getString("variables.balance.show");
        this.tooltip = plugin.getVariables().getStringList("variables.balance.tooltip");
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
    public @NotNull Component getReplacement(final Player player) {
        final PlaceholderReplacer replacer = new PlaceholderReplacer()
                .setUsePlaceholderAPI(true)
                .addPlaceholder("%balance%", Utils.format(this.plugin.getEconomy().getBalance(player)))
                .addPlaceholder("%player%", player.getName());

        return MessageFactory.paper(replacer.parse(this.show)).tooltip(replacer.parse(this.tooltip)).build();
    }
}
