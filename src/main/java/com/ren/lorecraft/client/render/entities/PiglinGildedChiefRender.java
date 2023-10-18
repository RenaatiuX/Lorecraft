package com.ren.lorecraft.client.render.entities;

import com.ren.lorecraft.Lorecraft;
import com.ren.lorecraft.client.model.entities.PiglinGildedChiefModel;
import com.ren.lorecraft.common.entities.PiglinGildedChief;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class PiglinGildedChiefRender extends MobRenderer<PiglinGildedChief, PiglinGildedChiefModel<PiglinGildedChief>> {
    private static final ResourceLocation TEXTURE = Lorecraft.modLoc("textures/entity/piglin_gilded_chief.png");

    public PiglinGildedChiefRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new PiglinGildedChiefModel<>(), 1.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(PiglinGildedChief entity) {
        return TEXTURE;
    }
}
