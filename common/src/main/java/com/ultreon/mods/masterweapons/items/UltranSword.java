package com.ultreon.mods.masterweapons.items;

import com.ultreon.mods.masterweapons.common.UltranMeleeWeaponBase;
import com.ultreon.mods.masterweapons.init.ModToolMaterials;
import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.NonNull;

/**
 * Ultran sword is a sword that is made of Ultran.
 * Able to kill everything in its way.
 *
 * @author Qboi
 * @see UltranToolTier
 */
public class UltranSword extends Item implements UltranMeleeWeaponBase {
    /**
     * Constructor
     */
    public UltranSword(Properties properties) {
        super(properties.sword(ModToolMaterials.ULTRAN, Float.POSITIVE_INFINITY, -2.4F));
    }

    @Override
    public float getAttackDamageBonus(@NonNull Entity entity, float f, @NonNull DamageSource damageSource) {
        return Float.POSITIVE_INFINITY;
    }

    /**
     * Get destroy speed.
     *
     * @param stack the item stack instance.
     * @param state the state of the block to check the speed for destroying a block for.
     * @return the speed to destroy a block.
     */
    @Override
    public float getDestroySpeed(@NotNull ItemStack stack, @NotNull BlockState state) {
        return Float.MAX_VALUE;
    }

    @Override
    public boolean canDestroyBlock(@NonNull ItemStack itemStack, @NonNull BlockState state, @NonNull Level level, @NonNull BlockPos pos, @NonNull LivingEntity user) {
        return false;
    }
}