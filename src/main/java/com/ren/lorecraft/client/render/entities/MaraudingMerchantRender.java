package com.ren.lorecraft.client.render.entities;

import com.ren.lorecraft.Lorecraft;
import com.ren.lorecraft.client.model.entities.MaraudingMerchantModel;
import com.ren.lorecraft.common.entities.MaraudingMerchant;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class MaraudingMerchantRender extends MobRenderer<MaraudingMerchant, MaraudingMerchantModel<MaraudingMerchant>> {
    private static final ResourceLocation TEXTURE = Lorecraft.modLoc("textures/entity/marauding_merchant.png");
    public MaraudingMerchantRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new MaraudingMerchantModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(MaraudingMerchant entity) {
        return TEXTURE;
    }
}
