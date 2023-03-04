package net.abyssdev.abysschat.menu;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public final class InventoryMenu implements InventoryHolder {

    private final Inventory inventory;

    public InventoryMenu(final Inventory inventory) {
        this.inventory = inventory;
    }

    @NotNull
    @Override
    public Inventory getInventory() {
        final Inventory holderInventory = Bukkit.createInventory(this, 45, "");

        holderInventory.setContents(this.inventory.getContents());

        return holderInventory;
    }

}