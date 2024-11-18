package net.dra0ke.mineralexpansion.item;

import net.dra0ke.mineralexpansion.MineralExpansion;
import net.dra0ke.mineralexpansion.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MINERAL_EXPANSION_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MineralExpansion.MOD_ID, "mineral_expansion_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TITANIUM_INGOT))
                    .displayName(Text.translatable("itemgroup.mineral-expansion.mineral_expansion_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModItems.TITANIUM_INGOT);

                        entries.add(ModItems.TITANIUM_APPLE);

                        entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);
                        entries.add(ModBlocks.TITANIUM_ORE);

                        entries.add(ModItems.INFERNIUM);
                        entries.add(ModBlocks.INFERNIUM_ORE);
                        entries.add(ModBlocks.INFERNIUM_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        MineralExpansion.LOGGER.info("Registering Mod Item Groups for " + MineralExpansion.MOD_ID);
    }
}
