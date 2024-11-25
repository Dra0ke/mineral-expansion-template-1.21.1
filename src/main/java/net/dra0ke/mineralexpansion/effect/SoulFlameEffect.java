package net.dra0ke.mineralexpansion.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.particle.ParticleTypes;

public class SoulFlameEffect extends StatusEffect {
    public SoulFlameEffect(StatusEffectCategory category, int color) {
        super(category, color, ParticleTypes.TRIAL_OMEN);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.damage(entity.getDamageSources().onFire(), 2F); {
            return true;
        }
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int i = 32 >> amplifier;
        if (i > 0) {
            return duration % i == 0;
        } else {
            return true;
        }
    }
}
