package com.ultreon.mods.masterweapons.mixin;

import com.ultreon.mods.masterweapons.common.UltranArmorBase;
import com.ultreon.mods.masterweapons.common.UltranToolBase;
import com.ultreon.mods.masterweapons.common.UltranWeaponBase;
import net.minecraft.core.Holder;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Mixin for {@link EnchantmentHelper}
 * This mixin is meant to intercept enchantment level checks for ultran tools and weapons.
 */
@Mixin(EnchantmentHelper.class)
public class EnchantmentHelperMixin {
    @Inject(method = "getEnchantmentLevel", at = @At("RETURN"), cancellable = true)
    private static void master_weapons$getEnchantmentLevel(Holder<Enchantment> enchantment, LivingEntity livingEntity, CallbackInfoReturnable<Integer> cir) {
        ItemStack itemInHand = livingEntity.getItemInHand(InteractionHand.MAIN_HAND);
        if (itemInHand.getItem() instanceof UltranWeaponBase) {
            if (enchantment.equals(Enchantments.LOOTING)) {
                cir.setReturnValue(10);
            } else if (enchantment.equals(Enchantments.SWEEPING_EDGE)) {
                cir.setReturnValue(5);
            } else if (enchantment.equals(Enchantments.FIRE_ASPECT)) {
                cir.setReturnValue(2);
            } else if (enchantment.equals(Enchantments.KNOCKBACK)) {
                cir.setReturnValue(10);
            } else if (enchantment.equals(Enchantments.UNBREAKING)) {
                cir.setReturnValue(10);
            }
        } else if (itemInHand.getItem() instanceof UltranToolBase) {
            if (enchantment.equals(Enchantments.FORTUNE)) {
                cir.setReturnValue(10);
            } else if (enchantment.equals(Enchantments.MENDING)) {
                cir.setReturnValue(1);
            } else if (enchantment.equals(Enchantments.UNBREAKING)) {
                cir.setReturnValue(10);
            } else if (enchantment.equals(Enchantments.FIRE_ASPECT)) {
                cir.setReturnValue(2);
            } else if (enchantment.equals(Enchantments.KNOCKBACK)) {
                cir.setReturnValue(10);
            } else if (enchantment.equals(Enchantments.SWEEPING_EDGE)) {
                cir.setReturnValue(5);
            } else if (enchantment.equals(Enchantments.LOOTING)) {
                cir.setReturnValue(10);
            }
        } else {
            for (var slot : EquipmentSlot.values()) {
                var item = livingEntity.getItemBySlot(slot);
                if (item.getItem() instanceof UltranArmorBase) {
                    if (item.getItem() instanceof ArmorItem armor) {
                        EquipmentSlot equipmentSlot = armor.getEquipmentSlot();
                        switch (equipmentSlot) {
                            case HEAD -> {
                                if (enchantment.equals(Enchantments.AQUA_AFFINITY)) {
                                    cir.setReturnValue(1);
                                } else if (enchantment.equals(Enchantments.RESPIRATION)) {
                                    cir.setReturnValue(5);
                                }
                            }
                            case FEET -> {
                                if (enchantment.equals(Enchantments.FEATHER_FALLING)) {
                                    cir.setReturnValue(100);
                                } else if (enchantment.equals(Enchantments.DEPTH_STRIDER)) {
                                    cir.setReturnValue(10);
                                }
                            }
                        }
                    }

                    if (enchantment.equals(Enchantments.MENDING)) {
                        cir.setReturnValue(1);
                    } else if (enchantment.equals(Enchantments.UNBREAKING)) {
                        cir.setReturnValue(10);
                    } else if (enchantment.equals(Enchantments.THORNS)) {
                        cir.setReturnValue(100);
                    } else if (enchantment.equals(Enchantments.PROTECTION)) {
                        cir.setReturnValue(100);
                    }
                }
            }
        }
    }
}
