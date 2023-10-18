package com.ren.lorecraft.client.render.entities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.ren.lorecraft.Lorecraft;
import com.ren.lorecraft.client.model.entities.VikingModel;
import com.ren.lorecraft.common.entities.Viking;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.HeldItemLayer;
import net.minecraft.util.ResourceLocation;

public class VikingRender extends MobRenderer<Viking, VikingModel<Viking>> {
    private static final ResourceLocation TEXTURE = Lorecraft.modLoc("textures/entity/viking.png");

    public VikingRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new VikingModel<>(), 0.5F);
        this.addLayer(new HeldItemLayer<Viking, VikingModel<Viking>>(this) {
            public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, Viking entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
                super.render(matrixStackIn, bufferIn, packedLightIn, entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch);
            }
        });
    }

    @Override
    public ResourceLocation getEntityTexture(Viking entity) {
        return TEXTURE;
    }
}
