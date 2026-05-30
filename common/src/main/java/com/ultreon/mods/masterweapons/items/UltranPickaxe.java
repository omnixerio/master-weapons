package com.ultreon.mods.masterweapons.items;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.ultreon.mods.masterweapons.common.UltranToolBase;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import static com.ultreon.mods.masterweapons.Constants.BASE_ATTACK_KNOCKBACK_UUID;
import static com.ultreon.mods.masterweapons.Constants.TOOL_PROPERTY;

/**
 * Ultran Pickaxe
 * This pickaxe is a destroyer of planets.
 *
 * @author Qboi
 * @see UltranToolTier
 * @since 2.0.0
 */
public class UltranPickaxe extends PickaxeItem implements UltranToolBase {
    /**
     * Constructor
     *
     * @since 2.0.0
     */
    public UltranPickaxe() {
        super(UltranToolTier.getInstance(), TOOL_PROPERTY);
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