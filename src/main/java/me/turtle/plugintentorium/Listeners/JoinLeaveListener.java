package me.turtle.plugintentorium.Listeners;

import net.md_5.bungee.chat.SelectorComponentSerializer;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {
    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        //why does this work??
        e.setQuitMessage(ChatColor.YELLOW + " " + ChatColor.BOLD + player.getDisplayName() + " has left the server");
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        e.setJoinMessage(ChatColor.YELLOW + " " + ChatColor.BOLD + player.getDisplayName() + " has joined the server");
        // Teleport the player to the spawn coordinates
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
    }


}
