package com.ultreon.mods.masterweapons.items;

import com.ultreon.mods.masterweapons.common.UltranMeleeWeaponBase;
import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import static com.ultreon.mods.masterweapons.Constants.TOOL_PROPERTY;

/**
 * Ultran sword is a sword that is made of Ultran.
 * Able to kill everything in its way.
 *
 * @author Qboi
 * @see UltranToolTier
 */
public class UltranSword extends SwordItem implements UltranMeleeWeaponBase {
    /**
     * Constructor
     */
    public UltranSword() {
        super(UltranToolTier.getInstance(), TOOL_PROPERTY);
    }

    @Override
    public float getAttackDamageBonus(Entity entity, float f, DamageSource damageSource) {
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
    public boolean canAttackBlock(@NotNull BlockState pState, @NotNull Level pLevel, @NotNull BlockPos pPos, @NotNull Player pPlayer) {
        return false;
    }
}