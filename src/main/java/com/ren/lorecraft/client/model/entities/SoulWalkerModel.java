package com.ren.lorecraft.client.model.entities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.ren.lorecraft.common.entities.SoulWalker;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class SoulWalkerModel<T extends SoulWalker> extends EntityModel<T> {
    private final ModelRenderer Head;
    private final ModelRenderer Body;
    private final ModelRenderer RightArm;
    private final ModelRenderer LeftArm;
    private final ModelRenderer RightLeg;
    private final ModelRenderer LeftLeg;

    public SoulWalkerModel() {
        textureWidth = 64;
        textureHeight = 64;

        Head = new ModelRenderer(this);
        Head.setRotationPoint(0.0F, 0.0F, -2.0F);
        Head.setTextureOffset(0, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);

        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, 0.0F, -2.0F);
        setRotationAngle(Body, 0.2618F, 0.0F, 0.0F);
        Body.setTextureOffset(0, 18).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
        Body.setTextureOffset(26, 18).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.1F, false);

        RightArm = new ModelRenderer(this);
        RightArm.setRotationPoint(-5.0F, 2.0F, -2.0F);
        setRotationAngle(RightArm, -0.4363F, 0.0F, 0.0F);
        RightArm.setTextureOffset(0, 35).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 15.0F, 4.0F, 0.0F, false);
        RightArm.setTextureOffset(32, 36).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 15.0F, 4.0F, 0.05F, false);
        RightArm.setTextureOffset(54, 47).addBox(-3.0F, 10.0F, 2.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);

        LeftArm = new ModelRenderer(this);
        LeftArm.setRotationPoint(5.0F, 2.0F, -2.0F);
        setRotationAngle(LeftArm, -0.2182F, 0.0F, 0.0F);
        LeftArm.setTextureOffset(16, 35).addBox(-1.0F, -3.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);
        LeftArm.setTextureOffset(32, 36).addBox(-1.0F, -3.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.05F, true);
        LeftArm.setTextureOffset(54, 41).addBox(-1.0F, 10.0F, 2.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);

        RightLeg = new ModelRenderer(this);
        RightLeg.setRotationPoint(-1.9F, 11.0F, 4.0F);
        setRotationAngle(RightLeg, 0.2443F, 0.0F, 0.0F);
        RightLeg.setTextureOffset(48, 0).addBox(-2.0F, 0.0F, -5.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        LeftLeg = new ModelRenderer(this);
        LeftLeg.setRotationPoint(1.9F, 12.0F, 1.0F);
        setRotationAngle(LeftLeg, -0.2443F, 0.0F, 0.0F);
        LeftLeg.setTextureOffset(32, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {


    }


    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
