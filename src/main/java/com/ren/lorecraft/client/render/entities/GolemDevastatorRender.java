package com.ren.lorecraft.client.render.entities;

import com.ren.lorecraft.Lorecraft;
import com.ren.lorecraft.client.model.entities.GolemDevastatorModel;
import com.ren.lorecraft.common.entities.GolemDevastator;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GolemDevastatorRender extends MobRenderer<GolemDevastator, GolemDevastatorModel<GolemDevastator>> {
    private static final ResourceLocation TEXTURE = Lorecraft.modLoc("textures/entity/golem_devastator.png");

    public GolemDevastatorRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GolemDevastatorModel<>(), 1.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(GolemDevastator entity) {
        return TEXTURE;
    }
}
