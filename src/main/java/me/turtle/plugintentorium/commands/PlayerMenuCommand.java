package me.turtle.plugintentorium.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class PlayerMenuCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] agrs) {
        if (sender instanceof Player player ) {
            //create an inventory with 9 slots with the name Tentorium test gui
            Inventory menu = Bukkit.createInventory(player, 9, ChatColor.AQUA + "Tentorium test gui");
            

        }
        return true;
    }
}
