package net.abyssdev.abysschat.player;

import lombok.Data;
import net.abyssdev.abysslib.storage.id.Id;

import java.util.UUID;

@Data
public final class ChatPlayer {

    @Id
    private final UUID uuid;

    private int messages;

}
