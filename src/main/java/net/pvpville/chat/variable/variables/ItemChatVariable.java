package net.pvpville.chat.variable.variables;

import com.google.common.collect.ImmutableSet;
import net.kyori.adventure.text.Component;
import net.pvpville.chat.VilleChat;
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

import java.util.List;
import java.util.Set;

public class ItemChatVariable implements ChatVariable {

    private final Set<String> variables = ImmutableSet.of("[item]", "[hand]");

    private final String show;

    public ItemChatVariable(final VilleChat plugin) {
        this.show = plugin.getVariables().getString("variables.item.show");
    }

    @Override
    public boolean canUse(final Player player) {
        return player.hasPermission("");
    }

    @Override
    public @NotNull Set<String> getVariables() {
        return this.variables;
    }

    @Override
    public @NotNull Component getReplacement(final Player player) {
        final ItemStack item = player.getItemInHand();

        if(item.getType() == Material.AIR) {
            return MessageFactory.paper("&e[Air x1]").build();
        }

        final ItemMeta meta = item.getItemMeta();

        final PlaceholderReplacer replacer = new PlaceholderReplacer()
                .addPlaceholder("%item%", meta.hasDisplayName() ? meta.getDisplayName() : WordUtils.capitalize(item.getType().name().replace("_", " ").toLowerCase()))
                .addPlaceholder("%amount%", Utils.format(item.getAmount()))
                .addPlaceholder("%player%", player.getName());

        return MessageFactory.paper(replacer.parse(this.show)).item(item).build();
    }

}
