package com.ren.lorecraft.client.model.entities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.ren.lorecraft.common.entities.Viking;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.IHasArm;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.HandSide;

public class VikingModel <T extends Viking> extends EntityModel<T> implements IHasArm {
    private final ModelRenderer waist;
    private final ModelRenderer Body;
    private final ModelRenderer head;
    private final ModelRenderer nose;
    private final ModelRenderer Head2;
    private final ModelRenderer leftside;
    private final ModelRenderer rightside;
    private final ModelRenderer RightArm;
    private final ModelRenderer LeftArm;
    private final ModelRenderer RightLeg;
    private final ModelRenderer LeftLeg;

    public VikingModel() {
        textureWidth = 64;
        textureHeight = 64;

        waist = new ModelRenderer(this);
        waist.setRotationPoint(0.0F, 12.0F, 0.0F);


        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, 12.0F, 0.0F);
        waist.addChild(Body);
        Body.setTextureOffset(16, 20).addBox(-4.0F, -24.0F, -3.0F, 8.0F, 12.0F, 6.0F, 0.0F, false);
        Body.setTextureOffset(0, 38).addBox(-4.0F, -24.0F, -3.0F, 8.0F, 19.0F, 6.0F, 0.5F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -12.0F, 0.0F);
        waist.addChild(head);
        head.setTextureOffset(0, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);

        nose = new ModelRenderer(this);
        nose.setRotationPoint(0.0F, -2.0F, 0.0F);
        head.addChild(nose);
        nose.setTextureOffset(24, 0).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        Head2 = new ModelRenderer(this);
        Head2.setRotationPoint(0.0F, 1.0F, 0.0F);
        head.addChild(Head2);
        Head2.setTextureOffset(32, 0).addBox(-4.0F, -11.5F, -4.0F, 8.0F, 8.0F, 8.0F, 0.7F, false);

        leftside = new ModelRenderer(this);
        leftside.setRotationPoint(-1.9F, -7.8F, 0.0F);
        Head2.addChild(leftside);
        leftside.setTextureOffset(52, 16).addBox(-6.1F, -1.7F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, true);
        leftside.setTextureOffset(43, 16).addBox(-6.1F, -4.7F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);

        rightside = new ModelRenderer(this);
        rightside.setRotationPoint(20.9F, -4.8F, 0.0F);
        Head2.addChild(rightside);
        rightside.setTextureOffset(43, 16).addBox(-14.9F, -7.7F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        rightside.setTextureOffset(52, 16).addBox(-16.9F, -4.7F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);

        RightArm = new ModelRenderer(this);
        RightArm.setRotationPoint(-5.0F, -10.0F, 0.0F);
        waist.addChild(RightArm);
        RightArm.setTextureOffset(46, 46).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        RightArm.setTextureOffset(48, 30).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.1F, false);

        LeftArm = new ModelRenderer(this);
        LeftArm.setRotationPoint(5.0F, -10.0F, 0.0F);
        waist.addChild(LeftArm);
        LeftArm.setTextureOffset(30, 46).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
        LeftArm.setTextureOffset(48, 22).addBox(-1.0F, 4.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.1F, true);

        RightLeg = new ModelRenderer(this);
        RightLeg.setRotationPoint(-2.0F, 0.0F, 0.0F);
        waist.addChild(RightLeg);
        RightLeg.setTextureOffset(0, 22).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

        LeftLeg = new ModelRenderer(this);
        LeftLeg.setRotationPoint(2.0F, 0.0F, 0.0F);
        waist.addChild(LeftLeg);
        LeftLeg.setTextureOffset(0, 22).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
    }


    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        waist.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    private ModelRenderer getArm(HandSide p_191216_1_) {
        return p_191216_1_ == HandSide.LEFT ? this.LeftArm : this.RightArm;
    }

    @Override
    public void translateHand(HandSide sideIn, MatrixStack matrixStackIn) {
        this.getArm(sideIn).translateRotate(matrixStackIn);
    }
}
