package com.ultreon.mods.masterweapons.init;

import com.ultreon.mods.masterweapons.MasterWeapons;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    public static final TagKey<Item> REPAIRS_ULTRAN_ARMOR = bind("repairs_ultran_armor");
    public static final TagKey<Item> REPAIRS_ULTRAN_TOOL = bind("repairs_ultran_tool");

    private static TagKey<Item> bind(String name) {
        return TagKey.create(Registries.ITEM, MasterWeapons.id(name));
    }
}
