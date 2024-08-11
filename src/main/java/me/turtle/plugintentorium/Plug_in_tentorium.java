package me.turtle.plugintentorium;

import me.turtle.plugintentorium.Listeners.TnTRunListener;
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
        //EVENTS
        //tntrun thing idk
        getServer().getPluginManager().registerEvents(new TnTRunListener(), this);
        //

    }
}

