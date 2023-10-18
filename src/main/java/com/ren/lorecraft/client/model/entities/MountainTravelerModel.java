package com.ren.lorecraft.client.model.entities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.ren.lorecraft.common.entities.MountainTraveler;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class MountainTravelerModel <T extends MountainTraveler> extends EntityModel<T> {

    private final ModelRenderer waist;
    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer helmet;
    private final ModelRenderer horns;
    private final ModelRenderer nose;
    private final ModelRenderer leftLeg;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightarm;
    private final ModelRenderer leftarm;

    public MountainTravelerModel() {
        textureWidth = 80;
        textureHeight = 64;

        waist = new ModelRenderer(this);
        waist.setRotationPoint(0.0F, 12.0F, 0.0F);


        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 12.0F, 0.0F);
        waist.addChild(body);
        body.setTextureOffset(39, 33).addBox(-3.0F, -25.0F, -3.0F, 6.0F, 4.0F, 6.0F, 0.5F, false);
        body.setTextureOffset(16, 20).addBox(-4.0F, -24.0F, -3.0F, 8.0F, 12.0F, 6.0F, 0.2F, false);
        body.setTextureOffset(1, 38).addBox(-4.0F, -25.0F, -3.0F, 8.0F, 20.0F, 6.0F, 0.4F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -24.0F, 0.0F);
        body.addChild(head);
        head.setTextureOffset(0, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);
        head.setTextureOffset(32, 0).addBox(-4.0F, -11.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.5F, false);

        helmet = new ModelRenderer(this);
        helmet.setRotationPoint(0.0F, -13.3394F, -4.0896F);
        head.addChild(helmet);
        setRotationAngle(helmet, 0.2182F, 0.0F, 0.0F);
        helmet.setTextureOffset(47, 45).addBox(-2.5F, -3.5F, -6.0F, 5.0F, 7.0F, 10.0F, 0.0F, false);
        helmet.setTextureOffset(49, 52).addBox(-5.0F, -2.6606F, 3.0896F, 3.0F, 2.0F, 1.0F, 0.0F, true);
        helmet.setTextureOffset(49, 52).addBox(2.0F, -2.6606F, 3.0896F, 3.0F, 2.0F, 1.0F, 0.0F, false);

        horns = new ModelRenderer(this);
        horns.setRotationPoint(0.0F, -3.8537F, 5.8436F);
        helmet.addChild(horns);
        setRotationAngle(horns, -0.9163F, 0.0F, 0.0F);
        horns.setTextureOffset(67, 2).addBox(-2.49F, -3.1463F, -0.6436F, 2.0F, 7.0F, 2.0F, 0.0F, false);
        horns.setTextureOffset(67, 2).addBox(0.49F, -3.1463F, -0.6436F, 2.0F, 7.0F, 2.0F, 0.0F, false);

        nose = new ModelRenderer(this);
        nose.setRotationPoint(0.0F, -2.0F, 0.0F);
        head.addChild(nose);
        nose.setTextureOffset(24, 0).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        leftLeg = new ModelRenderer(this);
        leftLeg.setRotationPoint(2.0F, -12.0F, 0.0F);
        body.addChild(leftLeg);
        leftLeg.setTextureOffset(0, 22).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        leftLeg.setTextureOffset(58, 32).addBox(-2.0F, 4.8F, -2.0F, 4.0F, 3.0F, 4.0F, 0.3F, false);

        rightLeg = new ModelRenderer(this);
        rightLeg.setRotationPoint(-2.0F, -12.0F, 0.0F);
        body.addChild(rightLeg);
        rightLeg.setTextureOffset(58, 32).addBox(-2.0F, 4.8F, -2.0F, 4.0F, 3.0F, 4.0F, 0.3F, true);
        rightLeg.setTextureOffset(0, 22).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

        rightarm = new ModelRenderer(this);
        rightarm.setRotationPoint(-5.0F, -22.0F, 0.0F);
        body.addChild(rightarm);
        rightarm.setTextureOffset(30, 44).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        rightarm.setTextureOffset(46, 22).addBox(-3.0F, -3.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.2F, false);
        rightarm.setTextureOffset(63, 23).addBox(-3.0F, 5.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.2F, false);

        leftarm = new ModelRenderer(this);
        leftarm.setRotationPoint(5.0F, -22.0F, 0.0F);
        body.addChild(leftarm);
        leftarm.setTextureOffset(30, 44).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
        leftarm.setTextureOffset(46, 22).addBox(-1.0F, -3.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.2F, true);
        leftarm.setTextureOffset(63, 23).addBox(-1.0F, 5.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.2F, true);
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
