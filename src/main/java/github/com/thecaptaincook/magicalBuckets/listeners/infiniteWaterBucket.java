package github.com.thecaptaincook.magicalBuckets.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class infiniteWaterBucket implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event){

        Player player = event.getPlayer();

        if ((player.getInventory().getItemInMainHand().getItemMeta()).getDisplayName().equals("§bMagical Water Bucket")) {
            if (event.getAction() == Action.LEFT_CLICK_BLOCK){
                event.setCancelled(true);
                player.sendMessage("§bYou have infinite water!");
            }
        }
        else {
            event.setCancelled(true);
        }
    }
}
