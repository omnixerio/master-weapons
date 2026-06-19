package com.ultreon.mods.masterweapons.items;

import com.ultreon.mods.masterweapons.MasterWeapons;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {
    public static final TagKey<Block> INCORRECT_FOR_ULTRAN_TOOL = create("incorrect_for_ultran_tool");

    private static TagKey<Block> create(String string) {
        return TagKey.create(Registries.BLOCK, MasterWeapons.id(string));
    }
}
