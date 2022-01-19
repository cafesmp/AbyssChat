package net.pvpville.chat.renderer;

import io.papermc.paper.chat.ChatRenderer;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import net.pvpville.chat.util.ColorMap;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class VilleChatRenderer implements ChatRenderer {

    private final Component component;

    private final String chatColor;

    public VilleChatRenderer(final Component component, final String chatColor) {
        this.component = component;
        this.chatColor = chatColor;
    }

    @Override
    public @NotNull Component render(@NotNull Player source,
                                     @NotNull Component sourceDisplayName,
                                     @NotNull Component message,
                                     @NotNull Audience viewer) {

        final int r = ColorMap.getColor(ChatColor.getByChar(this.chatColor)).red();
        final int g = ColorMap.getColor(ChatColor.getByChar(this.chatColor)).green();
        final int b = ColorMap.getColor(ChatColor.getByChar(this.chatColor)).blue();

        return Component.text()
                .append(this.component)
                .append(message.color(TextColor.color(r, g, b))).build();
    }

}
