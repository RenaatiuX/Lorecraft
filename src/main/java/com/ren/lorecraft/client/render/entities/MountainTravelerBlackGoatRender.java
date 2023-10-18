package com.ren.lorecraft.client.render.entities;

import com.ren.lorecraft.Lorecraft;
import com.ren.lorecraft.client.model.entities.MountainTravelerBlackGoatModel;
import com.ren.lorecraft.common.entities.MountainTravelerBlackGoat;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class MountainTravelerBlackGoatRender extends MobRenderer<MountainTravelerBlackGoat, MountainTravelerBlackGoatModel<MountainTravelerBlackGoat>> {
    private static final ResourceLocation TEXTURE = Lorecraft.modLoc("textures/entity/black_goat.png");
    public MountainTravelerBlackGoatRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new MountainTravelerBlackGoatModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(MountainTravelerBlackGoat entity) {
        return TEXTURE;
    }
}
