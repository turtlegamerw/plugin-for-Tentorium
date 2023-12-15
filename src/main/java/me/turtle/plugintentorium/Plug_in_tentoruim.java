package me.turtle.plugintentorium;

import me.turtle.plugintentorium.commands.hubcommand;
import me.turtle.plugintentorium.commands.knockbackcommand;
import me.turtle.plugintentorium.commands.spleefcommand;
import me.turtle.plugintentorium.commands.tntruncommand;
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
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static org.bukkit.Material.SAND;
import static org.bukkit.Material.TNT;

public class Plug_in_tentoruim extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("tentorium plug-in has started");

        //comands
        getCommand("hub").setExecutor(new hubcommand());
        getCommand("knockback").setExecutor(new knockbackcommand());
        getCommand("tntrun").setExecutor(new tntruncommand());
        getCommand("spleef").setExecutor(new spleefcommand());

        //events
        getServer().getPluginManager().registerEvents(this, this);


    }
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        // Get the block the player is standing on
        int test = 2;
        int blockX = player.getLocation().getBlockX();
        int blockY = player.getLocation().getBlockY();
        int blockZ = player.getLocation().getBlockZ();
        int betterY = blockY - test;
        World world = player.getWorld();
        int Location = blockX + betterY + blockZ;
        Block block = world.getBlockAt(blockX, betterY, blockZ);
        if (block.getType() == TNT) {
            // Schedule a task to set the TNT block to air after a delay (20 ticks = 1 second)
            Bukkit.getScheduler().runTaskLater(Plug_in_tentoruim.getPlugin(Plug_in_tentoruim.class), () -> {
                block.setType(Material.AIR);
            }, 10L);

        }
    }
}

