package me.turtle.plugintentorium.commands;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class knockbackcommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] strings) {
        // Check if the command sender is a player
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be executed by a player.");
            return true;
        }

        Player player = (Player) sender;

        
        double x = -57.50;
        double y = 54.00;
        double z = -492.50;
        float pitch = 0.0f;
        float yaw = 00.0f;



        World world = player.getWorld();
        Location location = new Location(world, x, y, z, yaw, pitch);

        player.teleport(location);
        player.getInventory().clear();
        Location spawnLocation = new Location(player.getWorld(), -58, -54, -492);
        player.setBedSpawnLocation(spawnLocation, true);
        player.sendMessage("Teleported to knockback arena.");

        return true;
    }
}
