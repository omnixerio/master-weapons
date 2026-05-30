package com.ultreon.mods.masterweapons.init;

import com.ultreon.mods.masterweapons.MasterWeapons;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Supplier;

/**
 * Block initialization class.
 *
 * @author Qboi
 * @see Block
 * @since 2.0.0
 */
@SuppressWarnings("unused")
public class ModBlocks {
    private static final DeferredRegister<Block> REGISTER = DeferredRegister.create(MasterWeapons.MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Block> ULTRAN_BLOCK = register("ultran_block", () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_RED).requiresCorrectToolForDrops().strength(200f, 6000000f)));
    public static final RegistrySupplier<Block> RAW_ULTRAN_BLOCK = register("raw_ultran_block", () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_RED).requiresCorrectToolForDrops().strength(200f, 6000000f)));
    public static final RegistrySupplier<Block> ULTRAN_ORE = register("ultran_ore", () -> new Block(Block.Properties.ofFullCopy(Blocks.STONE).requiresCorrectToolForDrops().strength(200f, 6000000f)));
    public static final RegistrySupplier<Block> DEEPSLATE_ULTRAN_ORE = register("deepslate_ultran_ore", () -> new Block(Block.Properties.ofFullCopy(Blocks.DEEPSLATE).requiresCorrectToolForDrops().strength(200f, 6000000f)));

    private static <T extends Block> RegistrySupplier<T> register(String name, Supplier<T> supplier) {
        return REGISTER.register(name, supplier);
    }

    /**
     * Registers all blocks.
     *
     * @author Qboi
     * @since 3.0.0
     */
    public static void register() {
        REGISTER.register();
    }
}