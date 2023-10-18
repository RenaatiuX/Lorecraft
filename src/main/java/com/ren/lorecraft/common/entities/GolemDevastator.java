package com.ren.lorecraft.common.entities;

import com.ren.lorecraft.core.init.EntityInit;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.AbstractRaiderEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class GolemDevastator extends AbstractRaiderEntity {

    public GolemDevastator(EntityType<? extends GolemDevastator> type, World worldIn) {
        super(type, worldIn);
    }

    public GolemDevastator(World world) {
        this(EntityInit.GOLEM_DEVASTATOR.get(), world);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return MonsterEntity.func_234295_eP_()
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.35F)
                .createMutableAttribute(Attributes.MAX_HEALTH, 100.0D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 15.0D);
    }

    @Override
    public void applyWaveBonus(int wave, boolean p_213660_2_) {

    }

    @Override
    public SoundEvent getRaidLossSound() {
        return null;
    }
}
