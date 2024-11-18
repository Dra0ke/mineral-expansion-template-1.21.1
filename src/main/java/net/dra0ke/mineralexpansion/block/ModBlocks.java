package net.dra0ke.mineralexpansion.block;

import net.dra0ke.mineralexpansion.MineralExpansion;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",
            new Block(AbstractBlock.Settings.create().strength(50f)
                    .requiresTool().sounds(BlockSoundGroup.NETHERITE)));
    public static final Block RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",
            new Block(AbstractBlock.Settings.create().strength(40f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));
    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 10),
                    AbstractBlock.Settings.create().strength(30f)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 10),
                    AbstractBlock.Settings.create().strength(35f)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block INFERNIUM_ORE = registerBlock("infernium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5, 8),
                    AbstractBlock.Settings.create().strength(5f)
                            .requiresTool().sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block INFERNIUM_BLOCK = registerBlock("infernium_block",
            new Block(AbstractBlock.Settings.create().strength(7.5f)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MineralExpansion.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MineralExpansion.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MineralExpansion.LOGGER.info("Registering Mod Blocks for " + MineralExpansion.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.TITANIUM_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.RAW_TITANIUM_BLOCK);
        });
    }
}
