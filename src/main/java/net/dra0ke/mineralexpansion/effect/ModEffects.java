package net.dra0ke.mineralexpansion.effect;

import net.dra0ke.mineralexpansion.MineralExpansion;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> BOUNCY = registerStatusEffect("bouncy",
            new BouncyEffect(StatusEffectCategory.HARMFUL, 0x36ebab)
                    .addAttributeModifier(EntityAttributes.GENERIC_SAFE_FALL_DISTANCE,
                            Identifier.of(MineralExpansion.MOD_ID, "bouncy"), -0.5f,
            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    public static final RegistryEntry<StatusEffect> ARMOR_DECAY = registerStatusEffect("armor_decay",
            new ArmorDecayEffect(StatusEffectCategory.HARMFUL, 0x990000)
                    .addAttributeModifier(EntityAttributes.GENERIC_ARMOR_TOUGHNESS,
                            Identifier.of(MineralExpansion.MOD_ID, "armor_decay"), -2f,
                            EntityAttributeModifier.Operation.ADD_VALUE));
    public static final RegistryEntry<StatusEffect> SOUL_FLAME = registerStatusEffect("soul_flame",
            new SoulFlameEffect(StatusEffectCategory.HARMFUL, 0x00f3ff)
                    .addAttributeModifier(EntityAttributes.GENERIC_ARMOR,
                            Identifier.of(MineralExpansion.MOD_ID, "soul_flame"), -0.25f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));


    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(MineralExpansion.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        MineralExpansion.LOGGER.info("Registering Mod Effects for " + MineralExpansion.MOD_ID);
    }
}
