package com.ultreon.mods.masterweapons.items;

import com.ultreon.mods.masterweapons.common.UltranToolBase;
import com.ultreon.mods.masterweapons.init.ModToolMaterials;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

/**
 * Ultran Shovel
 * The ultran shovel is a destroyer of nature.
 *
 * @author Qboi
 * @see ModToolMaterials#ULTRAN
 * @since 2.0.0
 */
public class UltranShovel extends ShovelItem implements UltranToolBase {
    /**
     * Constructor
     *
     * @author Qboi
     * @since 2.0.0
     */
    public UltranShovel(Properties properties) {
        super(ModToolMaterials.ULTRAN, Float.POSITIVE_INFINITY, -2.4F, properties);
    }

    /**
     * Get destroy speed.
     *
     * @param stack the item stack instance.
     * @param state the state of the block to check the speed to destroy the block for.
     * @return the speed to destroy a block.
     * @author Qboi
     * @since 2.0.0
     */
    @Override
    public float getDestroySpeed(@NotNull ItemStack stack, @NotNull BlockState state) {
        return Float.MAX_VALUE;
    }
}