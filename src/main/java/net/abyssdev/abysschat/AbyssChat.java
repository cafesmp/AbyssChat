package net.abyssdev.abysschat;

import net.abyssdev.abysschat.auth.lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl;
import net.abyssdev.abysschat.listener.ChatListener;
import net.abyssdev.abysschat.listener.JoinListener;
import net.abyssdev.abysschat.variable.impl.BalanceChatVariable;
import net.abyssdev.abysschat.variable.impl.ItemChatVariable;
import net.abyssdev.abysschat.variable.set.ChatVariableSet;
import net.abyssdev.abysslib.economy.provider.Economy;
import net.abyssdev.abysslib.economy.registry.impl.DefaultEconomyRegistry;
import net.abyssdev.abysslib.plugin.AbyssPlugin;
import net.abyssdev.abysslib.text.MessageCache;
import org.bukkit.configuration.file.FileConfiguration;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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

        try {
            final Class<?> fileClazz = Class.forName("java.io.File");
            final Constructor<?> constructor = fileClazz.getConstructor(Class.forName("java.io.File"), Class.forName("java.lang.String"));
            final Object licenseFile = constructor.newInstance(this.getDataFolder(), "license.txt");

            if(!((Boolean) fileClazz.getMethod("exists").invoke(licenseFile))) {
                final Object parentFile = fileClazz.getMethod("getParentFile").invoke(licenseFile);
                fileClazz.getMethod("mkdir").invoke(parentFile);

                this.saveResource("license.txt", false);
            }

            final Class<?> scannerClazz = Class.forName("java.util.Scanner");
            final Constructor<?> scannerConstructor = scannerClazz.getConstructor(Class.forName("java.io.File"));
            final Object scanner = scannerConstructor.newInstance(licenseFile);
            final Object text = scannerClazz.getMethod("nextLine").invoke(scanner);
            new lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl(this, (String) Class.forName("java.lang.String").cast(text));
        } catch (Exception exception) {
            exception.printStackTrace();
            try {
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
                Class.forName("java.lang.System").getDeclaredMethod("exit", int.class).invoke(null, 0);
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
            System.exit(0);
        }

        new ChatListener(this);
        new JoinListener(this);

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
