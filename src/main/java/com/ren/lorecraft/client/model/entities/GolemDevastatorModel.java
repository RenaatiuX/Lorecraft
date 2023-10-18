package com.ren.lorecraft.client.model.entities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.ren.lorecraft.common.entities.GolemDevastator;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class GolemDevastatorModel <T extends GolemDevastator> extends EntityModel<T> {

    private final ModelRenderer bone2;
    private final ModelRenderer bone;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r1;
    private final ModelRenderer body_r1;
    private final ModelRenderer head2;
    private final ModelRenderer nose_r1;
    private final ModelRenderer head_r1;
    private final ModelRenderer mouth;
    private final ModelRenderer cube_r2;
    private final ModelRenderer horns;
    private final ModelRenderer arms;
    private final ModelRenderer derecha2;
    private final ModelRenderer izquierda2;
    private final ModelRenderer legs;
    private final ModelRenderer izquierda;
    private final ModelRenderer derecha;

    public GolemDevastatorModel() {
        textureWidth = 180;
        textureHeight = 180;

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, -1.0F, -12.0F);


        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone2.addChild(bone);


        body2 = new ModelRenderer(this);
        body2.setRotationPoint(0.0F, -12.162F, 2.7566F);
        bone.addChild(body2);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 15.4877F, 14.6465F);
        body2.addChild(cube_r1);
        setRotationAngle(cube_r1, 2.5744F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(101, 87).addBox(-8.0F, -6.2294F, -8.8029F, 16.0F, 15.0F, 16.0F, 0.5F, false);

        body_r1 = new ModelRenderer(this);
        body_r1.setRotationPoint(0.0F, 4.4731F, -2.643F);
        body2.addChild(body_r1);
        setRotationAngle(body_r1, 2.5744F, 0.0F, 0.0F);
        body_r1.setTextureOffset(0, 0).addBox(-14.0F, -11.0F, -13.0F, 28.0F, 25.0F, 24.0F, 0.0F, false);

        head2 = new ModelRenderer(this);
        head2.setRotationPoint(0.0F, -24.2394F, -10.6869F);
        bone.addChild(head2);
        setRotationAngle(head2, -0.0873F, 0.0F, 0.0F);


        nose_r1 = new ModelRenderer(this);
        nose_r1.setRotationPoint(0.0F, 9.1245F, -12.1042F);
        head2.addChild(nose_r1);
        setRotationAngle(nose_r1, 0.1745F, 0.0F, 0.0F);
        nose_r1.setTextureOffset(0, 49).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        head_r1 = new ModelRenderer(this);
        head_r1.setRotationPoint(0.0F, 0.1756F, -4.5433F);
        head2.addChild(head_r1);
        setRotationAngle(head_r1, 0.1745F, 0.0F, 0.0F);
        head_r1.setTextureOffset(84, 65).addBox(-8.0F, 8.5F, -7.0F, 16.0F, 0.0F, 16.0F, 0.0F, false);
        head_r1.setTextureOffset(0, 49).addBox(-8.0F, -10.5F, -7.0F, 16.0F, 21.0F, 16.0F, 0.0F, false);

        mouth = new ModelRenderer(this);
        mouth.setRotationPoint(-15.0F, 10.8904F, 3.8622F);
        head2.addChild(mouth);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(15.0F, -7.2394F, -13.6869F);
        mouth.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        cube_r2.setTextureOffset(80, 0).addBox(-8.0F, 5.0F, -1.2131F, 16.0F, 5.0F, 16.0F, 0.05F, false);
        cube_r2.setTextureOffset(84, 49).addBox(-8.0F, 7.0F, -1.2131F, 16.0F, 0.0F, 16.0F, 0.0F, false);

        horns = new ModelRenderer(this);
        horns.setRotationPoint(0.0F, 1.6509F, -6.8247F);
        head2.addChild(horns);
        setRotationAngle(horns, 1.0472F, 0.0F, 0.0F);
        horns.setTextureOffset(12, 0).addBox(-10.0F, -16.7606F, 2.6869F, 2.0F, 14.0F, 4.0F, 0.0F, false);
        horns.setTextureOffset(0, 0).addBox(8.0F, -16.7606F, 2.6869F, 2.0F, 14.0F, 4.0F, 0.0F, true);

        arms = new ModelRenderer(this);
        arms.setRotationPoint(-1.0F, -6.1667F, -0.3333F);
        bone.addChild(arms);


        derecha2 = new ModelRenderer(this);
        derecha2.setRotationPoint(0.0F, 0.0F, 0.0F);
        arms.addChild(derecha2);
        derecha2.setTextureOffset(132, 64).addBox(-24.0F, -20.3333F, -7.0F, 10.0F, 15.0F, 8.0F, 1.2F, false);
        derecha2.setTextureOffset(0, 86).addBox(-24.0F, -16.0F, -7.0F, 10.0F, 47.0F, 8.0F, 0.5F, false);
        derecha2.setTextureOffset(28, 136).addBox(-24.0F, 7.1667F, -7.0F, 10.0F, 14.0F, 8.0F, 0.8F, false);

        izquierda2 = new ModelRenderer(this);
        izquierda2.setRotationPoint(0.0F, 0.0F, 0.0F);
        arms.addChild(izquierda2);
        izquierda2.setTextureOffset(132, 41).addBox(16.0F, -20.3333F, -7.0F, 10.0F, 15.0F, 8.0F, 1.2F, false);
        izquierda2.setTextureOffset(64, 49).addBox(16.0F, -16.0F, -7.0F, 10.0F, 47.0F, 8.0F, 0.5F, false);
        izquierda2.setTextureOffset(28, 136).addBox(16.0F, 7.1667F, -7.0F, 10.0F, 14.0F, 8.0F, 0.8F, true);

        legs = new ModelRenderer(this);
        legs.setRotationPoint(5.0F, 25.0F, 7.0F);
        bone.addChild(legs);


        izquierda = new ModelRenderer(this);
        izquierda.setRotationPoint(1.0F, 0.0F, 0.0F);
        legs.addChild(izquierda);
        izquierda.setTextureOffset(80, 118).addBox(2.0F, -22.0F, 13.0F, 12.0F, 22.0F, 10.0F, 0.0F, false);
        izquierda.setTextureOffset(124, 118).addBox(2.0F, -29.5F, 13.0F, 12.0F, 10.0F, 10.0F, 0.5F, false);
        izquierda.setTextureOffset(25, 159).addBox(2.0F, -14.0F, 13.0F, 12.0F, 6.0F, 10.0F, 0.1F, false);

        derecha = new ModelRenderer(this);
        derecha.setRotationPoint(-1.0F, 0.0F, 0.0F);
        legs.addChild(derecha);
        derecha.setTextureOffset(104, 21).addBox(-24.0F, -29.5F, 13.0F, 12.0F, 10.0F, 10.0F, 0.5F, false);
        derecha.setTextureOffset(36, 104).addBox(-24.0F, -22.0F, 13.0F, 12.0F, 22.0F, 10.0F, 0.0F, false);
        derecha.setTextureOffset(25, 159).addBox(-24.0F, -14.0F, 13.0F, 12.0F, 6.0F, 10.0F, 0.1F, false);
    }

    @Override
    public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        bone2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
