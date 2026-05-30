package com.ultreon.mods.masterweapons.items;

import com.ultreon.mods.masterweapons.init.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

/**
 * Ultran tool tier.
 *
 * @author Qboi
 * @since 2.0.0
 */
public class UltranToolTier implements Tier {
    /**
     * Instance
     *
     * @since 2.0.0
     */
    private static final UltranToolTier instance = new UltranToolTier();

    /**
     * Get the instance.
     *
     * @return the instance.
     * @author Qboi
     * @since 2.0.0
     */
    public static UltranToolTier getInstance() {
        return instance;
    }

    /**
     * Constructor for the Master Tier for tools and weapons.
     *
     * @author Qboi
     * @since 2.0.0
     */
    private UltranToolTier() {

    }

    /**
     * Get the maximum amount of uses.
     *
     * @return the maximum amount of uses, always positive infinity.
     * @author Qboi
     * @since 2.0.0
     */
    @Override
    public int getUses() {
        return Integer.MAX_VALUE;
    }

    /**
     * Get the speed to destroy a block.
     *
     * @return the block destroy speed, always positive infinity.
     * @author Qboi
     * @since 2.0.0
     */
    @Override
    public float getSpeed() {
        return Float.MAX_VALUE;
    }

    /**
     * Get the attack damage.
     *
     * @return the attack damage, always positive infinity.
     * @author Qboi
     * @since 2.0.0
     */
    @Override
    public float getAttackDamageBonus() {
        return Float.POSITIVE_INFINITY;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return ModBlockTags.INCORRECT_FOR_ULTRAN_TOOL;
    }

    /**
     * Get how enchantable the item is.
     *
     * @return the enchantment value, always positive infinity.
     * @author Qboi
     * @since 2.0.0
     */
    @Override
    public int getEnchantmentValue() {
        return Integer.MAX_VALUE;
    }

    /**
     * Get the repair material.
     *
     * @return an ingredient instance containing the master ingot item.
     * @author Qboi
     * @since 2.0.0
     */
    @NotNull
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(ModItems.ULTRAN_INGOT.get());
    }
}