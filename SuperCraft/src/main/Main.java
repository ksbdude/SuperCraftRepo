package main;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public void onEnable() {
		FileConfiguration config = getConfig();

		config.addDefault("bedrock", Boolean.valueOf(true));
		config.addDefault("web", Boolean.valueOf(true));
		config.addDefault("chainBoots", Boolean.valueOf(true));
		config.addDefault("chainLeggings", Boolean.valueOf(true));
		config.addDefault("chainChestplate", Boolean.valueOf(true));
		config.addDefault("chainHelmet", Boolean.valueOf(true));
		config.addDefault("mossyCobble", Boolean.valueOf(true));
		config.addDefault("packedIce", Boolean.valueOf(true));

		config.options().copyDefaults(true);
		saveConfig();

		if (getConfig().getBoolean("bedrock", true)) {
			ShapedRecipe bedrock = new ShapedRecipe(new ItemStack(
					Material.BEDROCK, 1));
			bedrock.shape(new String[] { "AAA", "ABA", "AAA" });
			bedrock.setIngredient('A', Material.ENDER_STONE);
			bedrock.setIngredient('B', Material.OBSIDIAN);
			getServer().addRecipe(bedrock);
		}
		if (getConfig().getBoolean("web", true)) {
			ShapedRecipe web = new ShapedRecipe(new ItemStack(Material.WEB, 1));
			web.shape(new String[] { "AAA", "AAA", "AAA" });
			web.setIngredient('A', Material.STRING);
			getServer().addRecipe(web);
		}
		if (getConfig().getBoolean("chainBoots", true)) {
			ShapedRecipe chainBoots = new ShapedRecipe(new ItemStack(
					Material.CHAINMAIL_BOOTS, 1));
			chainBoots.shape(new String[] { "BAB", "ABA", "A A" });
			chainBoots.setIngredient('A', Material.IRON_INGOT);
			chainBoots.setIngredient('B', Material.STRING);
			getServer().addRecipe(chainBoots);
		}

		if (getConfig().getBoolean("chainLeggings", true)) {
			ShapedRecipe chainLeggings = new ShapedRecipe(new ItemStack(
					Material.CHAINMAIL_LEGGINGS, 1));
			chainLeggings.shape(new String[] { "ABA", "B B", "A A" });
			chainLeggings.setIngredient('A', Material.IRON_INGOT);
			chainLeggings.setIngredient('B', Material.STRING);
			getServer().addRecipe(chainLeggings);
		}

		if (getConfig().getBoolean("chainChestplate", true)) {
			ShapedRecipe chainChestplate = new ShapedRecipe(new ItemStack(
					Material.CHAINMAIL_CHESTPLATE, 1));
			chainChestplate.shape(new String[] { "A A", "BAB", "ABA" });
			chainChestplate.setIngredient('A', Material.IRON_INGOT);
			chainChestplate.setIngredient('B', Material.STRING);
			getServer().addRecipe(chainChestplate);
		}

		if (getConfig().getBoolean("chainHelmet", true)) {
			ShapedRecipe chainHelmet = new ShapedRecipe(new ItemStack(
					Material.CHAINMAIL_HELMET, 1));
			chainHelmet.shape(new String[] { "BAB", "A A" });
			chainHelmet.setIngredient('A', Material.IRON_INGOT);
			chainHelmet.setIngredient('B', Material.STRING);
			getServer().addRecipe(chainHelmet);
		}
		if (getConfig().getBoolean("mossyCobble", true)) {
			ShapedRecipe mossyCobble = new ShapedRecipe(new ItemStack(
					Material.MOSSY_COBBLESTONE, 8));
			mossyCobble.shape(new String[] { "CCC", "CSC", "CCC" });
			mossyCobble.setIngredient('C', Material.COBBLESTONE);
			mossyCobble.setIngredient('S', Material.VINE);
			getServer().addRecipe(mossyCobble);
		}
		if (getConfig().getBoolean("packedIce", true)) {
			ShapedRecipe packedIce = new ShapedRecipe(new ItemStack(
					Material.PACKED_ICE, 1));
			packedIce.shape(new String[] { "III", "III", "III" });
			packedIce.setIngredient('I', Material.ICE);
			getServer().addRecipe(packedIce);
		}
		
		reloadConfig();
	}
}