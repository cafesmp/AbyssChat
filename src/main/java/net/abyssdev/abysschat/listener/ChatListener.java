package net.abyssdev.abysschat.listener;

import net.abyssdev.abysschat.AbyssChat;
import net.abyssdev.abysschat.comparator.GroupComparator;
import net.abyssdev.abysschat.event.AbyssPlayerChatEvent;
import net.abyssdev.abysschat.format.Format;
import net.abyssdev.abysschat.player.ChatPlayer;
import net.abyssdev.abysschat.variable.ChatVariable;
import net.abyssdev.abysslib.listener.AbyssListener;
import net.abyssdev.abysslib.placeholder.PlaceholderReplacer;
import net.abyssdev.abysslib.scheduler.AbyssScheduler;
import net.abyssdev.abysslib.text.Color;
import net.abyssdev.abysslib.utils.tuple.Pair;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Pattern;

public final class ChatListener extends AbyssListener<AbyssChat> {

    private static final PlaceholderReplacer REPLACER = new PlaceholderReplacer().setUsePlaceholderAPI(true);
    private static final Comparator<Pair<String, Format>> COMPARATOR = new GroupComparator();

    private final Map<String, Format> formats = new HashMap<>();

    public ChatListener(final AbyssChat plugin) {
        super(plugin);

        for (final String group : plugin.getFormats().getConfigurationSection("formats").getKeys(false)) {
            this.formats.put(group, new Format(plugin.getFormats().getConfigurationSection("formats." + group)));
        }
    }

    @EventHandler
    public void format(final AsyncPlayerChatEvent event) {
        event.setFormat("%2$s");
        event.setCancelled(true);

        final Player player = event.getPlayer();
        final ChatPlayer chatPlayer = this.getPlugin().getStorage().get(player.getUniqueId());
        final String group = this.getGroup(player);
        final Format format = this.formats.get(this.formats.containsKey(group) ? group : "default");

        final List<TextComponent> components = new LinkedList<>(Arrays.asList(format.getComponent(player)));

        for (final ChatVariable variable : this.getPlugin().getChatVariableSet().getSet()) {

            for (final String var : variable.getVariables()) {
                if (!event.getMessage().contains(var)) {
                    continue;
                }

                if (!variable.canUse(event.getPlayer())) {
                    this.getPlugin().getMessageCache().sendMessage(
                            event.getPlayer(),
                            "messages.no-permission-for-variable",
                            new PlaceholderReplacer().addPlaceholder("%variable%", Color.parse(var))
                    );
                    return;
                }

                final String[] split = event.getMessage().split(Pattern.quote(var));
                event.setMessage(event.getMessage().replace(var, ""));

                if (split.length >= 1) {
                    components.add(new TextComponent(TextComponent.fromLegacyText(
                            player.hasPermission("abysschat.color") ? Color.parse(REPLACER.parse(player, format.getChatColor()) + split[0])
                                    : Color.parse(REPLACER.parse(player, format.getChatColor()) + Color.strip(split[0])))));
                }

                components.add(variable.getReplacement(player));

                if (split.length > 1) {
                    components.add(new TextComponent(TextComponent.fromLegacyText(
                            player.hasPermission("abysschat.color") ? Color.parse(REPLACER.parse(player, format.getChatColor()) + split[1])
                                    : Color.parse(REPLACER.parse(player, format.getChatColor()) + Color.strip(split[1])))));
                }
            }

        }

        AbyssScheduler.sync().run(() -> {
            final AbyssPlayerChatEvent chatEvent = new AbyssPlayerChatEvent(player, event.getMessage());

            this.getPlugin().getServer().getPluginManager().callEvent(chatEvent);

            if (chatEvent.isCancelled()) {
                return;
            }

            if (components.size() == 3) {
                components.add(new TextComponent(TextComponent.fromLegacyText(
                        player.hasPermission("abysschat.color") ? Color.parse(REPLACER.parse(player, format.getChatColor()) + chatEvent.getMessage())
                                : Color.parse(REPLACER.parse(player, format.getChatColor()) + Color.strip(chatEvent.getMessage())))));

            }

            CompletableFuture.runAsync(() -> {
                final TextComponent[] comps = components.toArray(new TextComponent[0]);

                for (final Player online : Bukkit.getOnlinePlayers()) {
                    online.spigot().sendMessage(comps);
                }
            });


            chatPlayer.setMessages(chatPlayer.getMessages() + 1);
        });
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



