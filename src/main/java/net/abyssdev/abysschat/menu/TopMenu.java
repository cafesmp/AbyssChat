package net.abyssdev.abysschat.menu;

import net.abyssdev.abysschat.AbyssChat;
import net.abyssdev.abysschat.player.ChatPlayer;
import net.abyssdev.abysslib.builders.ItemBuilder;
import net.abyssdev.abysslib.menu.MenuBuilder;
import net.abyssdev.abysslib.menu.templates.AbyssMenu;
import net.abyssdev.abysslib.placeholder.PlaceholderReplacer;
import net.abyssdev.abysslib.scheduler.AbyssScheduler;
import net.abyssdev.abysslib.utils.Utils;
import net.abyssdev.abysslib.utils.tuple.Pair;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.LinkedList;
import java.util.List;

public final class TopMenu extends AbyssMenu {

    private final AbyssChat plugin;
    private final ItemStack invalid;
    private final ItemBuilder valid;
    private final Pair<ItemBuilder, Integer> stats;
    private final List<Integer> topSlots;

    public TopMenu(final AbyssChat plugin) {
        super(plugin.getConfig("top"), "");
        
        final FileConfiguration config = plugin.getConfig("top");

        this.plugin = plugin;
        this.topSlots = new LinkedList<>(config.getIntegerList("top-slots"));

        this.invalid = new ItemBuilder(config, "invalid-item").parse();
        this.valid = new ItemBuilder(config, "valid-item");
        this.stats = new Pair<>(
                new ItemBuilder(config, "stats-item"),
                config.getInt("stats-item.slot"));
    }

    @Override
    public void open(final Player player) {

        final MenuBuilder builder = this.createBase();

        int index = 0;

        for (final int slot : this.topSlots) {

            if (index >= this.plugin.getSortedPlayers().size()) {
                builder.setItem(slot, this.invalid);
                continue;
            }

            final ChatPlayer chatPlayer = this.plugin.getSortedPlayers().get(index);
            final OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(chatPlayer.getUuid());

            final ItemStack item = this.valid.parse(new PlaceholderReplacer()
                    .addPlaceholder("%rank%", String.valueOf(index + 1))
                    .addPlaceholder("%player%", offlinePlayer.getName())
                    .addPlaceholder("%amount%", Utils.format(chatPlayer.getMessages())));

            if (this.isPlayerSkull(this.valid)) {
                final SkullMeta skullMeta = (SkullMeta) item.getItemMeta();
                skullMeta.setOwner(offlinePlayer.getName());
            }

            builder.setItem(slot, item);
            index++;

        }

        final ChatPlayer chatPlayer = this.plugin.getStorage().get(player.getUniqueId());
        final ItemStack item = this.stats.getLeft().parse(new PlaceholderReplacer()
                .addPlaceholder("%rank%", String.valueOf(this.plugin.getSortedPlayers().indexOf(chatPlayer) + 1))
                .addPlaceholder("%player%", player.getName())
                .addPlaceholder("%amount%", Utils.format(chatPlayer.getMessages())));

        if (this.isPlayerSkull(this.stats.getLeft())) {
            final SkullMeta skullMeta = (SkullMeta) item.getItemMeta();
            skullMeta.setOwner(player.getName());
        }

        builder.setItem(this.stats.getRight(), item);

        player.openInventory(builder.build());
    }

    private boolean isPlayerSkull(final ItemBuilder builder) {
        return (builder.getMaterial().contains("SKULL_ITEM") || builder.getMaterial().contains("PLAYER_HEAD"))
                && builder.getSkull() != null
                && builder.getSkull().equalsIgnoreCase("%player%");
    }
}