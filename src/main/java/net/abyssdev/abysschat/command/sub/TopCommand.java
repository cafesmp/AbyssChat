package net.abyssdev.abysschat.command.sub;

import com.google.common.collect.ImmutableSet;
import net.abyssdev.abysschat.AbyssChat;
import net.abyssdev.abysslib.command.SubCommand;
import net.abyssdev.abysslib.command.context.CommandContext;
import net.abyssdev.abysslib.logger.AbyssLogger;
import org.bukkit.entity.Player;

import java.util.Set;
import java.util.logging.Level;

public final class TopCommand extends SubCommand {

    private static final Set<String> ALIASES = ImmutableSet.of("top", "topplayers", "lb", "leaderboard");

    private final AbyssChat plugin;

    public TopCommand(final AbyssChat plugin) {
        super(0);

        this.plugin = plugin;
    }

    @Override
    public Set<String> aliases() {
        return TopCommand.ALIASES;
    }

    @Override
    public void execute(final CommandContext<?> context) {

        if (!(context.getSender() instanceof Player)) {
            AbyssLogger.log(Level.INFO, "Only players can execute this command!");
            return;
        }

        final Player player = context.getSender();

        if (!player.hasPermission("abysschat.top")) {
            this.plugin.getMessageCache().sendMessage(player, "messages.no-permission");
            return;
        }

        this.plugin.getTopMenu().open(player);
    }
}
