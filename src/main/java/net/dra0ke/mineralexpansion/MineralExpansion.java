package net.dra0ke.mineralexpansion;

import net.dra0ke.mineralexpansion.block.ModBlocks;
import net.dra0ke.mineralexpansion.effect.ModEffects;
import net.dra0ke.mineralexpansion.item.ModItemGroups;
import net.dra0ke.mineralexpansion.item.ModItems;
import net.dra0ke.mineralexpansion.potion.ModPotions;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// yes
public class MineralExpansion implements ModInitializer {
	public static final String MOD_ID = "mineral-expansion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModEffects.registerEffects();

		ModPotions.registerPotions();

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, Items.SLIME_BALL, ModPotions.BOUNCY_POTION);
			builder.registerPotionRecipe(Potions.AWKWARD, Items.RAW_COPPER, ModPotions.ARMOR_DECAY_POTION);
			builder.registerPotionRecipe(Potions.AWKWARD, Items.SOUL_SAND, ModPotions.SOUL_FLAME_POTION);
		});
	}
}