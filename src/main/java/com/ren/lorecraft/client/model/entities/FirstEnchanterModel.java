package com.ren.lorecraft.client.model.entities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.ren.lorecraft.common.entities.FirstEnchanter;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class FirstEnchanterModel <T extends FirstEnchanter> extends EntityModel<T> {
    private final ModelRenderer waist;
    private final ModelRenderer Body;
    private final ModelRenderer bone;
    private final ModelRenderer head;
    private final ModelRenderer books;
    private final ModelRenderer librarian_books;
    private final ModelRenderer nose;
    private final ModelRenderer RightArm;
    private final ModelRenderer LeftArm;
    private final ModelRenderer staff;

    public FirstEnchanterModel() {
        textureWidth = 128;
        textureHeight = 100;

        waist = new ModelRenderer(this);
        waist.setRotationPoint(0.0F, 6.0F, -2.0F);


        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, 12.0F, 0.0F);
        waist.addChild(Body);
        Body.setTextureOffset(42, 46).addBox(-5.5F, -27.0F, -2.5F, 11.0F, 15.0F, 9.0F, 0.0F, false);
        Body.setTextureOffset(0, 23).addBox(-6.0F, -12.0F, -4.5F, 12.0F, 18.0F, 13.0F, 0.3F, false);

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, -18.0F, 28.0F);
        Body.addChild(bone);
        setRotationAngle(bone, 0.6109F, 0.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-8.0F, -26.0F, -26.0F, 16.0F, 7.0F, 16.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -15.0F, -5.0F);
        waist.addChild(head);
        head.setTextureOffset(65, 4).addBox(-4.0F, -13.0F, -4.0F, 8.0F, 14.0F, 9.0F, 0.0F, false);
        head.setTextureOffset(0, 82).addBox(-4.0F, -16.0F, -4.0F, 8.0F, 6.0F, 9.0F, 0.1F, false);
        head.setTextureOffset(90, 2).addBox(-4.0F, -13.0F, -4.0F, 8.0F, 2.0F, 9.0F, 0.15F, false);
        head.setTextureOffset(38, 24).addBox(-5.0F, -3.0F, -5.0F, 10.0F, 6.0F, 4.0F, 0.0F, false);
        head.setTextureOffset(51, 35).addBox(-4.0F, 3.0F, -5.0F, 8.0F, 5.0F, 4.0F, 0.0F, false);
        head.setTextureOffset(50, 0).addBox(-2.0F, 8.0F, -5.0F, 4.0F, 6.0F, 3.0F, 0.0F, false);
        head.setTextureOffset(8, 0).addBox(-6.0F, -7.0F, -4.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);
        head.setTextureOffset(8, 0).addBox(4.0F, -7.0F, -4.0F, 2.0F, 2.0F, 0.0F, 0.0F, true);

        books = new ModelRenderer(this);
        books.setRotationPoint(0.0F, 31.0F, 0.0F);
        head.addChild(books);


        librarian_books = new ModelRenderer(this);
        librarian_books.setRotationPoint(0.25F, -21.25F, 8.0F);
        books.addChild(librarian_books);
        librarian_books.setTextureOffset(75, 42).addBox(-4.25F, -28.76F, -12.0F, 8.0F, 4.0F, 9.0F, 0.2F, false);
        librarian_books.setTextureOffset(82, 57).addBox(-3.25F, -31.95F, -12.0F, 8.0F, 3.0F, 9.0F, 0.0F, false);
        librarian_books.setTextureOffset(77, 28).addBox(-4.25F, -34.95F, -12.0F, 8.0F, 3.0F, 9.0F, 0.0F, false);

        nose = new ModelRenderer(this);
        nose.setRotationPoint(0.0F, -2.0F, 0.0F);
        head.addChild(nose);
        nose.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, -7.0F, 2.0F, 5.0F, 3.0F, 0.0F, false);

        RightArm = new ModelRenderer(this);
        RightArm.setRotationPoint(-7.75F, -8.75F, 1.0F);
        waist.addChild(RightArm);
        RightArm.setTextureOffset(24, 55).addBox(-1.75F, -6.25F, -2.0F, 4.0F, 20.0F, 4.0F, 0.0F, false);
        RightArm.setTextureOffset(0, 59).addBox(-2.25F, -6.75F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);

        LeftArm = new ModelRenderer(this);
        LeftArm.setRotationPoint(7.75F, -13.75F, 1.0F);
        waist.addChild(LeftArm);
        LeftArm.setTextureOffset(24, 55).addBox(-2.25F, -1.25F, -2.0F, 4.0F, 20.0F, 4.0F, 0.0F, true);
        LeftArm.setTextureOffset(0, 59).addBox(-2.75F, -1.75F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);

        staff = new ModelRenderer(this);
        staff.setRotationPoint(-1.0F, 8.625F, 16.25F);
        LeftArm.addChild(staff);
        setRotationAngle(staff, 1.5708F, 0.0F, 0.0F);
        staff.setTextureOffset(46, 71).addBox(-1.0F, -27.625F, -10.25F, 2.0F, 27.0F, 2.0F, 0.0F, false);
        staff.setTextureOffset(58, 74).addBox(-5.0F, -29.625F, -10.25F, 10.0F, 2.0F, 2.0F, 0.0F, false);
        staff.setTextureOffset(57, 79).addBox(-3.0F, -35.625F, -12.25F, 6.0F, 6.0F, 5.0F, 0.0F, false);
        staff.setTextureOffset(57, 91).addBox(-1.0F, -31.625F, -14.25F, 2.0F, 3.0F, 2.0F, 0.0F, false);
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
