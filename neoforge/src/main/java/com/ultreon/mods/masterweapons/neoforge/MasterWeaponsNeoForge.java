package com.ultreon.mods.masterweapons.neoforge;

import com.ultreon.mods.masterweapons.MasterWeapons;
import com.ultreon.mods.masterweapons.debug.Debugger;
import dev.architectury.platform.Platform;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.level.ChunkEvent;

@Mod(MasterWeapons.MOD_ID)
public class MasterWeaponsNeoForge {
    public MasterWeaponsNeoForge(IEventBus modBus) {
        // Submit our event bus to let architectury register our content on the right time
        MasterWeapons masterWeapons = MasterWeapons.get();
        masterWeapons.init();

        if (Platform.isDevelopmentEnvironment()) {
            NeoForge.EVENT_BUS.addListener(this::onChunkLoad);
        }
    }

    private void onChunkLoad(ChunkEvent.Load event) {
        Debugger.onChunkLoad(event.getLevel(), event.getChunk());
    }
}
