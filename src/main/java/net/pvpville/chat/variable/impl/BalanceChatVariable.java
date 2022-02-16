package net.pvpville.chat.variable.impl;

import com.google.common.collect.ImmutableSet;
import net.md_5.bungee.api.chat.BaseComponent;
import net.pvpville.chat.VilleChat;
import net.pvpville.chat.variable.ChatVariable;
import net.pvpville.commons.text.builder.MessageFactory;
import org.aspect.aspectcommons.builders.PlaceholderReplacer;
import org.aspect.aspectcommons.utils.Utils;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Set;

public class BalanceChatVariable implements ChatVariable {

    private final VilleChat plugin;

    private final String show;
    private final List<String> tooltip;

    public BalanceChatVariable(final VilleChat plugin) {
        this.plugin = plugin;

        this.show = plugin.getVariables().getString("variables.balance.show");
        this.tooltip = plugin.getVariables().getStringList("variables.balance.tooltip");
    }

    private final Set<String> variables = ImmutableSet.of("[balance]", "[bal]");

    @Override
    public boolean canUse(final Player player) {
        return player.hasPermission("villechat.balance");
    }

    @Override
    public @NotNull Set<String> getVariables() {
        return this.variables;
    }

    @Override
    public @NotNull BaseComponent[] getReplacement(final Player player) {
        final PlaceholderReplacer replacer = new PlaceholderReplacer()
                .setUsePlaceholderAPI(true)
                .addPlaceholder("%balance%", Utils.format(this.plugin.getEconomy().getBalance(player)))
                .addPlaceholder("%player%", player.getName());

        return MessageFactory.spigot(replacer.parse(this.show)).tooltip(replacer.parse(this.tooltip)).build();
    }
}
