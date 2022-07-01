package net.abyssdev.abysschat.util;

import net.abyssdev.abysslib.nbt.NBTUtils;
import net.abyssdev.abysslib.text.Color;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.nbt.api.BinaryTagHolder;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.event.ClickEvent;
import net.kyori.adventure.text.event.HoverEvent;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class ChatMessage {

    private final List<TextComponent.Builder> components = new ArrayList<>();

    public ChatMessage(final String message) {
        this.components.add(Component.text().content(color(message)));
    }

    public ChatMessage(final TextComponent component) {
        this.components.add(component.toBuilder());
    }

    public ChatMessage() {
        this.components.add(Component.text().content(""));
    }

    public ChatMessage suggest(final String command) {
        this.getLatestComponent().clickEvent(ClickEvent.suggestCommand(command));
        return this;
    }

    public ChatMessage command(final String command) {
        this.getLatestComponent().clickEvent(ClickEvent.runCommand(command));
        return this;
    }

    public ChatMessage tooltip(final String... text) {

        final TextComponent.Builder componentBuilder = Component.text().content(color(Arrays.stream(text).findFirst().get()));
        int i = 0;
        if (text.length > 1) {

            for (final String s : text) {
                ++i;
                if (i > 1) {
                    componentBuilder.append(Component.text().content("\n" + this.color(s)).build());
                }
            }
        }

        this.getLatestComponent().hoverEvent(HoverEvent.showText(componentBuilder.build()));
        return this;
    }

    public ChatMessage tooltip(final Collection<String> text) {
        final TextComponent.Builder componentBuilder = Component.text().content(color(text.stream().findFirst().get()));
        int i = 0;
        if (text.size() > 1) {

            for (final String s : text) {
                ++i;
                if (i > 1) {
                    componentBuilder.append(Component.text().content("\n" + this.color(s)).build());
                }
            }
        }

        this.getLatestComponent().hoverEvent(HoverEvent.showText(componentBuilder.build()));
        return this;
    }

    @SuppressWarnings("all")
    public ChatMessage showItem(final ItemStack item) {

        final NamespacedKey key = item.getType().getKey();

        this.getLatestComponent().hoverEvent(HoverEvent.showItem(Key.key(key.getNamespace(), key.getKey()), 1,
                BinaryTagHolder.of(NBTUtils.get().toJSON(item))));
        return this;

    }

    public ChatMessage link(final String link) {
        this.getLatestComponent().clickEvent(ClickEvent.openUrl(link));
        return this;
    }

    public ChatMessage then(final String message) {
        this.components.add(Component.text().content(Color.parse(message)));
        return this;
    }

    private TextComponent.Builder getLatestComponent() {
        return this.components.get(this.components.size() - 1);
    }

    public TextComponent getComponent() {
        final TextComponent.Builder builder = Component.text();
        components.forEach(b -> builder.append(b.build()));
        return builder.build();
    }

    public ChatMessage add(final TextComponent component) {
        components.add(component.toBuilder());
        return this;
    }

    private String color(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}
