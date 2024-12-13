package me.turtle.plugintentorium;

import me.turtle.plugintentorium.Listeners.JoinLeaveListener;
import me.turtle.plugintentorium.Listeners.TnTRunListener;
import me.turtle.plugintentorium.commands.*;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class Plug_in_tentorium extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        //comands
        getCommand("spawn").setExecutor(new spawncommand());
        getCommand("knockback").setExecutor(new knockbackcommand());
        getCommand("tntrun").setExecutor(new tntruncommand());
        getCommand("spleef").setExecutor(new spleefcommand());
        getCommand("parkour").setExecutor(new parkourcommand());
        getCommand("ffa").setExecutor(new ffacommand());
        //EVENTS
        //tntrun thing idk
        getServer().getPluginManager().registerEvents(new TnTRunListener(), this);
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);

    }
}

