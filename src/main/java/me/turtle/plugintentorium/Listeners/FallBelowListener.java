package me.turtle.plugintentorium.Listeners;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class FallBelowListener extends JavaPlugin implements Listener {

    private static final double DEATH_Y_LEVEL = 10; // Customize the Y-level for triggering the death

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        // Get the player's current Y-level
        double playerY = event.getTo().getY();

        // Check if the player is below the specified Y-level
        if (playerY < DEATH_Y_LEVEL) {
            // Kill the player
            event.getPlayer().setHealth(0);
        }
    }
}
