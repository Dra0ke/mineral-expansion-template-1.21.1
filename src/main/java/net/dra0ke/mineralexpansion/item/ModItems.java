package net.dra0ke.mineralexpansion.item;

import net.dra0ke.mineralexpansion.MineralExpansion;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new Item.Settings()));
    public static final Item RAW_TITANIUM = registerItem("raw_titanium", new Item(new Item.Settings()));

    public static final Item TITANIUM_APPLE = registerItem("titanium_apple", new Item(new Item.Settings().food(ModFoodComponents.TITANIUM_APPLE).fireproof()));

    public static final Item INFERNIUM = registerItem("infernium", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MineralExpansion.MOD_ID, name), item);
    }

    public static void  registerModItems() {
        MineralExpansion.LOGGER.info("Registering Mod Items for " + MineralExpansion.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(TITANIUM_INGOT);
            fabricItemGroupEntries.add(RAW_TITANIUM);
        });
    }
}
