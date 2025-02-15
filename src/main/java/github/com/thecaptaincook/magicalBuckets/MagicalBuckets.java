package github.com.thecaptaincook.magicalBuckets;

import github.com.thecaptaincook.magicalBuckets.commands.infiniteWaterBucketSummoner;
import github.com.thecaptaincook.magicalBuckets.listeners.infiniteWaterBucket;
import org.bukkit.plugin.java.JavaPlugin;

public final class MagicalBuckets extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("Welcome to Magical Buckets Plugin!");

        /*magicalWaterBucket wbr = new magicalWaterBucket();
        wbr.magicalWaterBucketRecipe();

         */
        getServer().getPluginManager().registerEvents(new infiniteWaterBucket(), this);
        getCommand("mwb").setExecutor(new infiniteWaterBucketSummoner());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("Goodbye from Magical Buckets Plugin!");

    }
}
