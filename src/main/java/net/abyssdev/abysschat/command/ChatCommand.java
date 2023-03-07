package net.abyssdev.abysschat.command;

import com.google.common.collect.ImmutableList;
import net.abyssdev.abysschat.AbyssChat;
import net.abyssdev.abysschat.command.sub.TopCommand;
import net.abyssdev.abysslib.command.Command;
import net.abyssdev.abysslib.command.context.CommandContext;
import org.bukkit.command.CommandSender;

public final class ChatCommand extends Command<CommandSender> {

    private final AbyssChat plugin;

    public ChatCommand(final AbyssChat plugin) {
        super("chat", "Base chat command", ImmutableList.of(
                "achat",
                "abysschat"
        ), CommandSender.class);

        this.register(new TopCommand(plugin));

        this.plugin = plugin;
        this.require(0);

        this.register();
    }

    @Override
    public void execute(final CommandContext<CommandSender> context) {
        final CommandSender sender = context.getSender();

        if (!sender.hasPermission("abysschat.admin")) {
            this.plugin.getMessageCache().sendMessage(sender, "messages.no-permission");
            return;
        }

        this.plugin.getMessageCache().sendMessage(sender, "messages.admin-help");
    }
}
