package net.abyssdev.abysschat.renderer;

import io.papermc.paper.chat.ChatRenderer;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public final class AbyssRenderer implements ChatRenderer {

    private final Component component;

    private final String chatColor;

    private static final Map<ChatColor, ColorSet<Integer, Integer, Integer>> COLOR_MAP = new HashMap<>();

    static {
        COLOR_MAP.put(ChatColor.BLACK, new ColorSet<>(0, 0, 0));
        COLOR_MAP.put(ChatColor.DARK_BLUE, new ColorSet<>(0, 0, 170));
        COLOR_MAP.put(ChatColor.DARK_GREEN, new ColorSet<>(0, 170, 0));
        COLOR_MAP.put(ChatColor.DARK_AQUA, new ColorSet<>(0, 170, 170));
        COLOR_MAP.put(ChatColor.DARK_RED, new ColorSet<>(170, 0, 0));
        COLOR_MAP.put(ChatColor.DARK_PURPLE, new ColorSet<>(170, 0, 170));
        COLOR_MAP.put(ChatColor.GOLD, new ColorSet<>(255, 170, 0));
        COLOR_MAP.put(ChatColor.GRAY, new ColorSet<>(170, 170, 170));
        COLOR_MAP.put(ChatColor.DARK_GRAY, new ColorSet<>(85, 85, 85));
        COLOR_MAP.put(ChatColor.BLUE, new ColorSet<>(85, 85, 255));
        COLOR_MAP.put(ChatColor.GREEN, new ColorSet<>(85, 255, 85));
        COLOR_MAP.put(ChatColor.AQUA, new ColorSet<>(85, 255, 255));
        COLOR_MAP.put(ChatColor.RED, new ColorSet<Integer, Integer, Integer>(255, 85, 85));
        COLOR_MAP.put(ChatColor.LIGHT_PURPLE, new ColorSet<>(255, 85, 255));
        COLOR_MAP.put(ChatColor.YELLOW, new ColorSet<>(255, 255, 85));
        COLOR_MAP.put(ChatColor.WHITE, new ColorSet<>(255, 255, 255));
    }

    private static class ColorSet<R, G, B> {
        private final R red;
        private final G green;
        private final B blue;

        ColorSet(final R red, final G green, final B blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        public R red() {
            return red;
        }

        public G green() {
            return green;
        }

        public B blue() {
            return blue;
        }

    }

    public AbyssRenderer(final Component component, final String chatColor) {
        this.component = component;
        this.chatColor = chatColor.replace("&", "");
    }

    @Override
    public @NotNull Component render(final @NotNull Player source,
                                     final @NotNull Component sourceDisplayName,
                                     final @NotNull Component message,
                                     final @NotNull Audience viewer) {

        final int r = COLOR_MAP.get(ChatColor.getByChar(this.chatColor)).red();
        final int g = COLOR_MAP.get(ChatColor.getByChar(this.chatColor)).green();
        final int b = COLOR_MAP.get(ChatColor.getByChar(this.chatColor)).blue();

        return Component.text()
                .append(this.component)
                .append(message.color(TextColor.color(r, g, b))).build();
    }

}