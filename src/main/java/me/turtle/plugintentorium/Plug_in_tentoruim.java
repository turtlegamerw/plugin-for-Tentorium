package me.turtle.plugintentorium;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.block.TNTPrimeEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Plug_in_tentoruim extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("works");
        getServer().getPluginManager().registerEvents(this, this);

    }
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        // Get the block the player is standing on
        int test = 1;
        int blockX = player.getLocation().getBlockX();
        int blockY = player.getLocation().getBlockY();
        int blockZ = player.getLocation().getBlockZ();
        int betterY = blockY - test;

        getLogger().info("Player is standing on block at coordinates: X=" + blockX + ", Y=" + blockY + ", Z=" + blockZ);

        World world = player.getWorld();
        int Location = blockX + betterY + blockZ;
        Block block = world.getBlockAt(blockX, betterY, blockZ);

        Bukkit.getLogger().info("Block Type: " + block.getType());
        Bukkit.getLogger().info("Block Data: " + block.getData());
        Bukkit.getLogger().info("Block Location: " + block.getLocation());
    }
}

