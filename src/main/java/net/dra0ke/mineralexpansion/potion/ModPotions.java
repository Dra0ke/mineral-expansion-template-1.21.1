package net.dra0ke.mineralexpansion.potion;

import net.dra0ke.mineralexpansion.MineralExpansion;
import net.dra0ke.mineralexpansion.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

import java.time.Duration;

public class ModPotions {
    public static final RegistryEntry<Potion> BOUNCY_POTION = registerPotion("bouncy_potion",
            new Potion(new StatusEffectInstance(ModEffects.BOUNCY, 300, 0)));
    public static final RegistryEntry<Potion> ARMOR_DECAY_POTION = registerPotion("armor_decay_potion",
            new Potion(new StatusEffectInstance(ModEffects.ARMOR_DECAY, 1000, 0)));
    public static final RegistryEntry<Potion> SOUL_FLAME_POTION = registerPotion("soul_flame_potion",
            new Potion(new StatusEffectInstance(ModEffects.SOUL_FLAME, 400, 0)));

    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(MineralExpansion.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        MineralExpansion.LOGGER.info("Registering Mod Potions for " + MineralExpansion.MOD_ID);
    }
}
