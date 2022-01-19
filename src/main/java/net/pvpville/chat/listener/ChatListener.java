package net.pvpville.chat.listener;

import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.TextReplacementConfig;
import net.kyori.adventure.text.serializer.plain.PlainComponentSerializer;
import net.pvpville.chat.VilleChat;
import net.pvpville.chat.variable.ChatVariable;
import net.pvpville.chat.variable.set.ChatVariableSet;
import org.aspect.aspectcommons.abstracts.AspectListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ChatListener extends AspectListener<VilleChat> {

    public ChatListener(final VilleChat plugin) {
        super(plugin);
    }

    @EventHandler
    public void chat(final AsyncChatEvent event) {

        final String plain = PlainComponentSerializer.plain().serialize(event.message());

        for (final ChatVariable chatVariable : this.getPlugin().getChatVariableSet().getSet()) {

            for (final String variable : chatVariable.getVariables()) {

                if (!plain.contains(variable)) {
                    continue;
                }
                if (!chatVariable.canUse(event.getPlayer())) {
                    continue;
                }

                final TextReplacementConfig config = TextReplacementConfig.builder()
                        .matchLiteral(variable)
                        .replacement(chatVariable.getReplacement(event.getPlayer())).build();

                event.message(event.message().replaceText(config));
            }

        }

    }

}
