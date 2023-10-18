package com.ren.lorecraft.client.model.entities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.ren.lorecraft.common.entities.ArchivistScribe;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ArchivistScribeModel <T extends ArchivistScribe> extends EntityModel<T> {

    private final ModelRenderer waist;
    private final ModelRenderer Body;
    private final ModelRenderer head;
    private final ModelRenderer nose;
    private final ModelRenderer LeftLeg;
    private final ModelRenderer RightLeg;
    private final ModelRenderer RightArm;
    private final ModelRenderer LeftArm;
    private final ModelRenderer arms;

    public ArchivistScribeModel() {
        textureWidth = 64;
        textureHeight = 64;

        waist = new ModelRenderer(this);
        waist.setRotationPoint(0.0F, 12.0F, 0.0F);


        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, 12.0F, 0.0F);
        waist.addChild(Body);
        Body.setTextureOffset(0, 20).addBox(-4.0F, -24.0F, -3.0F, 8.0F, 21.0F, 6.0F, 0.1F, false);
        Body.setTextureOffset(35, 16).addBox(-4.0F, -13.0F, -3.0F, 8.0F, 0.0F, 6.0F, 0.0F, false);
        Body.setTextureOffset(28, 22).addBox(-4.0F, -24.0F, -3.0F, 8.0F, 18.0F, 6.0F, 0.3F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -12.0F, 0.0F);
        waist.addChild(head);
        head.setTextureOffset(0, 1).addBox(-4.0F, -11.0F, -4.0F, 8.0F, 11.0F, 8.0F, 0.0F, false);
        head.setTextureOffset(19, 53).addBox(0.0F, -5.0F, -4.1F, 4.0F, 5.0F, 0.0F, 0.0F, false);
        head.setTextureOffset(1, 58).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 4.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(0, 0).addBox(-5.0F, -6.0F, -4.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        head.setTextureOffset(0, 0).addBox(4.0F, -6.0F, -4.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        nose = new ModelRenderer(this);
        nose.setRotationPoint(0.0F, -2.0F, 0.0F);
        head.addChild(nose);
        nose.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        LeftLeg = new ModelRenderer(this);
        LeftLeg.setRotationPoint(2.0F, 0.0F, 0.0F);
        waist.addChild(LeftLeg);
        LeftLeg.setTextureOffset(27, 47).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);

        RightLeg = new ModelRenderer(this);
        RightLeg.setRotationPoint(-2.0F, 0.0F, 0.0F);
        waist.addChild(RightLeg);
        RightLeg.setTextureOffset(27, 47).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);

        RightArm = new ModelRenderer(this);
        RightArm.setRotationPoint(-5.0F, -9.0F, 0.0F);
        waist.addChild(RightArm);
        RightArm.setTextureOffset(33, 0).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 3.0F, 0.0F, false);
        RightArm.setTextureOffset(0, 49).addBox(-2.5F, -3.0F, -3.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);

        LeftArm = new ModelRenderer(this);
        LeftArm.setRotationPoint(5.0F, -9.0F, 0.0F);
        waist.addChild(LeftArm);
        LeftArm.setTextureOffset(33, 0).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 3.0F, 0.0F, false);
        LeftArm.setTextureOffset(0, 49).addBox(-1.5F, -3.0F, -3.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);

        arms = new ModelRenderer(this);
        arms.setRotationPoint(0.0F, 12.0F, 0.0F);
        waist.addChild(arms);
        arms.setTextureOffset(46, 4).addBox(-7.0F, -23.0F, -2.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);
        arms.setTextureOffset(46, 4).addBox(4.0F, -23.0F, -2.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);
        arms.setTextureOffset(42, 50).addBox(-4.0F, -18.0F, -2.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
        arms.setTextureOffset(0, 49).addBox(-7.5F, -24.0F, -3.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);
        arms.setTextureOffset(0, 49).addBox(3.5F, -24.0F, -3.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        waist.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
