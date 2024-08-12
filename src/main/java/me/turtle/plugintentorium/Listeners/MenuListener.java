package me.turtle.plugintentorium.Listeners;
//imports
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
//listens for if inventory is clicked with name Tentorium test gui
public class MenuListener implements Listener {
    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        //check for inventory (test menu)
        if (e.getView().getTitle().equals(ChatColor.AQUA + "Tentorium test gui")) {
            //only if not right clicked
            if (e.isRightClick()) return;
            Player player = (Player) e.getWhoClicked();
            //if player left clicks barrier in Tentorium test gui give 1 barrier
            switch (e.getCurrentItem().getType()) {
                case BARRIER:
                    player.getInventory().addItem(new ItemStack(Material.BARRIER));
                    player.sendMessage("very cool you got 1 barrier");
                    break;

            }
        }
    }
}
