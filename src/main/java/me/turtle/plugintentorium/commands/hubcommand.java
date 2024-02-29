package me.turtle.plugintentorium.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Location;
import org.bukkit.World;
public class hubcommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Check if the command sender is a player
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be executed by a player.");
            return true;
        }

        Player player = (Player) sender;

        // Teleport the player to the hub coordinates
        double x = 12.54;
        double y = 56.00;
        double z = 2.51;
        float pitch = 0.0f;
        float yaw = 90.0f;



        World world = player.getWorld();
        Location location = new Location(world, x, y, z, yaw, pitch);

        player.teleport(location);
        player.getInventory().clear();
        Location spawnLocation = new Location(player.getWorld(), 12, 56, 2);
        player.setBedSpawnLocation(spawnLocation, true);
        player.sendMessage("Teleported to the hub.");

        return true;
    }
}
