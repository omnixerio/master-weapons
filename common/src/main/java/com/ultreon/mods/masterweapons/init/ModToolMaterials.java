package com.ultreon.mods.masterweapons.init;

import com.ultreon.mods.masterweapons.items.ModBlockTags;
import net.minecraft.world.item.ToolMaterial;

public class ModToolMaterials {
    public static final ToolMaterial ULTRAN = new ToolMaterial(
            ModBlockTags.INCORRECT_FOR_ULTRAN_TOOL,
            Integer.MAX_VALUE,
            Float.POSITIVE_INFINITY,
            Float.POSITIVE_INFINITY,
            Integer.MAX_VALUE,
            ModItemTags.REPAIRS_ULTRAN_TOOL
    );
}
