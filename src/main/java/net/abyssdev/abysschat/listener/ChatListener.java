package net.abyssdev.abysschat.listener;

import io.papermc.paper.chat.ChatRenderer;
import io.papermc.paper.event.player.AsyncChatEvent;
import net.abyssdev.abysschat.AbyssChat;
import net.abyssdev.abysschat.comparator.GroupComparator;
import net.abyssdev.abysschat.renderer.AbyssRenderer;
import net.abyssdev.abysschat.util.ChatMessage;
import net.abyssdev.abysschat.variable.ChatVariable;
import net.abyssdev.abysslib.listener.AbyssListener;
import net.abyssdev.abysslib.placeholder.PlaceholderReplacer;
import net.abyssdev.abysslib.text.Color;
import net.abyssdev.abysslib.utils.tuple.Pair;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.TextReplacementConfig;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;

import java.util.*;

public class ChatListener extends AbyssListener<AbyssChat> {

    private static final Comparator<Pair<String, ConfigurationSection>> COMPARATOR = new GroupComparator();
    private static final PlaceholderReplacer REPLACER = new PlaceholderReplacer().setUsePlaceholderAPI(true);

    private final Map<String, ConfigurationSection> formats = new HashMap<>();

    public ChatListener(final AbyssChat plugin) {
        super(plugin);

        for (final String group : plugin.getFormats().getConfigurationSection("formats").getKeys(false)) {
            this.formats.put(group, plugin.getFormats().getConfigurationSection("formats." + group));
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
                if (!message.contains(var) || !variable.canUse(event.getPlayer())) {
                    continue;
                }

                final TextReplacementConfig config = TextReplacementConfig.builder()
                        .matchLiteral(var)
                        .replacement(variable.getReplacement(event.getPlayer())).build();

                event.message(event.message().replaceText(config));
            }

        }

        final Player player = event.getPlayer();
        final String group = this.getGroup(player);
        final ConfigurationSection section = this.formats.get(this.formats.containsKey(group) ? group : "default");

        final String prefixString = ChatListener.REPLACER.parse(player, Color.parse(section.getString("prefix")));
        final String suffixString = ChatListener.REPLACER.parse(player, Color.parse(section.getString("suffix")));
        final String nameColor = ChatListener.REPLACER.parse(player, Color.parse(section.getString("name-color")));
        final String nameString = ChatListener.REPLACER.parse(player, Color.parse(section.getString("name")));
        final String chatColor = section.getString("chat-color");

        final List<String> prefixTooltipList = ChatListener.REPLACER.parse(player, Color.parse(section.getStringList("prefix-tooltip")));
        final List<String> nameTooltipList = ChatListener.REPLACER.parse(player, Color.parse(section.getStringList("name-tooltip")));
        final List<String> suffixTooltipList = ChatListener.REPLACER.parse(player, Color.parse(section.getStringList("suffix-tooltip")));
        final String prefixCommand = ChatListener.REPLACER.parse(player, section.getString("prefix-click-command"));
        final String nameCommand = ChatListener.REPLACER.parse(player, section.getString("name-click-command"));
        final String suffixCommand = ChatListener.REPLACER.parse(player, section.getString("suffix-click-command"));

        final ChatMessage prefix = new ChatMessage(prefixString)
                .tooltip(prefixTooltipList)
                .suggest(prefixCommand);
        final ChatMessage name = new ChatMessage(nameColor + nameString)
                .tooltip(nameTooltipList)
                .suggest(nameCommand);
        final ChatMessage suffix = new ChatMessage(suffixString)
                .tooltip(suffixTooltipList)
                .suggest(suffixCommand);

        final TextComponent component = Component.text()
                .append(prefix.getComponent())
                .append(name.getComponent())
                .append(suffix.getComponent()).build();

        final ChatRenderer renderer = new AbyssRenderer(component, chatColor);

        renderer.render(player, player.displayName(), Component.text().content(Color.parse(message)).build(), this.getPlugin().getServer());

        event.renderer(renderer);

    }

    private String getGroup(final Player player) {

        final Set<Pair<String, ConfigurationSection>> set = new TreeSet<>(ChatListener.COMPARATOR);

        for (final Map.Entry<String, ConfigurationSection> entry : this.formats.entrySet()) {

            if (!player.hasPermission("abysschat.group." + entry.getKey())) {
                continue;
            }

            set.add(new Pair<>(entry.getKey(), entry.getValue()));
        }

        return set.isEmpty() ? null : set.stream().findFirst().get().getLeft();
    }


}



