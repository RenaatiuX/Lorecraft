package com.ren.lorecraft.client.model.entities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.ren.lorecraft.common.entities.PiglinBlacksmith;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class PiglinBlacksmithModel <T extends PiglinBlacksmith> extends EntityModel<T> {

    private final ModelRenderer bone;
    private final ModelRenderer body;
    private final ModelRenderer left_arm;
    private final ModelRenderer weapon;
    private final ModelRenderer right_arm;
    private final ModelRenderer right_leg;
    private final ModelRenderer left_leg;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer right_ear;
    private final ModelRenderer left_ear;
    private final ModelRenderer flag;
    private final ModelRenderer bone2;
    private final ModelRenderer banner;

    public PiglinBlacksmithModel() {
        textureWidth = 180;
        textureHeight = 180;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 18.0F, 0.0F);


        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone.addChild(body);
        body.setTextureOffset(0, 53).addBox(-16.0F, -38.0F, -6.0F, 32.0F, 32.0F, 12.0F, 0.0F, false);
        body.setTextureOffset(0, 0).addBox(-16.0F, -38.0F, -6.0F, 32.0F, 39.0F, 12.0F, 0.2F, false);
        body.setTextureOffset(110, 94).addBox(-9.5F, -16.25F, -7.9F, 8.0F, 7.0F, 2.0F, -0.4F, false);
        body.setTextureOffset(88, 61).addBox(1.7F, -17.2F, -7.9F, 8.0F, 8.0F, 2.0F, -0.4F, false);
        body.setTextureOffset(91, 83).addBox(-5.0F, -19.0F, -8.9F, 10.0F, 8.0F, 3.0F, -0.4F, false);

        left_arm = new ModelRenderer(this);
        left_arm.setRotationPoint(20.0F, -32.5F, 0.0F);
        body.addChild(left_arm);
        left_arm.setTextureOffset(0, 100).addBox(-4.0F, -6.5F, -4.0F, 8.0F, 29.0F, 8.0F, 0.0F, true);
        left_arm.setTextureOffset(73, 122).addBox(-4.0F, -6.5F, -4.0F, 8.0F, 9.0F, 8.0F, 0.3F, false);
        left_arm.setTextureOffset(105, 105).addBox(-4.0F, 5.5F, -4.0F, 8.0F, 7.0F, 8.0F, 0.1F, false);

        weapon = new ModelRenderer(this);
        weapon.setRotationPoint(0.0F, 13.5F, 0.0F);
        left_arm.addChild(weapon);
        weapon.setTextureOffset(34, 122).addBox(-4.0F, 10.5F, -10.0F, 8.0F, 10.0F, 20.0F, -0.4F, false);
        weapon.setTextureOffset(131, 93).addBox(-5.5F, 9.0F, -6.0F, 11.0F, 5.0F, 12.0F, 0.0F, false);

        right_arm = new ModelRenderer(this);
        right_arm.setRotationPoint(-20.0F, -34.5F, 0.0F);
        body.addChild(right_arm);
        right_arm.setTextureOffset(88, 0).addBox(-4.0F, -2.5F, -4.0F, 8.0F, 27.0F, 8.0F, 0.0F, false);
        right_arm.setTextureOffset(73, 122).addBox(-4.0F, -4.5F, -4.0F, 8.0F, 9.0F, 8.0F, 0.3F, false);

        right_leg = new ModelRenderer(this);
        right_leg.setRotationPoint(-4.0F, -13.0F, 0.0F);
        body.addChild(right_leg);
        right_leg.setTextureOffset(98, 61).addBox(-9.5F, 7.0F, -5.0F, 10.0F, 12.0F, 10.0F, 0.0F, false);

        left_leg = new ModelRenderer(this);
        left_leg.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.addChild(left_leg);
        left_leg.setTextureOffset(98, 61).addBox(3.5F, -6.0F, -5.0F, 10.0F, 12.0F, 10.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(-0.2F, -29.3F, -1.3F);
        body.addChild(head);
        head.setTextureOffset(0, 0).addBox(-2.3F, -5.3737F, -17.7962F, 5.0F, 3.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(53, 98).addBox(-6.3F, -12.3737F, -16.7962F, 13.0F, 10.0F, 12.0F, 0.0F, false);

        jaw = new ModelRenderer(this);
        jaw.setRotationPoint(0.2F, -1.5404F, -1.7962F);
        head.addChild(jaw);
        jaw.setTextureOffset(0, 155).addBox(-8.5F, -0.8333F, -17.0F, 17.0F, 5.0F, 14.0F, 0.0F, false);
        jaw.setTextureOffset(133, 50).addBox(-8.5F, -5.8333F, -17.0F, 2.0F, 5.0F, 2.0F, 0.0F, true);
        jaw.setTextureOffset(123, 50).addBox(6.5F, -6.8333F, -17.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

        right_ear = new ModelRenderer(this);
        right_ear.setRotationPoint(-5.3F, -9.7F, -10.2F);
        head.addChild(right_ear);
        setRotationAngle(right_ear, 0.0F, 0.0F, 0.48F);
        right_ear.setTextureOffset(35, 105).addBox(-1.0F, 0.0F, -3.5F, 1.0F, 8.0F, 7.0F, 0.0F, false);

        left_ear = new ModelRenderer(this);
        left_ear.setRotationPoint(5.7F, -9.7F, -10.2F);
        head.addChild(left_ear);
        setRotationAngle(left_ear, 0.0F, 0.0F, -0.48F);
        left_ear.setTextureOffset(35, 122).addBox(0.0F, 0.0F, -3.5F, 1.0F, 8.0F, 7.0F, 0.0F, false);
        left_ear.setTextureOffset(0, 7).addBox(-1.0F, 6.5F, 2.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        left_ear.setTextureOffset(0, 7).addBox(-1.0F, 6.5F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

        flag = new ModelRenderer(this);
        flag.setRotationPoint(21.0F, -15.0F, 15.0F);
        bone.addChild(flag);
        setRotationAngle(flag, -1.5708F, -1.3526F, 1.5708F);


        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-6.0F, 21.0F, 12.0F);
        flag.addChild(bone2);
        bone2.setTextureOffset(165, 41).addBox(-0.5F, -56.75F, 8.0F, 2.0F, 35.0F, 2.0F, 0.0F, false);
        bone2.setTextureOffset(96, 42).addBox(-2.5F, -25.75F, 6.0F, 6.0F, 10.0F, 6.0F, 0.0F, false);

        banner = new ModelRenderer(this);
        banner.setRotationPoint(-3.5F, -33.0F, 13.0F);
        flag.addChild(banner);
        setRotationAngle(banner, 0.0F, 0.0F, -0.2182F);
        banner.setTextureOffset(126, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 27.0F, 16.0F, 0.0F, false);
        banner.setTextureOffset(128, 61).addBox(-2.0F, -3.75F, -3.0F, 4.0F, 4.0F, 22.0F, 0.0F, false);
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
