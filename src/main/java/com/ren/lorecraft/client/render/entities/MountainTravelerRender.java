package com.ren.lorecraft.client.render.entities;

import com.ren.lorecraft.Lorecraft;
import com.ren.lorecraft.client.model.entities.MountainTravelerModel;
import com.ren.lorecraft.common.entities.MountainTraveler;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class MountainTravelerRender extends MobRenderer<MountainTraveler, MountainTravelerModel<MountainTraveler>> {
    private static final ResourceLocation TEXTURE = Lorecraft.modLoc("textures/entity/mountain_traveler.png");

    public MountainTravelerRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new MountainTravelerModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(MountainTraveler entity) {
        return TEXTURE;
    }
}
