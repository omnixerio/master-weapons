package com.ultreon.mods.masterweapons;

import com.ultreon.mods.masterweapons.client.ClientEvents;
import com.ultreon.mods.masterweapons.client.ClientInitialization;
import com.ultreon.mods.masterweapons.init.ModArmorMaterials;
import com.ultreon.mods.masterweapons.init.ModBlocks;
import com.ultreon.mods.masterweapons.init.ModEntities;
import com.ultreon.mods.masterweapons.init.ModItems;
import com.ultreon.mods.masterweapons.items.creativetab.CreativeTabModifiers;
import com.ultreon.mods.masterweapons.world.gen.WorldGeneration;
import dev.architectury.event.events.common.LifecycleEvent;
import dev.architectury.utils.Env;
import dev.architectury.utils.EnvExecutor;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

/**
 * Master Weapons main mod class.
 *
 * @author Qboi
 */
public class MasterWeapons {
    public static final String MOD_ID = "masterweapons";
    public static final String MOD_NAME = "Master Weapons";
    public static final Logger LOGGER = LoggerFactory.getLogger(MasterWeapons.class.getSimpleName());
    private static final Marker INIT_MARKER = MarkerFactory.getMarker("Init");
    private static final Marker LOAD_MARKER = MarkerFactory.getMarker("Load");
    private static final Marker SETUP_MARKER = MarkerFactory.getMarker("Setup");
    private static final Marker CLIENT_MARKER = MarkerFactory.getMarker("Client");
    private static final Marker SERVER_MARKER = MarkerFactory.getMarker("Server");
    private static final MasterWeapons INSTANCE = new MasterWeapons();
    private CommonEvents commonEvents;

    /**
     * DO NOT INVOKE, THIS IS FOR MOD LOADING ONLY.
     * <p>
     * This method is called by Forge when the mod is loaded.
     * </p>
     */
    public MasterWeapons() {

    }

    public void init() {
        LOGGER.info(INIT_MARKER, "Just loaded Master Weapons Mod initializer.");

        // Registering event handlers to mod eventbus.
        LOGGER.info(INIT_MARKER, "Registering event handlers to mod eventbus.");

        ModBlocks.register();
        ModItems.register();
        ModEntities.register();
        ModArmorMaterials.register();

        LOGGER.info(INIT_MARKER, "Initialized Master Weapons Mod.");

        commonEvents = new CommonEvents();
        EnvExecutor.runInEnv(Env.CLIENT, () -> () -> {
            ClientEvents.nopInit();
            ClientInitialization.nopInit();
        });

        LifecycleEvent.SETUP.register(this::setup);
    }

    private void setup() {
        LOGGER.info(SETUP_MARKER, "Initializing world generation stuffs.");
        WorldGeneration.init();

        LOGGER.info(SETUP_MARKER, "Modifying creative tabs.");
        CreativeTabModifiers.modifyCreativeTabs();
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }

    public CommonEvents getCommonEvents() {
        return commonEvents;
    }

    public static MasterWeapons get() {
        return INSTANCE;
    }
}