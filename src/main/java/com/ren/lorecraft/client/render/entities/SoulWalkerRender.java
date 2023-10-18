package com.ren.lorecraft.client.render.entities;

import com.google.common.collect.Maps;
import com.ren.lorecraft.Lorecraft;
import com.ren.lorecraft.client.model.entities.SoulWalkerModel;
import com.ren.lorecraft.common.entities.SoulWalker;
import com.ren.lorecraft.common.entities.enums.Variation;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Util;

import java.util.Map;

public class SoulWalkerRender extends MobRenderer<SoulWalker, SoulWalkerModel<SoulWalker>> {
    private static final Map<Variation, ResourceLocation> TEXTURES = Util.make(Maps.newEnumMap(Variation.class), (textures) -> {
       textures.put(Variation.FIRST, Lorecraft.modLoc("textures/entity/soulwalker/soul_walker_1.png"));
        textures.put(Variation.SECOND, Lorecraft.modLoc("textures/entity/soulwalker/soul_walker_2.png"));
        textures.put(Variation.THIRD, Lorecraft.modLoc("textures/entity/soulwalker/soul_walker_3.png"));
    });

    public SoulWalkerRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SoulWalkerModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(SoulWalker entity) {
        return TEXTURES.get(entity.getVariant());
    }
}
