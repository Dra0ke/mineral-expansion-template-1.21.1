package net.dra0ke.mineralexpansion.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.math.Vec3d;

public class BouncyEffect extends StatusEffect {
    public BouncyEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(entity.groundCollision) {
            Vec3d initialVec = entity.getVelocity();
            Vec3d bounceVec = new Vec3d(initialVec.x, 1.1D, initialVec.z);
            entity.setVelocity(bounceVec.multiply(0.9D));
            return true;
        }

        return super.applyUpdateEffect(entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
