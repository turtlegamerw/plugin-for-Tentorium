package me.turtle.plugintentorium;

import me.turtle.plugintentorium.commands.*;
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

public class Plug_in_tentorium extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {


        //comands
        getCommand("hub").setExecutor(new hubcommand());
        getCommand("knockback").setExecutor(new knockbackcommand());
        getCommand("tntrun").setExecutor(new tntruncommand());
        getCommand("spleef").setExecutor(new spleefcommand());
        getCommand("parkour").setExecutor(new parkourcommand());
        getCommand("ffa").setExecutor(new ffacommand());


        //events
        getServer().getPluginManager().registerEvents(this, this);


    }

    //if it works don't change it!
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
            Bukkit.getScheduler().runTaskLater(Plug_in_tentorium.getPlugin(Plug_in_tentorium.class), () -> {
                block.setType(Material.AIR);
            }, 10L);

        }
    }
}
