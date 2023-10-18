package com.ren.lorecraft.client.model.entities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.ren.lorecraft.common.entities.MaraudingMerchant;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class MaraudingMerchantModel <T extends MaraudingMerchant> extends EntityModel<T> {
    private final ModelRenderer waist;
    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer nose;
    private final ModelRenderer leftLeg;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightarm;
    private final ModelRenderer arms;
    private final ModelRenderer leftarm;
    private final ModelRenderer backpack;
    private final ModelRenderer pack;
    private final ModelRenderer paloconlinterna;
    private final ModelRenderer bone2;
    private final ModelRenderer cube_r1;
    private final ModelRenderer bone3;
    private final ModelRenderer chain;
    private final ModelRenderer cube_r2;
    private final ModelRenderer ware;
    private final ModelRenderer cube_r3;

    public MaraudingMerchantModel() {
        textureWidth = 124;
        textureHeight = 68;

        waist = new ModelRenderer(this);
        waist.setRotationPoint(0.0F, 12.0F, 0.0F);


        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 12.0F, 0.0F);
        waist.addChild(body);
        body.setTextureOffset(16, 21).addBox(-4.0F, -24.0F, -3.0F, 8.0F, 12.0F, 6.0F, 0.0F, false);
        body.setTextureOffset(0, 40).addBox(-4.0F, -24.0F, -3.0F, 8.0F, 18.0F, 6.0F, 0.45F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -24.0F, 0.0F);
        body.addChild(head);
        head.setTextureOffset(0, 2).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);
        head.setTextureOffset(32, 2).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.55F, false);

        nose = new ModelRenderer(this);
        nose.setRotationPoint(0.0F, -2.0F, 0.0F);
        head.addChild(nose);
        nose.setTextureOffset(25, 2).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        leftLeg = new ModelRenderer(this);
        leftLeg.setRotationPoint(2.0F, -12.0F, 0.0F);
        body.addChild(leftLeg);
        leftLeg.setTextureOffset(0, 23).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

        rightLeg = new ModelRenderer(this);
        rightLeg.setRotationPoint(-2.0F, -12.0F, 0.0F);
        body.addChild(rightLeg);
        rightLeg.setTextureOffset(0, 23).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        rightarm = new ModelRenderer(this);
        rightarm.setRotationPoint(-5.0F, -22.0F, 0.0F);
        body.addChild(rightarm);
        rightarm.setTextureOffset(29, 40).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        arms = new ModelRenderer(this);
        arms.setRotationPoint(0.0F, -19.3333F, 0.0F);
        body.addChild(arms);
        arms.setTextureOffset(46, 44).addBox(-8.0F, -4.6667F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
        arms.setTextureOffset(46, 44).addBox(4.0F, -4.6667F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);
        arms.setTextureOffset(30, 57).addBox(-4.0F, -0.6667F, -2.0F, 8.0F, 4.0F, 4.0F, 0.0F, false);

        leftarm = new ModelRenderer(this);
        leftarm.setRotationPoint(5.0F, -22.0F, 0.0F);
        body.addChild(leftarm);
        leftarm.setTextureOffset(29, 40).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

        backpack = new ModelRenderer(this);
        backpack.setRotationPoint(-11.0F, -8.0F, -1.0F);
        waist.addChild(backpack);


        pack = new ModelRenderer(this);
        pack.setRotationPoint(0.0F, -1.0F, 0.0F);
        backpack.addChild(pack);
        pack.setTextureOffset(66, 27).addBox(3.0F, -4.0F, 4.5F, 16.0F, 12.0F, 8.0F, 0.0F, false);
        pack.setTextureOffset(72, 0).addBox(2.5F, 6.6F, 4.0F, 17.0F, 7.0F, 9.0F, -0.4F, false);
        pack.setTextureOffset(70, 16).addBox(5.0F, 8.0F, 4.5F, 12.0F, 5.0F, 6.0F, 0.0F, false);
        pack.setTextureOffset(84, 51).addBox(4.0F, -9.0F, 5.5F, 14.0F, 5.0F, 5.0F, 0.0F, false);
        pack.setTextureOffset(116, 31).addBox(19.0F, -17.0F, 5.5F, 2.0F, 18.0F, 2.0F, 0.0F, false);

        paloconlinterna = new ModelRenderer(this);
        paloconlinterna.setRotationPoint(2.4F, -8.0F, -3.0F);
        backpack.addChild(paloconlinterna);
        setRotationAngle(paloconlinterna, -1.5708F, -1.309F, 1.5708F);
        paloconlinterna.setTextureOffset(67, 52).addBox(-6.4F, -7.0F, -1.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-4.4F, -8.5F, 1.0F);
        paloconlinterna.addChild(bone2);
        setRotationAngle(bone2, 0.0F, 0.7854F, 0.0F);
        bone2.setTextureOffset(83, 51).addBox(0.0F, -0.5F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone2.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
        cube_r1.setTextureOffset(83, 51).addBox(0.0F, -0.5F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, true);

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(-6.4F, 1.0F, -1.0F);
        paloconlinterna.addChild(bone3);
        setRotationAngle(bone3, 0.0F, 0.0087F, 0.5585F);
        bone3.setTextureOffset(56, 62).addBox(-5.0F, -11.0F, 1.0F, 18.0F, 2.0F, 2.0F, 0.0F, false);
        bone3.setTextureOffset(70, 47).addBox(12.0F, -11.0F, 1.0F, 5.0F, 2.0F, 2.0F, 0.5F, false);

        chain = new ModelRenderer(this);
        chain.setRotationPoint(3.0F, 0.0F, 0.0F);
        bone3.addChild(chain);
        setRotationAngle(chain, 0.0F, 0.0F, -0.3927F);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        chain.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, -0.4363F);
        cube_r2.setTextureOffset(57, -3).addBox(6.0F, -7.0F, 0.5F, 0.0F, 9.0F, 3.0F, 0.0F, false);

        ware = new ModelRenderer(this);
        ware.setRotationPoint(2.4F, -8.0F, -3.0F);
        backpack.addChild(ware);
        ware.setTextureOffset(53, 31).addBox(16.6F, 11.0F, 11.0F, 2.0F, 7.0F, 3.0F, 0.0F, false);
        ware.setTextureOffset(53, 31).addBox(16.6F, 11.0F, 8.0F, 2.0F, 7.0F, 3.0F, 0.0F, false);
        ware.setTextureOffset(46, 22).addBox(-0.4F, 11.0F, 10.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
        ware.setTextureOffset(50, 25).addBox(-0.4F, 17.0F, 13.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        ware.setTextureOffset(50, 25).addBox(-0.4F, 17.0F, 10.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        ware.setTextureOffset(50, 25).addBox(-0.4F, 14.0F, 9.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
        ware.setTextureOffset(45, 25).addBox(-0.4F, 14.0F, 14.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
        ware.setTextureOffset(46, 22).addBox(-0.4F, 11.0F, 13.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
        ware.setTextureOffset(46, 17).addBox(0.6F, 11.0F, 9.0F, 0.0F, 7.0F, 5.0F, 0.0F, false);
        ware.setTextureOffset(46, 17).addBox(-0.4F, 11.0F, 9.0F, 0.0F, 7.0F, 5.0F, 0.0F, true);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-2.4F, 8.0F, 3.0F);
        ware.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 1.5708F, 0.0F);
        cube_r3.setTextureOffset(46, 22).addBox(-10.0F, 3.0F, 2.0F, 3.0F, 0.0F, 1.0F, 0.0F, false);
        cube_r3.setTextureOffset(46, 28).addBox(-10.0F, 10.0F, 2.0F, 3.0F, 0.0F, 1.0F, 0.0F, false);
        cube_r3.setTextureOffset(45, 25).addBox(-11.0F, 6.0F, 2.0F, 5.0F, 0.0F, 1.0F, 0.0F, false);
        cube_r3.setTextureOffset(45, 27).addBox(-11.0F, 9.0F, 2.0F, 5.0F, 0.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

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
