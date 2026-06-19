package com.ultreon.mods.masterweapons.world.entity.projectile;

import com.ultreon.mods.masterweapons.init.ModItems;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class UltranArrow extends AbstractArrow {
    public UltranArrow(EntityType<? extends AbstractArrow> type, Level level) {
        super(type, level);
    }

    public UltranArrow(EntityType<? extends AbstractArrow> entityType, double d, double e, double f, Level level, ItemStack itemStack, @Nullable ItemStack itemStack2) {
        super(entityType, d, e, f, level, itemStack, itemStack2);
    }

    public UltranArrow(EntityType<? extends AbstractArrow> entityType, LivingEntity livingEntity, Level level, ItemStack pickupItem, @Nullable ItemStack firedFromWeapon) {
        super(entityType, livingEntity, level, pickupItem, firedFromWeapon);
    }

    @Override
    protected ItemStack getDefaultPickupItem() {
        return new ItemStack(ModItems.ULTRAN_ARROW.get());
    }

    @Override
    protected void onHitEntity(@NotNull EntityHitResult hit) {
        super.onHitEntity(hit);
        Entity entity = hit.getEntity();
        if (entity instanceof LivingEntity living) {
            Entity arrowOwner = this.getOwner();
            DamageSource damageSource;
            if (arrowOwner == null) {
                damageSource = living.level().damageSources().arrow(this, this);
            } else {
                damageSource = living.level().damageSources().arrow(this, arrowOwner);
                if (arrowOwner instanceof LivingEntity livingOwner) {
                    livingOwner.setLastHurtMob(entity);
                }
            }

            living.hurt(damageSource, Float.POSITIVE_INFINITY);
        }
    }
}
