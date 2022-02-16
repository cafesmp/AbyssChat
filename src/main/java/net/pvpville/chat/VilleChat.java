package net.pvpville.chat;

import net.luckperms.api.LuckPerms;
import net.pvpville.chat.listener.ChatListener;
import net.pvpville.chat.variable.impl.BalanceChatVariable;
import net.pvpville.chat.variable.set.ChatVariableSet;
import net.pvpville.chat.variable.impl.ItemChatVariable;
import org.aspect.aspectcommons.abstracts.EconomyProvider;
import org.aspect.aspectcommons.chat.MessageCache;
import org.aspect.aspectcommons.economy.EconomyManager;
import org.aspect.aspectcommons.files.FileManager;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public final class VilleChat extends JavaPlugin {

    private final ChatVariableSet chatVariableSet = new ChatVariableSet();
    private final FileManager<VilleChat> fileManager = new FileManager<>(this);
    private final MessageCache messageCache = new MessageCache(this.getConfig());

    private EconomyProvider economy;
    private LuckPerms luckPerms;

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        this.chatVariableSet.register(new BalanceChatVariable(this), new ItemChatVariable(this));

        this.hook();
        this.loadFiles();

        new ChatListener(this);

        for (final String message : this.getConfig().getConfigurationSection("Messages").getKeys(false)) {
            this.messageCache.loadMessage("Messages." + message);
        }
    }

    public EconomyProvider getEconomy() {
        return this.economy;
    }

    public LuckPerms getLuckPerms() {
        return this.luckPerms;
    }

    public FileConfiguration getFormats() {
        return this.fileManager.getConfig("formats");
    }

    public FileConfiguration getVariables() {
        return this.fileManager.getConfig("variables");
    }

    public ChatVariableSet getChatVariableSet() {
        return this.chatVariableSet;
    }

    public MessageCache getMessageCache() {
        return this.messageCache;
    }

    private void loadFiles() {
        this.fileManager.loadConfiguration("formats");
        this.fileManager.loadConfiguration("variables");
    }

    private void hook() {
        final RegisteredServiceProvider<LuckPerms> luckPermsProvider = this.getServer().getServicesManager().getRegistration(LuckPerms.class);

        this.economy = EconomyManager.get().getEconomy("Vault");
        this.luckPerms = luckPermsProvider.getProvider();
    }
}
