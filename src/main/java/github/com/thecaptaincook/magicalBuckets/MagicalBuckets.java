package github.com.thecaptaincook.magicalBuckets;

import github.com.thecaptaincook.magicalBuckets.listeners.infiniteWaterBucket;
import org.bukkit.plugin.java.JavaPlugin;

public final class MagicalBuckets extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("Welcome to Magical Buckets Plugin!");

        getServer().getPluginManager().registerEvents(new infiniteWaterBucket(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("Goodbye from Magical Buckets Plugin!");

    }
}
