package net.dra0ke.mineralexpansion.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent TITANIUM_APPLE = new FoodComponent.Builder().nutrition(7).saturationModifier(1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3600, 4), 1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 1), 1f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2400, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3600, 0), 1f).alwaysEdible().build();
}
