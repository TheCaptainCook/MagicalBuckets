package github.com.thecaptaincook.magicalBuckets.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class magicalWaterBucket {


    public static ItemStack magicalWaterBucketRecipe() {



        ItemStack mwb = new ItemStack(Material.WATER_BUCKET, 1);
        ItemMeta mwbMeta = mwb.getItemMeta();


        if (mwbMeta == null) {
            return null;
        }

        mwbMeta.setDisplayName("§bMagical Water Bucket");
        mwbMeta.addEnchant(Enchantment.EFFICIENCY, 1, true);
        mwbMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        mwb.setItemMeta(mwbMeta);

        NamespacedKey waterBucketKey = new NamespacedKey("magicalbuckets", "magical_water_bucket");
        ShapedRecipe waterBucketRecipe = new ShapedRecipe(waterBucketKey, mwb);
        waterBucketRecipe.shape("ABA", "BBB", "ABA");
        waterBucketRecipe.setIngredient('A', Material.IRON_BLOCK);
        waterBucketRecipe.setIngredient('B', Material.WATER_BUCKET);
        Bukkit.addRecipe(waterBucketRecipe);

        return mwb;

    }


}
