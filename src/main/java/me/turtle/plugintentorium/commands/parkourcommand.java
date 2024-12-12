package me.turtle.plugintentorium.commands;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class parkourcommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] strings) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be executed by a player.");
            return true;
        }

        Player player = (Player) sender;

        
        double x = -39.50;
        double y = 48.00;
        double z = -3.50;
        float pitch = 0.0f;
        float yaw = 90.0f;



        World world = player.getWorld();
        Location location = new Location(world, x, y, z, yaw, pitch);

        player.teleport(location);
        player.getInventory().clear();
        Location spawnLocation = new Location(player.getWorld(), -40, -48, -4);
        player.setBedSpawnLocation(spawnLocation, true);
        player.sendMessage("Teleported to parkour.");
        return true;
    }
}
