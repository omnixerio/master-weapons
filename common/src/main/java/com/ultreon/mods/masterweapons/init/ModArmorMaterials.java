package com.ultreon.mods.masterweapons.init;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.Map;

/**
 * Ultran armor material.
 *
 * @author Qboi
 * @since 2.0.0
 */
public class ModArmorMaterials {
    public static final ArmorMaterial ULTRAN = new ArmorMaterial(
            Integer.MAX_VALUE,
            Map.of(
                    ArmorType.HELMET, Integer.MAX_VALUE,
                    ArmorType.CHESTPLATE, Integer.MAX_VALUE,
                    ArmorType.LEGGINGS, Integer.MAX_VALUE,
                    ArmorType.BOOTS, Integer.MAX_VALUE,
                    ArmorType.BODY, Integer.MAX_VALUE
            ),
            Integer.MAX_VALUE,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            Float.POSITIVE_INFINITY,
            Float.POSITIVE_INFINITY,
            ModItemTags.REPAIRS_ULTRAN_ARMOR,
            ModEquipmentAssets.ULTRAN
    );

    public static void register() {

    }
}
