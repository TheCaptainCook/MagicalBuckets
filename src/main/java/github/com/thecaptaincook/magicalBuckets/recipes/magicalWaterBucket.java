package github.com.thecaptaincook.magicalBuckets.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class magicalWaterBucket {


    public final ItemStack magicalWaterBucketRecipe() {
        
        ItemStack mwb = new ItemStack(Material.WATER_BUCKET, 1);
        ItemMeta mwbMeta = mwb.getItemMeta();
        if (mwbMeta != null) {
            mwbMeta.setDisplayName("§bMagical Water Bucket");
            mwbMeta.addEnchant(Enchantment.EFFICIENCY, 1, true);
            mwbMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

            ArrayList<String> lore = new ArrayList<>();
            lore.add(1,"§bInfinite Water Bucket");
            lore.add(2,"§7A bucket that defies the laws of nature.");
            lore.add(3,"§7Filled with the essence of the ocean,");
            lore.add(4,"§7it never runs dry. Use it wisely,");
            lore.add(5,"§7for the waters hold secrets untold.");
            mwbMeta.setLore(lore);

            mwb.setItemMeta(mwbMeta);
        }
        NamespacedKey waterBucketKey = new NamespacedKey("mb", "magical_water_bucket");
        ShapedRecipe mwbRecipe = new ShapedRecipe(waterBucketKey, mwb);
        mwbRecipe.shape("ABA", "BBB", "ABA");
        mwbRecipe.setIngredient('A', Material.IRON_BLOCK);
        mwbRecipe.setIngredient('B', Material.WATER_BUCKET);
        Bukkit.addRecipe(mwbRecipe);

        return mwb;

    }


}
