package com.ren.lorecraft.client.model.entities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.ren.lorecraft.common.entities.BookShelfGolem;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class BookShelfGolemModel <T extends BookShelfGolem> extends EntityModel<T> {
    private final ModelRenderer bone;
    private final ModelRenderer body;
    private final ModelRenderer group;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leg2;
    private final ModelRenderer leg;

    public BookShelfGolemModel() {
        textureWidth = 64;
        textureHeight = 64;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 16.0F, 0.0F);


        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, -1.0F, 0.0F);
        bone.addChild(body);
        body.setTextureOffset(0, 0).addBox(-8.0F, -24.0F, -8.0F, 16.0F, 27.0F, 16.0F, 0.0F, false);
        body.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -11.0F, 4.0F, 6.0F, 3.0F, 0.0F, false);

        group = new ModelRenderer(this);
        group.setRotationPoint(-8.0F, -8.0F, 8.0F);
        body.addChild(group);
        group.setTextureOffset(28, 51).addBox(6.0F, -22.0F, -10.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
        group.setTextureOffset(28, 51).addBox(9.0F, -21.0F, -10.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
        group.setTextureOffset(28, 51).addBox(5.0F, -21.0F, -7.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
        group.setTextureOffset(28, 51).addBox(8.0F, -19.0F, -7.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(9.0F, -19.0F, -6.0F);
        group.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -0.7854F, 0.0F);
        cube_r1.setTextureOffset(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(9.0F, -19.0F, -6.0F);
        group.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.7854F, 0.0F);
        cube_r2.setTextureOffset(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(6.0F, -21.0F, -6.0F);
        group.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, -0.7854F, 0.0F);
        cube_r3.setTextureOffset(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(6.0F, -21.0F, -6.0F);
        group.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.7854F, 0.0F);
        cube_r4.setTextureOffset(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(10.0F, -21.0F, -9.0F);
        group.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, -0.7854F, 0.0F);
        cube_r5.setTextureOffset(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(10.0F, -21.0F, -9.0F);
        group.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.7854F, 0.0F);
        cube_r6.setTextureOffset(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(7.0F, -22.0F, -9.0F);
        group.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, -0.7854F, 0.0F);
        cube_r7.setTextureOffset(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(7.0F, -22.0F, -9.0F);
        group.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.7854F, 0.0F);
        cube_r8.setTextureOffset(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        leg2 = new ModelRenderer(this);
        leg2.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone.addChild(leg2);
        leg2.setTextureOffset(0, 44).addBox(2.0F, 2.0F, -4.0F, 5.0F, 6.0F, 8.0F, 0.0F, false);

        leg = new ModelRenderer(this);
        leg.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone.addChild(leg);
        leg.setTextureOffset(0, 44).addBox(-7.0F, 2.0F, -4.0F, 5.0F, 6.0F, 8.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

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
