package com.ultreon.mods.masterweapons.init;

import com.ultreon.mods.masterweapons.MasterWeapons;
import com.ultreon.mods.masterweapons.items.*;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Supplier;

/**
 * Item initialization class.
 *
 * @author Qboi
 * @see Item
 * @since 2.0.0
 */
@SuppressWarnings("unused")
public class ModItems {
    private static final DeferredRegister<Item> REGISTER = DeferredRegister.create(MasterWeapons.MOD_ID, Registries.ITEM);
    public static final RegistrySupplier<Item> ULTRAN_SWORD = register("ultran_sword", () -> new UltranSword(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, MasterWeapons.id("ultran_sword")))));
    public static final RegistrySupplier<AxeItem> ULTRAN_AXE = register("ultran_axe", () -> new UltranAxe(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, MasterWeapons.id("ultran_axe")))));
    public static final RegistrySupplier<Item> ULTRAN_PICKAXE = register("ultran_pickaxe", () -> new UltranPickaxe(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, MasterWeapons.id("ultran_pickaxe")))));
    public static final RegistrySupplier<ShovelItem> ULTRAN_SHOVEL = register("ultran_shovel", () -> new UltranShovel(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, MasterWeapons.id("ultran_shovel")))));
    public static final RegistrySupplier<HoeItem> ULTRAN_HOE = register("ultran_hoe", () -> new UltranHoe(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, MasterWeapons.id("ultran_hoe")))));
    public static final RegistrySupplier<UltranArmor> ULTRAN_HELMET = register("ultran_helmet", () -> new UltranArmor(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, MasterWeapons.id("ultran_helmet"))), ArmorType.HELMET));
    public static final RegistrySupplier<UltranArmor> ULTRAN_CHESTPLATE = register("ultran_chestplate", () -> new UltranArmor(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, MasterWeapons.id("ultran_chestplate"))), ArmorType.CHESTPLATE));
    public static final RegistrySupplier<UltranArmor> ULTRAN_LEGGINGS = register("ultran_leggings", () -> new UltranArmor(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, MasterWeapons.id("ultran_leggings"))), ArmorType.LEGGINGS));
    public static final RegistrySupplier<UltranArmor> ULTRAN_BOOTS = register("ultran_boots", () -> new UltranArmor(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, MasterWeapons.id("ultran_boots"))), ArmorType.BOOTS));
    public static final RegistrySupplier<UltranSpear> ULTRAN_SPEAR = register("ultran_spear", () -> new UltranSpear(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, MasterWeapons.id("ultran_spear")))));
    public static final RegistrySupplier<UltranHorseArmor> ULTRAN_HORSE_ARMOR = register("ultran_horse_armor", () -> new UltranHorseArmor(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, MasterWeapons.id("ultran_horse_armor")))));
    public static final RegistrySupplier<UltranNautilusArmor> ULTRAN_NAUTILUS_ARMOR = register("ultran_nautilus_armor", () -> new UltranNautilusArmor(new Item.Properties().nautilusArmor(ModArmorMaterials.ULTRAN).setId(ResourceKey.create(Registries.ITEM, MasterWeapons.id("ultran_nautilus_armor")))));
    public static final RegistrySupplier<ArrowItem> ULTRAN_ARROW = register("ultran_arrow", () -> new UltranArrowItem(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, MasterWeapons.id("ultran_arrow")))));

    public static final RegistrySupplier<Item> RAW_ULTRAN = register("raw_ultran", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, MasterWeapons.id("raw_ultran")))));
    public static final RegistrySupplier<Item> ULTRAN_INGOT = register("ultran_ingot", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, MasterWeapons.id("ultran_ingot")))));
    public static final RegistrySupplier<Item> ULTRAN_NUGGET = register("ultran_nugget", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, MasterWeapons.id("ultran_nugget")))));

    public static final RegistrySupplier<BlockItem> ULTRAN_BLOCK = register("ultran_block", () -> new BlockItem(ModBlocks.ULTRAN_BLOCK.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, MasterWeapons.id("ultran_block")))));
    public static final RegistrySupplier<BlockItem> RAW_ULTRAN_BLOCK = register("raw_ultran_block", () -> new BlockItem(ModBlocks.RAW_ULTRAN_BLOCK.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, MasterWeapons.id("raw_ultran_block")))));
    public static final RegistrySupplier<BlockItem> ULTRAN_ORE = register("ultran_ore", () -> new BlockItem(ModBlocks.ULTRAN_ORE.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, MasterWeapons.id("ultran_ore")))));
    public static final RegistrySupplier<BlockItem> DEEPSLATE_ULTRAN_ORE = register("deepslate_ultran_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_ULTRAN_ORE.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, MasterWeapons.id("deepslate_ultran_ore")))));

    static <T extends Item> RegistrySupplier<T> register(String name, Supplier<T> supplier) {
        return REGISTER.register(name, supplier);
    }

    /**
     * Registers all items.
     */
    public static void register() {
        REGISTER.register();
    }
}
