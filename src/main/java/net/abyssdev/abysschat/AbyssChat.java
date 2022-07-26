package net.abyssdev.abysschat;

import lombok.Getter;
import net.abyssdev.abysschat.auth.lllIlllIlIIIIlllIIllIIIllIIIIlllIIlllIlIIIIlllIIllIIIlllIIIl;
import net.abyssdev.abysschat.command.ChatCommand;
import net.abyssdev.abysschat.listener.ChatListener;
import net.abyssdev.abysschat.listener.JoinListener;
import net.abyssdev.abysschat.menu.TopMenu;
import net.abyssdev.abysschat.player.ChatPlayer;
import net.abyssdev.abysschat.storage.ChatStorage;
import net.abyssdev.abysschat.variable.impl.BalanceChatVariable;
import net.abyssdev.abysschat.variable.impl.ItemChatVariable;
import net.abyssdev.abysschat.variable.set.ChatVariableSet;
import net.abyssdev.abysslib.economy.provider.Economy;
import net.abyssdev.abysslib.economy.registry.impl.DefaultEconomyRegistry;
import net.abyssdev.abysslib.menu.templates.AbyssMenu;
import net.abyssdev.abysslib.plugin.AbyssPlugin;
import net.abyssdev.abysslib.scheduler.AbyssScheduler;
import net.abyssdev.abysslib.storage.Storage;
import net.abyssdev.abysslib.text.MessageCache;
import org.bukkit.configuration.file.FileConfiguration;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Getter
public final class AbyssChat extends AbyssPlugin {

    private final ChatVariableSet chatVariableSet = new ChatVariableSet();
    private final Storage<UUID, ChatPlayer> storage = new ChatStorage(this);
    private final List<ChatPlayer> sortedPlayers = new LinkedList<>();

    private final ChatCommand command = new ChatCommand(this);

    private final AbyssMenu topMenu = new TopMenu(this);

    private final MessageCache messageCache = new MessageCache(this.getConfig("messages"));
    private final FileConfiguration formats = this.getConfig("formats");
    private final FileConfiguration variables = this.getConfig("variables");

    private Economy economy;

    @Override
    public void onEnable() {
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

        for (final String message : this.getConfig("messages").getConfigurationSection("messages").getKeys(false)) {
            this.messageCache.loadMessage("messages." + message);
        }

        AbyssScheduler.async().runRepeating(this::updateChatTop, this.getConfig("top").getInt("top-update-interval") * 20L);
    }

    @Override
    public void onDisable() {
        this.command.unregister();
    }

    public void updateChatTop() {
        this.sortedPlayers.clear();
        this.sortedPlayers.addAll(this.storage.allValues());
        this.sortedPlayers.sort(Comparator.comparingLong(player -> -player.getMessages()));
    }

}
