package com.ren.lorecraft.client.render.entities;

import com.ren.lorecraft.Lorecraft;
import com.ren.lorecraft.client.model.entities.BookShelfGolemModel;
import com.ren.lorecraft.common.entities.BookShelfGolem;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BookShelfGolemRender extends MobRenderer<BookShelfGolem, BookShelfGolemModel<BookShelfGolem>> {

    private static final ResourceLocation TEXTURES = Lorecraft.modLoc("textures/entity/bookshelfgolem.png");

    public BookShelfGolemRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new BookShelfGolemModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(BookShelfGolem entity) {
        return TEXTURES;
    }
}
