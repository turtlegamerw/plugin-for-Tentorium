package me.turtle.plugintentorium.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


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
        double y = -8.00;
        double z = 2.51;

        World world = player.getWorld();
        Location location = new Location(world, x, y, z);

        player.teleport(location);
        PotionEffect weaknessEffect = new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 1, false, false);
        player.addPotionEffect(weaknessEffect);
        player.getInventory().clear();
        player.sendMessage("Teleported to the hub.");

        return true;
    }
}
