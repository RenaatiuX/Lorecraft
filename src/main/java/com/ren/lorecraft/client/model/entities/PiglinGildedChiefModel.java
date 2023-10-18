package com.ren.lorecraft.client.model.entities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.ren.lorecraft.common.entities.PiglinGildedChief;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class PiglinGildedChiefModel <T extends PiglinGildedChief> extends EntityModel<T> {

    private final ModelRenderer bone;
    private final ModelRenderer body;
    private final ModelRenderer falda_r1;
    private final ModelRenderer necklace_r1;
    private final ModelRenderer bone2;
    private final ModelRenderer cinturon;
    private final ModelRenderer arms;
    private final ModelRenderer left_arm;
    private final ModelRenderer armorer_arm;
    private final ModelRenderer right_arm;
    private final ModelRenderer meal;
    private final ModelRenderer left_leg;
    private final ModelRenderer cube_r1;
    private final ModelRenderer right_leg;
    private final ModelRenderer cube_r2;
    private final ModelRenderer head;
    private final ModelRenderer crown;
    private final ModelRenderer jaw;
    private final ModelRenderer earleft;
    private final ModelRenderer earL_r1;
    private final ModelRenderer earright;
    private final ModelRenderer earR_r1;

    public PiglinGildedChiefModel() {
        textureWidth = 160;
        textureHeight = 160;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(1.0F, 5.0F, -4.0F);
        setRotationAngle(bone, -0.1309F, 0.0F, 0.0F);


        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone.addChild(body);


        falda_r1 = new ModelRenderer(this);
        falda_r1.setRotationPoint(-1.0F, -19.5F, 4.0F);
        body.addChild(falda_r1);
        setRotationAngle(falda_r1, 0.1309F, 0.0F, 0.0F);
        falda_r1.setTextureOffset(0, 0).addBox(-12.0F, 10.1F, -12.0F, 24.0F, 23.0F, 20.0F, 0.4F, false);
        falda_r1.setTextureOffset(75, 68).addBox(-12.0F, -6.5F, -5.0F, 24.0F, 10.0F, 13.0F, 0.0F, false);
        falda_r1.setTextureOffset(0, 43).addBox(-12.0F, 3.5F, -12.0F, 24.0F, 18.0F, 20.0F, 0.0F, false);

        necklace_r1 = new ModelRenderer(this);
        necklace_r1.setRotationPoint(-1.0F, -19.5F, 4.0F);
        body.addChild(necklace_r1);
        setRotationAngle(necklace_r1, -0.4363F, 0.0F, 0.0F);
        necklace_r1.setTextureOffset(116, 0).addBox(-11.0F, -8.5F, -9.2F, 22.0F, 14.0F, 0.0F, 0.0F, false);
        necklace_r1.setTextureOffset(76, 31).addBox(-12.0F, -9.6F, -8.9F, 24.0F, 17.0F, 12.0F, 0.2F, false);

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-1.0F, 16.0F, 3.0F);
        body.addChild(bone2);
        setRotationAngle(bone2, 0.1309F, 0.0F, 0.0F);
        bone2.setTextureOffset(38, 81).addBox(-1.3F, -22.2F, -8.9F, 8.0F, 8.0F, 2.0F, -0.4F, false);
        bone2.setTextureOffset(26, 106).addBox(-7.5F, -20.25F, -7.9F, 8.0F, 7.0F, 2.0F, -0.4F, false);

        cinturon = new ModelRenderer(this);
        cinturon.setRotationPoint(1.0F, 0.0F, 2.0F);
        body.addChild(cinturon);


        arms = new ModelRenderer(this);
        arms.setRotationPoint(13.0F, -27.0F, 8.0F);
        bone.addChild(arms);


        left_arm = new ModelRenderer(this);
        left_arm.setRotationPoint(15.0F, -7.0F, 0.0F);
        arms.addChild(left_arm);
        setRotationAngle(left_arm, -0.0873F, 0.0F, -0.1745F);
        left_arm.setTextureOffset(82, 91).addBox(-18.0F, -1.0F, -7.0F, 8.0F, 28.0F, 8.0F, 0.0F, false);

        armorer_arm = new ModelRenderer(this);
        armorer_arm.setRotationPoint(-8.6667F, 5.0667F, -3.0F);
        left_arm.addChild(armorer_arm);
        armorer_arm.setTextureOffset(120, 14).addBox(-7.3333F, 1.9233F, -5.0F, 7.0F, 4.0F, 10.0F, 0.0F, false);
        armorer_arm.setTextureOffset(104, 118).addBox(-11.3333F, -6.0767F, -5.0F, 11.0F, 8.0F, 10.0F, 0.0F, false);
        armorer_arm.setTextureOffset(68, 0).addBox(-0.3333F, -0.2667F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
        armorer_arm.setTextureOffset(68, 0).addBox(-0.3333F, -5.2667F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
        armorer_arm.setTextureOffset(88, 60).addBox(1.6667F, -4.7667F, -1.5F, 7.0F, 3.0F, 3.0F, 0.0F, false);
        armorer_arm.setTextureOffset(106, 91).addBox(1.6667F, 0.2333F, -1.5F, 5.0F, 3.0F, 3.0F, 0.0F, false);

        right_arm = new ModelRenderer(this);
        right_arm.setRotationPoint(-16.0F, 0.0F, 0.0F);
        arms.addChild(right_arm);
        setRotationAngle(right_arm, -0.0873F, 0.0F, 0.1745F);
        right_arm.setTextureOffset(50, 83).addBox(-18.0F, -3.0F, -7.0F, 8.0F, 28.0F, 8.0F, 0.0F, false);
        right_arm.setTextureOffset(36, 119).addBox(-18.0F, -3.0F, -7.0F, 8.0F, 12.0F, 8.0F, 0.2F, false);

        meal = new ModelRenderer(this);
        meal.setRotationPoint(-13.0F, 25.0F, 0.0F);
        right_arm.addChild(meal);
        setRotationAngle(meal, -1.5708F, 0.0F, 0.0F);
        meal.setTextureOffset(0, 156).addBox(-4.0F, -4.0F, -1.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
        meal.setTextureOffset(0, 142).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
        meal.setTextureOffset(8, 136).addBox(-5.0F, 10.0F, -4.0F, 8.0F, 12.0F, 8.0F, 0.0F, false);

        left_leg = new ModelRenderer(this);
        left_leg.setRotationPoint(5.0F, 0.0F, 0.0F);
        bone.addChild(left_leg);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        left_leg.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(114, 91).addBox(-4.0F, 2.0F, -1.0F, 8.0F, 17.0F, 10.0F, 0.0F, false);

        right_leg = new ModelRenderer(this);
        right_leg.setRotationPoint(-5.0F, 0.0F, 0.0F);
        bone.addChild(right_leg);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        right_leg.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        cube_r2.setTextureOffset(0, 105).addBox(-6.0F, 2.0F, -1.0F, 8.0F, 17.0F, 10.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(-1.2F, -27.3F, -2.3F);
        bone.addChild(head);
        setRotationAngle(head, 0.1745F, 0.0F, 0.0F);
        head.setTextureOffset(68, 8).addBox(-2.3F, -6.7F, -9.7F, 5.0F, 3.0F, 1.0F, 0.0F, false);

        crown = new ModelRenderer(this);
        crown.setRotationPoint(0.2F, -9.7F, -1.7F);
        head.addChild(crown);
        crown.setTextureOffset(0, 82).addBox(-6.5F, -4.0F, -7.0F, 13.0F, 10.0F, 12.0F, 0.0F, false);
        crown.setTextureOffset(88, 19).addBox(-2.5F, -11.0F, -4.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
        crown.setTextureOffset(5, 0).addBox(-2.5F, -8.0F, -4.0F, 5.0F, 0.0F, 5.0F, 0.0F, false);

        jaw = new ModelRenderer(this);
        jaw.setRotationPoint(0.2F, -3.7F, 0.3F);
        head.addChild(jaw);
        jaw.setTextureOffset(68, 0).addBox(-8.5F, 0.0F, -11.0F, 17.0F, 5.0F, 14.0F, 0.0F, false);
        jaw.setTextureOffset(0, 43).addBox(-8.5F, -4.0F, -11.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        jaw.setTextureOffset(0, 0).addBox(6.5F, -6.0F, -11.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

        earleft = new ModelRenderer(this);
        earleft.setRotationPoint(8.2F, -9.7F, -1.7F);
        head.addChild(earleft);


        earL_r1 = new ModelRenderer(this);
        earL_r1.setRotationPoint(-1.8869F, -5.5722F, 0.0F);
        earleft.addChild(earL_r1);
        setRotationAngle(earL_r1, 0.0F, 0.0F, -0.3927F);
        earL_r1.setTextureOffset(0, 43).addBox(-1.6131F, 3.5722F, -5.0F, 1.0F, 10.0F, 8.0F, 0.0F, false);

        earright = new ModelRenderer(this);
        earright.setRotationPoint(-5.0F, -7.0F, -23.0F);
        head.addChild(earright);


        earR_r1 = new ModelRenderer(this);
        earR_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        earright.addChild(earR_r1);
        setRotationAngle(earR_r1, 0.0F, 0.0F, 0.3927F);
        earR_r1.setTextureOffset(0, 0).addBox(-3.3F, -3.7F, 16.3F, 1.0F, 10.0F, 8.0F, 0.0F, true);
    }

    @Override
    public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
