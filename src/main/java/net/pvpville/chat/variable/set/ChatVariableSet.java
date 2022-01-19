package net.pvpville.chat.variable.set;

import net.pvpville.chat.variable.ChatVariable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ChatVariableSet {

    private final Set<ChatVariable> set = new HashSet<>();

    public Set<ChatVariable> getSet() {
        return this.set;
    }

    public void register(final ChatVariable... variables) {
        this.set.addAll(Arrays.asList(variables));
    }

}