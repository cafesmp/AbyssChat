package net.abyssdev.abysschat.variable;

import net.kyori.adventure.text.Component;
import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public interface ChatVariable {

    boolean canUse(final Player player);
    @NotNull Set<String> getVariables();
    @NotNull
    Component getReplacement(final Player player);

}
