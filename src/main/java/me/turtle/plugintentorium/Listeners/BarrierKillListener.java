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
        // Get the block the player is standing on
        //should update it to work correctly but im lazy
        int test = 2;
        int blockX = player.getLocation().getBlockX();
        int blockY = player.getLocation().getBlockY();
        int blockZ = player.getLocation().getBlockZ();
        int betterY = blockY - test;
        World world = player.getWorld();
        int Location = blockX + betterY + blockZ;
        Block block = world.getBlockAt(blockX, betterY, blockZ);
        if (block.getType() == BARRIER) {
            Bukkit.getScheduler().runTaskLater(Plug_in_tentorium.getPlugin(Plug_in_tentorium.class), () -> {
                player.damage(10000000);
            }, 10L);

        }
    }
    
}
