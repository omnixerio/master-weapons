package com.ultreon.mods.masterweapons.items;

import com.ultreon.mods.masterweapons.init.ModArmorMaterials;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jspecify.annotations.Nullable;

public class UltranNautilusArmor extends Item {
    public UltranNautilusArmor(Properties properties) {
        super(properties.nautilusArmor(ModArmorMaterials.ULTRAN));
    }

    @Override
    public void inventoryTick(ItemStack itemStack, ServerLevel level, Entity owner, @Nullable EquipmentSlot slot) {
        super.inventoryTick(itemStack, level, owner, slot);

        if (owner instanceof LivingEntity living) {
            living.setAirSupply(living.getMaxAirSupply());
            living.setStingerCount(0);
            living.setArrowCount(0);
            living.setHealth(living.getMaxHealth());
        }
    }
}
