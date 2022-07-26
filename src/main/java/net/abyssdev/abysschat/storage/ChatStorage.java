package net.abyssdev.abysschat.storage;

import net.abyssdev.abysschat.player.ChatPlayer;
import net.abyssdev.abysslib.storage.json.JsonStorage;
import net.abyssdev.abysslib.utils.file.Files;
import org.bukkit.plugin.Plugin;

import java.util.UUID;

public final class ChatStorage extends JsonStorage<UUID, ChatPlayer> {

    public ChatStorage(final Plugin plugin) {
        super(Files.file("data.json", plugin), ChatPlayer.class);
    }

    @Override
    public ChatPlayer constructValue(final UUID key) {
        return new ChatPlayer(key);
    }
}
