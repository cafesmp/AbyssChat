package net.pvpville.chat.listener;

import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.TextReplacementConfig;
import net.kyori.adventure.text.serializer.plain.PlainComponentSerializer;
import net.pvpville.chat.variables.ChatVariable;
import net.pvpville.chat.variables.set.ChatVariableSet;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ChatListener implements Listener {

    private final ChatVariableSet set;

    public ChatListener(final ChatVariableSet set) {
        this.set = set;
    }

    @EventHandler
    public void chat(final AsyncChatEvent event) {

        final String plain = PlainComponentSerializer.plain().serialize(event.message());

        for (final ChatVariable chatVariable : this.set.getSet()) {

            for (final String variable : chatVariable.getVariables()) {

                if(!plain.contains(variable)) {
                    continue;
                }
                if (!chatVariable.canUse(event.getPlayer())) {
                    continue;
                }

                TextReplacementConfig.builder()
                        .matchLiteral(variable)
                        .replacement(chatVariable.getReplacement());
            }

        }

    }

}
