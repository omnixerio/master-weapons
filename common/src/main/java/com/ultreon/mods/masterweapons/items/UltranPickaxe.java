package com.ultreon.mods.masterweapons.items;

import com.ultreon.mods.masterweapons.common.UltranToolBase;
import com.ultreon.mods.masterweapons.init.ModToolMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

/**
 * Ultran Pickaxe
 * This pickaxe is a destroyer of planets.
 *
 * @author Qboi
 * @see UltranToolTier
 * @since 2.0.0
 */
public class UltranPickaxe extends Item implements UltranToolBase {
    /**
     * Constructor
     *
     * @since 2.0.0
     */
    public UltranPickaxe(Properties properties) {
        super(properties.pickaxe(ModToolMaterials.ULTRAN, Float.POSITIVE_INFINITY, -2.4F));
    }

    /**
     * Get destroy speed.
     *
     * @param stack the item stack instance.
     * @param state the state of the block to check the speed to destroy the block for.
     * @return the speed to destroy a block.
     * @since 2.0.0
     */
    @Override
    public float getDestroySpeed(@NotNull ItemStack stack, @NotNull BlockState state) {
        return Float.MAX_VALUE;
    }
}