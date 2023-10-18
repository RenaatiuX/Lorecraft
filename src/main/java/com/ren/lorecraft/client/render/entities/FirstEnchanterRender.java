package com.ren.lorecraft.client.render.entities;

import com.ren.lorecraft.Lorecraft;
import com.ren.lorecraft.client.model.entities.FirstEnchanterModel;
import com.ren.lorecraft.common.entities.FirstEnchanter;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class FirstEnchanterRender extends MobRenderer<FirstEnchanter, FirstEnchanterModel<FirstEnchanter>> {

    private static final ResourceLocation TEXTURE = Lorecraft.modLoc("textures/entity/first_enchanter.png");

    public FirstEnchanterRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new FirstEnchanterModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(FirstEnchanter entity) {
        return TEXTURE;
    }
}
