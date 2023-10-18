package com.ren.lorecraft.client.render.entities;

import com.ren.lorecraft.Lorecraft;
import com.ren.lorecraft.client.model.entities.ArchivistScribeModel;
import com.ren.lorecraft.common.entities.ArchivistScribe;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ArchivistScribeRender extends MobRenderer<ArchivistScribe, ArchivistScribeModel<ArchivistScribe>> {
    private static final ResourceLocation TEXTURE = Lorecraft.modLoc("textures/entity/archivist.png");

    public ArchivistScribeRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ArchivistScribeModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(ArchivistScribe entity) {
        return TEXTURE;
    }
}
