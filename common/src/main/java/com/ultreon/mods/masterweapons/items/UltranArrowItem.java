package com.ultreon.mods.masterweapons.items;

import com.ultreon.mods.masterweapons.init.ModEntities;
import com.ultreon.mods.masterweapons.world.entity.projectile.UltranArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NonNull;

public class UltranArrowItem extends ArrowItem {
    public UltranArrowItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NonNull AbstractArrow createArrow(@NonNull Level level, ItemStack itemStack, @NonNull LivingEntity livingEntity, @Nullable ItemStack itemStack2) {
        UltranArrow arrow = new UltranArrow(ModEntities.ULTRAN_ARROW.get(), livingEntity, level, itemStack.copyWithCount(1), itemStack2);
        arrow.setBaseDamage(Double.POSITIVE_INFINITY);
        return arrow;
    }

    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.world.entity.player.Player player) {
        return this.getClass() == UltranArrowItem.class;
    }
}
