package net.abyssdev.abysschat.comparator;

import net.abyssdev.abysslib.utils.tuple.Pair;
import org.bukkit.configuration.ConfigurationSection;

import java.util.Comparator;


public final class GroupComparator implements Comparator<Pair<String, ConfigurationSection>> {

    @Override
    public int compare(final Pair<String, ConfigurationSection> first, final Pair<String, ConfigurationSection> second) {
        return Integer.compare(first.getRight().getInt("priority"), second.getRight().getInt("priority"));
    }

}
