package me.turtle.plugintentorium.Listeners;

import static org.bukkit.Material.BARRIER;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import me.turtle.plugintentorium.Plug_in_tentorium;

public class BarrierKillListener implements Listener {
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();

        // Check if the player actually moved between blocks
        if (event.getFrom().getBlockX() == event.getTo().getBlockX() &&
            event.getFrom().getBlockY() == event.getTo().getBlockY() &&
            event.getFrom().getBlockZ() == event.getTo().getBlockZ()) {
            return; // Exit early
        }

        // Get the block directly below the player
        Block block = player.getLocation().subtract(0, 1, 0).getBlock();

        // Check if the block is a barrier
        if (block.getType() == Material.BARRIER) {
            // Kill the player with a slight delay
            Bukkit.getScheduler().runTaskLater(
                Plug_in_tentorium.getPlugin(Plug_in_tentorium.class),
                () -> player.setHealth(0),
                1L // Delay in ticks (10 ticks = 0.5 seconds)
            );
        }
    }
}

