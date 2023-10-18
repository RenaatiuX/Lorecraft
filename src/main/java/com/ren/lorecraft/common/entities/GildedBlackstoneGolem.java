package com.ren.lorecraft.common.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class GildedBlackstoneGolem extends MonsterEntity {
    protected GildedBlackstoneGolem(EntityType<? extends GildedBlackstoneGolem> type, World worldIn) {
        super(type, worldIn);
    }
}
