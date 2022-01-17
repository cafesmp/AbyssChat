package net.pvpville.chat;

import net.pvpville.chat.variables.BalanceChatVariable;
import net.pvpville.chat.variables.set.ChatVariableSet;
import org.bukkit.plugin.java.JavaPlugin;

public final class VilleChat extends JavaPlugin {

    private final ChatVariableSet chatVariableSet = new ChatVariableSet();

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.chatVariableSet.register(new BalanceChatVariable());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
