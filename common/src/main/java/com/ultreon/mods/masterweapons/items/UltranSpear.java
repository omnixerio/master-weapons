package com.ultreon.mods.masterweapons.items;

import com.ultreon.mods.masterweapons.common.UltranToolBase;
import com.ultreon.mods.masterweapons.init.ModToolMaterials;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

/**
 * Ultran Hoe
 * This is not your ordinary hoe, it is a weapon. Allowing the player to kill anything in a single hit.
 *
 * @author Qboi
 * @see ModToolMaterials#ULTRAN
 */
public class UltranSpear extends Item implements UltranToolBase {
    /**
     * Constructor
     */
    public UltranSpear(Properties properties) {
        super(properties.spear(ModToolMaterials.ULTRAN, 2.0f, Float.MAX_VALUE, 0.3f, 5.0f, 1.0f, 5.0f, 5.1f, 5.0f, 4.3f));
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