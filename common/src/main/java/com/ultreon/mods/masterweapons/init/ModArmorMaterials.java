package com.ultreon.mods.masterweapons.init;

import com.ultreon.mods.masterweapons.MasterWeapons;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.Collections;
import java.util.Map;

/**
 * Ultran armor material.
 *
 * @author Qboi
 * @since 2.0.0
 */
public class ModArmorMaterials {
    private static final DeferredRegister<ArmorMaterial> REGISTER = DeferredRegister.create(MasterWeapons.MOD_ID, Registries.ARMOR_MATERIAL);

    public static final RegistrySupplier<ArmorMaterial> ULTRAN = REGISTER.register("ultran", () -> new ArmorMaterial(
            Map.of(
                    Type.HELMET, Integer.MAX_VALUE,
                    Type.CHESTPLATE, Integer.MAX_VALUE,
                    Type.LEGGINGS, Integer.MAX_VALUE,
                    Type.BOOTS, Integer.MAX_VALUE,
                    Type.BODY, Integer.MAX_VALUE
            ),
            Integer.MAX_VALUE,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(ModItems.ULTRAN_INGOT.get()),
            Collections.singletonList(new ArmorMaterial.Layer(MasterWeapons.res("ultran"))),
            Float.POSITIVE_INFINITY,
            Float.POSITIVE_INFINITY
    ));

    public static void register() {
        REGISTER.register();
    }
}
