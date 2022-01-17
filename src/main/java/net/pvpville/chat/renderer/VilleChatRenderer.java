package net.pvpville.chat.renderer;

import io.papermc.paper.chat.ChatRenderer;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

//Copied from Paper
public class VilleChatRenderer implements ChatRenderer {

    private final Component component;

    private final String chatColor;

    private static final Map<ChatColor, ColorSet<Integer, Integer, Integer>> colorMap = new HashMap<>();

    static {
        colorMap.put(ChatColor.BLACK, new ColorSet<>(0, 0, 0));
        colorMap.put(ChatColor.DARK_BLUE, new ColorSet<>(0, 0, 170));
        colorMap.put(ChatColor.DARK_GREEN, new ColorSet<>(0, 170, 0));
        colorMap.put(ChatColor.DARK_AQUA, new ColorSet<>(0, 170, 170));
        colorMap.put(ChatColor.DARK_RED, new ColorSet<>(170, 0, 0));
        colorMap.put(ChatColor.DARK_PURPLE, new ColorSet<>(170, 0, 170));
        colorMap.put(ChatColor.GOLD, new ColorSet<>(255, 170, 0));
        colorMap.put(ChatColor.GRAY, new ColorSet<>(170, 170, 170));
        colorMap.put(ChatColor.DARK_GRAY, new ColorSet<>(85, 85, 85));
        colorMap.put(ChatColor.BLUE, new ColorSet<>(85, 85, 255));
        colorMap.put(ChatColor.GREEN, new ColorSet<>(85, 255, 85));
        colorMap.put(ChatColor.AQUA, new ColorSet<>(85, 255, 255));
        colorMap.put(ChatColor.RED, new ColorSet<Integer, Integer, Integer>(255, 85, 85));
        colorMap.put(ChatColor.LIGHT_PURPLE, new ColorSet<>(255, 85, 255));
        colorMap.put(ChatColor.YELLOW, new ColorSet<>(255, 255, 85));
        colorMap.put(ChatColor.WHITE, new ColorSet<>(255, 255, 255));
    }

    private static class ColorSet<R, G, B> {

        private final R red;
        private final G green;
        private final B blue;

        ColorSet(R red, G green, B blue) {
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

    public VilleChatRenderer(final Component component, final String chatColor) {
        this.component = component;
        this.chatColor = chatColor;
    }

    @Override
    public @NotNull Component render(@NotNull Player source,
                                     @NotNull Component sourceDisplayName,
                                     @NotNull Component message,
                                     @NotNull Audience viewer) {

        int r = colorMap.get(ChatColor.getByChar(this.chatColor)).red();
        int g = colorMap.get(ChatColor.getByChar(this.chatColor)).green();
        int b = colorMap.get(ChatColor.getByChar(this.chatColor)).blue();

        return Component.text()
                .append(this.component)
                .append(message.color(TextColor.color(r, g, b))).build();
    }

}
