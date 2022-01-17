package net.pvpville.chat.variables;

import com.google.common.collect.ImmutableSet;
import net.kyori.adventure.text.Component;
import net.pvpville.commons.text.builder.MessageFactory;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

public class BalanceChatVariable implements ChatVariable {

    private final Set<String> variables = ImmutableSet.of("[balance]", "[bal]");

    private final Component replacement = MessageFactory.paper()
            .tooltip("Balance Test").build();

    @Override
    public boolean canUse(Player player) {
        return true;
    }

    @Override
    public @NotNull Set<String> getVariables() {
        return this.variables;
    }

    @Override
    public @NotNull String getPermission() {
        return "villechat.balance";
    }

    @Override
    public @NotNull Component getReplacement() {
        return this.replacement;
    }
}
