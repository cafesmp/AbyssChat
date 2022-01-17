package net.pvpville.chat.variables;

import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public interface ChatVariable {

    boolean canUse(final Player player);

    @NotNull Set<String> getVariables();
    @NotNull String getPermission();
    @NotNull Component getReplacement();

}
