package com.ultreon.mods.masterweapons.items;

import com.ultreon.mods.masterweapons.common.UltranArmorBase;
import com.ultreon.mods.masterweapons.init.ModArmorMaterials;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodData;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import static com.ultreon.mods.masterweapons.Constants.ARMOR_PROPERTY;

/**
 * Ultran Armor
 * The ultran armor isn't your average armor. It's the most powerful armor ever. Making every being invincible with more effects.
 *
 * @author Qboi
 * @see ModArmorMaterials
 * @since 2.0.0
 */
public class UltranArmor extends ArmorItem implements UltranArmorBase {

    /**
     * Constructor
     *
     * @param type the armor item type.
     * @since 2.0.0
     */
    public UltranArmor(Type type) {
        super(ModArmorMaterials.ULTRAN, type, ARMOR_PROPERTY);
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

    @Override
    public void inventoryTick(ItemStack itemStack, Level level, Entity entity, int i, boolean bl) {
        if (!(entity instanceof LivingEntity living) || !living.getItemBySlot(getEquipmentSlot()).is(this)) {
            return;
        }

        switch (getEquipmentSlot()) {
            case HEAD -> tickHeadItem(living);
            case CHEST -> tickChestItem(living);
            case LEGS, FEET -> tickMisc(living);
        }
    }

    private static void tickMisc(LivingEntity living) {
        living.setStingerCount(0);
        living.setArrowCount(0);
    }

    private static void tickHeadItem(LivingEntity living) {
        tickMisc(living);

        living.setAirSupply(living.getMaxAirSupply());
    }

    private static void tickChestItem(LivingEntity living) {
        tickMisc(living);

        living.setHealth(living.getMaxHealth());
        if (living instanceof Player player) {
            FoodData foodData = player.getFoodData();
            foodData.setFoodLevel(20);
            foodData.setExhaustion(0.0F);
            foodData.setSaturation(20.0F);
        }
    }

}