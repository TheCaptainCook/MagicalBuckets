package github.com.thecaptaincook.magicalBuckets.commands;

import github.com.thecaptaincook.magicalBuckets.recipes.magicalWaterBucket;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class infiniteWaterBucketSummoner implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        magicalWaterBucket waterBucket = new magicalWaterBucket();

        if (sender instanceof Player player){
            if (player.getGameMode() == GameMode.CREATIVE){
                player.getInventory().addItem(waterBucket.magicalWaterBucketRecipe());
                player.sendMessage("You have been given Infinite Water bucket.. Enjoy");
            }else{
                player.sendMessage("You can already use the same features in creative..");
                player.getInventory().addItem(waterBucket.magicalWaterBucketRecipe());
            }
            return true;
        } else {
            System.out.println("You have be a player to use this command. HACKER ALERT!!!");
        }
        return true;
    }
}
