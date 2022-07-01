package net.abyssdev.abysschat.comparator;

import net.abyssdev.abysschat.format.Format;
import net.abyssdev.abysslib.utils.tuple.Pair;
import org.bukkit.configuration.ConfigurationSection;

import java.util.Comparator;


public final class GroupComparator implements Comparator<Pair<String, Format>> {

    @Override
    public int compare(final Pair<String, Format> first, final Pair<String, Format> second) {
        return Integer.compare(first.getRight().getPriority(), second.getRight().getPriority());
    }

}
