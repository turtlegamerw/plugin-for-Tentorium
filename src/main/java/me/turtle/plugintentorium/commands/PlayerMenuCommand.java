package me.turtle.plugintentorium.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class PlayerMenuCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] agrs) {
        if (sender instanceof Player player ) {
            //create an inventory with 9 slots with the name Tentorium test gui
            Inventory menu = Bukkit.createInventory(player, 9, ChatColor.AQUA + "Tentorium test gui");

            //clicky thing
            ItemStack test = new ItemStack(Material.BARRIER);

            //item nbt?
            ItemMeta testMeta = test.getItemMeta();
            testMeta.setDisplayName(ChatColor.GREEN + "Test");
            testMeta.setLore(List.of(ChatColor.GOLD + "CRAZY LORE"));
            test.setItemMeta(testMeta);


            //adding items to test menu
            menu.setItem(1, test);

            //open Inventory
            player.openInventory(menu);

        }else{
            sender.sendMessage(ChatColor.RED + "You must be a player to use this command.");
        }
        return true;
    }
}
