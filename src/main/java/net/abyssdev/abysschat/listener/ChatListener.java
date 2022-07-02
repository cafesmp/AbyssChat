package net.abyssdev.abysschat.listener;

import io.papermc.paper.chat.ChatRenderer;
import io.papermc.paper.event.player.AsyncChatEvent;
import net.abyssdev.abysschat.AbyssChat;
import net.abyssdev.abysschat.comparator.GroupComparator;
import net.abyssdev.abysschat.format.Format;
import net.abyssdev.abysschat.renderer.AbyssRenderer;
import net.abyssdev.abysschat.variable.ChatVariable;
import net.abyssdev.abysslib.listener.AbyssListener;
import net.abyssdev.abysslib.placeholder.PlaceholderReplacer;
import net.abyssdev.abysslib.text.Color;
import net.abyssdev.abysslib.utils.tuple.Pair;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.TextReplacementConfig;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;

import java.util.*;

public class ChatListener extends AbyssListener<AbyssChat> {

    private static final Comparator<Pair<String, Format>> COMPARATOR = new GroupComparator();

    private final Map<String, Format> formats = new HashMap<>();

    public ChatListener(final AbyssChat plugin) {
        super(plugin);

        for (final String group : plugin.getFormats().getConfigurationSection("formats").getKeys(false)) {
            this.formats.put(group, new Format(plugin.getFormats().getConfigurationSection("formats." + group)));
        }
    }

    @EventHandler
    public void format(final AsyncChatEvent event) {

        final String message = PlainTextComponentSerializer.plainText().serialize(event.message());

        if (event.getPlayer().hasPermission("abysschat.color")) {
            event.message(Component.text().content(Color.parse(message)).build());
        }

        for (final ChatVariable variable : this.getPlugin().getChatVariableSet().getSet()) {

            for (final String var : variable.getVariables()) {
                if (!message.contains(var)) {
                    continue;
                }

                if (!variable.canUse(event.getPlayer())) {
                    this.getPlugin().getMessageCache().sendMessage(
                            event.getPlayer(),
                            "messages.no-permission-for-variable",
                            new PlaceholderReplacer().addPlaceholder("%variable%", var)
                    );
                }

                final TextReplacementConfig config = TextReplacementConfig.builder()
                        .matchLiteral(var)
                        .replacement(variable.getReplacement(event.getPlayer())).build();

                event.message(event.message().replaceText(config));
            }

        }

        final Player player = event.getPlayer();
        final String group = this.getGroup(player);
        final Format format = this.formats.get(this.formats.containsKey(group) ? group : "default");

        final TextComponent component = format.getComponent(player);

        final ChatRenderer renderer = new AbyssRenderer(component, format.getChatColor());

        renderer.render(player, player.displayName(), Component.text().content(Color.parse(message)).build(), this.getPlugin().getServer());

        event.renderer(renderer);

    }

    private String getGroup(final Player player) {

        final Set<Pair<String, Format>> set = new TreeSet<>(ChatListener.COMPARATOR);

        for (final Map.Entry<String, Format> entry : this.formats.entrySet()) {

            if (!player.hasPermission("abysschat.group." + entry.getKey())) {
                continue;
            }

            set.add(new Pair<>(entry.getKey(), entry.getValue()));
        }

        return set.isEmpty() ? null : set.stream().findFirst().get().getLeft();
    }


}



