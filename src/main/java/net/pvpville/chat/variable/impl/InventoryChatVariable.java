package net.pvpville.chat.variable.impl;

import com.google.common.collect.ImmutableSet;
import net.md_5.bungee.api.chat.BaseComponent;
import net.pvpville.chat.variable.ChatVariable;
import net.pvpville.commons.text.builder.MessageFactory;
import org.apache.commons.lang.WordUtils;
import org.aspect.aspectcommons.builders.PlaceholderReplacer;
import org.aspect.aspectcommons.utils.Utils;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class InventoryChatVariable implements ChatVariable {

    private final Set<String> variables = ImmutableSet.of("[inv]", "[brag]", "[inventory]", "[ifyoufindthisyouarecoolashellbro]");

    @Override
    public boolean canUse(final Player player) {
        return player.hasPermission("villechat.item");
    }

    @Override
    public @NotNull Set<String> getVariables() {
        return this.variables;
    }

    @Override
    public @NotNull BaseComponent[] getReplacement(final Player player) {
        final ItemStack item = player.getItemInHand();

        if(item.getType() == Material.AIR) {
            return MessageFactory.spigot("&e[Air x1]").build();
        }

        final ItemMeta meta = item.getItemMeta();

        final PlaceholderReplacer replacer = new PlaceholderReplacer()
                .addPlaceholder("%item%", meta.hasDisplayName() ? meta.getDisplayName() : WordUtils.capitalize(item.getType().name().replace("_", " ").toLowerCase()))
                .addPlaceholder("%amount%", Utils.format(item.getAmount()))
                .addPlaceholder("%player%", player.getName());

        return null;
    }

}
