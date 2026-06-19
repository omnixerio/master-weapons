package com.ultreon.mods.masterweapons.init;

import com.ultreon.mods.masterweapons.MasterWeapons;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

public class ModEquipmentAssets {
    public static final ResourceKey<EquipmentAsset> ULTRAN = createId("ultran");

    private static ResourceKey<EquipmentAsset> createId(String name) {
        return ResourceKey.create(EquipmentAssets.ROOT_ID, MasterWeapons.id(name));
    }
}
