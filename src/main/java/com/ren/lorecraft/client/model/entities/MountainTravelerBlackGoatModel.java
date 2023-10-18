package com.ren.lorecraft.client.model.entities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.ren.lorecraft.common.entities.MountainTravelerBlackGoat;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class MountainTravelerBlackGoatModel<T extends MountainTravelerBlackGoat> extends EntityModel<T> {

    private final ModelRenderer left_back_leg;
    private final ModelRenderer right_back_leg;
    private final ModelRenderer right_front_leg;
    private final ModelRenderer left_front_leg;
    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer head_r1;
    private final ModelRenderer head_main;

    public MountainTravelerBlackGoatModel() {
        textureWidth = 64;
        textureHeight = 64;

        left_back_leg = new ModelRenderer(this);
        left_back_leg.setRotationPoint(1.0F, 14.0F, 4.0F);
        left_back_leg.setTextureOffset(36, 29).addBox(0.0F, 4.0F, 0.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);

        right_back_leg = new ModelRenderer(this);
        right_back_leg.setRotationPoint(-3.0F, 14.0F, 4.0F);
        right_back_leg.setTextureOffset(49, 29).addBox(0.0F, 4.0F, 0.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);

        right_front_leg = new ModelRenderer(this);
        right_front_leg.setRotationPoint(-3.0F, 14.0F, -6.0F);
        right_front_leg.setTextureOffset(49, 2).addBox(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F, 0.0F, false);

        left_front_leg = new ModelRenderer(this);
        left_front_leg.setRotationPoint(1.0F, 14.0F, -6.0F);
        left_front_leg.setTextureOffset(35, 2).addBox(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(1, 1).addBox(-4.0F, -17.0F, -7.0F, 9.0F, 11.0F, 16.0F, 0.0F, false);
        body.setTextureOffset(0, 28).addBox(-5.0F, -18.0F, -8.0F, 11.0F, 14.0F, 11.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(1.0F, 14.0F, 0.0F);
        head.setTextureOffset(12, 55).addBox(-2.99F, -16.0F, -10.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(12, 55).addBox(-0.01F, -16.0F, -10.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(2, 61).addBox(2.0F, -11.0F, -10.0F, 3.0F, 2.0F, 1.0F, 0.0F, true);
        head.setTextureOffset(2, 61).addBox(-6.0F, -11.0F, -10.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(23, 52).addBox(-0.5F, -3.0F, -14.0F, 0.0F, 7.0F, 5.0F, 0.0F, false);

        head_r1 = new ModelRenderer(this);
        head_r1.setRotationPoint(0.0F, -8.0F, -8.0F);
        head.addChild(head_r1);
        setRotationAngle(head_r1, 0.9599F, 0.0F, 0.0F);
        head_r1.setTextureOffset(34, 46).addBox(-3.0F, -4.0F, -8.0F, 5.0F, 7.0F, 10.0F, 0.0F, false);

        head_main = new ModelRenderer(this);
        head_main.setRotationPoint(0.0F, -8.0F, -8.0F);
        head.addChild(head_main);
        setRotationAngle(head_main, 0.9599F, 0.0F, 0.0F);
        head_main.setTextureOffset(34, 46).addBox(-3.0F, -4.0F, -8.0F, 5.0F, 7.0F, 10.0F, 0.0F, false);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        left_back_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        right_back_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        right_front_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        left_front_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }
}
