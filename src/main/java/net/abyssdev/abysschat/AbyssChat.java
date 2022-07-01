package net.abyssdev.abysschat;

import net.abyssdev.abysschat.listener.ChatListener;
import net.abyssdev.abysschat.variable.impl.BalanceChatVariable;
import net.abyssdev.abysschat.variable.impl.ItemChatVariable;
import net.abyssdev.abysschat.variable.set.ChatVariableSet;
import net.abyssdev.abysslib.economy.provider.Economy;
import net.abyssdev.abysslib.economy.registry.impl.DefaultEconomyRegistry;
import net.abyssdev.abysslib.plugin.AbyssPlugin;
import net.abyssdev.abysslib.text.MessageCache;
import org.bukkit.configuration.file.FileConfiguration;

public final class AbyssChat extends AbyssPlugin {

    private final ChatVariableSet chatVariableSet = new ChatVariableSet();

    private final MessageCache messageCache = new MessageCache(this.getConfig());
    private final FileConfiguration formats = this.getConfig("formats");
    private final FileConfiguration variables = this.getConfig("variables");

    private Economy economy;

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        this.chatVariableSet.register(new BalanceChatVariable(this), new ItemChatVariable(this));

        this.economy = DefaultEconomyRegistry.get().getEconomy("Vault");

        new ChatListener(this);

        for (final String message : this.getConfig().getConfigurationSection("messages").getKeys(false)) {
            this.messageCache.loadMessage("messages." + message);
        }
    }

    public Economy getEconomy() {
        return this.economy;
    }

    public FileConfiguration getFormats() {
        return this.formats;
    }

    public FileConfiguration getVariables() {
        return this.variables;
    }

    public ChatVariableSet getChatVariableSet() {
        return this.chatVariableSet;
    }

    public MessageCache getMessageCache() {
        return this.messageCache;
    }

}
