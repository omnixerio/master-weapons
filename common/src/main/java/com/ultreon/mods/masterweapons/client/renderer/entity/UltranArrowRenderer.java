package com.ultreon.mods.masterweapons.client.renderer.entity;

import com.ultreon.mods.masterweapons.MasterWeapons;
import com.ultreon.mods.masterweapons.world.entity.projectile.UltranArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.ArrowRenderState;
import net.minecraft.resources.Identifier;
import org.jspecify.annotations.NonNull;

public class UltranArrowRenderer extends ArrowRenderer<UltranArrow, ArrowRenderState> {
    public UltranArrowRenderer(EntityRendererProvider.Context ctx) {
        super(ctx);
    }

    @Override
    public @NonNull ArrowRenderState createRenderState() {
        return new ArrowRenderState();
    }

    @Override
    protected @NonNull Identifier getTextureLocation(@NonNull ArrowRenderState state) {
        return Identifier.fromNamespaceAndPath(MasterWeapons.MOD_ID, "textures/entity/projectiles/ultran_arrow.png");
    }
}
