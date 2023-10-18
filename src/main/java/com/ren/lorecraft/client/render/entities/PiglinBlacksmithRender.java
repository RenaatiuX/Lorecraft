package com.ren.lorecraft.client.render.entities;

import com.ren.lorecraft.Lorecraft;
import com.ren.lorecraft.client.model.entities.PiglinBlacksmithModel;
import com.ren.lorecraft.common.entities.PiglinBlacksmith;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class PiglinBlacksmithRender extends MobRenderer<PiglinBlacksmith, PiglinBlacksmithModel<PiglinBlacksmith>> {
    private static final ResourceLocation TEXTURE = Lorecraft.modLoc("textures/entity/piglin_blacksmith.png");

    public PiglinBlacksmithRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new PiglinBlacksmithModel<>(), 1.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(PiglinBlacksmith entity) {
        return TEXTURE;
    }
}
