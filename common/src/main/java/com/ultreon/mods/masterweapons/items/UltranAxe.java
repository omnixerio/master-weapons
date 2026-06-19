package com.ultreon.mods.masterweapons.items;

import com.ultreon.mods.masterweapons.common.UltranToolBase;
import com.ultreon.mods.masterweapons.init.ModToolMaterials;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

/**
 * Ultran Axe
 * The ultran axe is not just a tool or weapon, it's a super weapon.
 *
 * @author Qboi
 * @see ModToolMaterials#ULTRAN
 */
public class UltranAxe extends AxeItem implements UltranToolBase {
    /**
     * Constructor
     */
    public UltranAxe(Properties properties) {
        super(ModToolMaterials.ULTRAN, 10.0F, -2.4F, properties);
    }

    /**
     * Get destroy speed.
     *
     * @param stack the item stack instance.
     * @param state the state of the block to check the speed to destroy the block for.
     * @return the speed to destroy a block.
     */
    @Override
    public float getDestroySpeed(@NotNull ItemStack stack, @NotNull BlockState state) {
        return Float.MAX_VALUE;
    }
}