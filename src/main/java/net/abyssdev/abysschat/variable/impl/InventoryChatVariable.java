package net.abyssdev.abysschat.variable.impl;

import com.google.common.collect.ImmutableSet;
import net.abyssdev.abysschat.AbyssChat;
import net.abyssdev.abysschat.menu.InventoryMenu;
import net.abyssdev.abysschat.variable.ChatVariable;
import net.abyssdev.abysslib.placeholder.PlaceholderReplacer;
import net.abyssdev.abysslib.text.Color;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public final class InventoryChatVariable implements ChatVariable, Listener {

    private final Set<String> variables = ImmutableSet.of("[inv]", "[inventory]", "[brag]");
    private final String show, tooltip;

    public InventoryChatVariable(final AbyssChat plugin) {
        this.show = plugin.getVariables().getString("variables.inventory.show");

        final StringBuilder builder = new StringBuilder();

        for (final String string : plugin.getVariables().getStringList("variables.inventory.tooltip")) {
            if (!builder.toString().isEmpty()) {
                builder.append("\n").append(string);
                continue;
            }

            builder.append(string);
        }

        this.tooltip = builder.toString();

        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @Override
    public boolean canUse(final Player player) {
        return player.hasPermission("abysschat.inventory");
    }

    @Override
    public @NotNull Set<String> getVariables() {
        return this.variables;
    }

    @Override
    public @NotNull TextComponent getReplacement(final Player player) {
        final PlaceholderReplacer replacer = new PlaceholderReplacer()
                .addPlaceholder("%player%", player.getName());

        final TextComponent component = new TextComponent(TextComponent.fromLegacyText(replacer.parse(Color.parse(this.show))));

        component.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText(replacer.parse(Color.parse(this.tooltip)))));
        component.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/abysschatopeninv " + player.getName()));

        return component;
    }

    @EventHandler
    public void onCommandPre(final PlayerCommandPreprocessEvent event) {
        if (!event.getMessage().startsWith("/abysschatopeninv ")) {
            return;
        }

        event.setCancelled(true);

        final Player player = Bukkit.getPlayer(event.getMessage().split(" ")[1]);

        if (player == null) {
            return;
        }

        event.getPlayer().openInventory(new InventoryMenu(player.getInventory()).getInventory());
    }

    @EventHandler
    public void onClick(final InventoryClickEvent event) {
        if (event.getClickedInventory() == null) {
            return;
        }

        if (event.getClickedInventory().getHolder() instanceof InventoryMenu || event.getView().getTopInventory().getHolder() instanceof InventoryMenu) {
            event.setCancelled(true);
        }
    }

}
