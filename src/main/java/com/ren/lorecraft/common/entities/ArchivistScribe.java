package com.ren.lorecraft.common.entities;

import com.ren.lorecraft.core.init.EntityInit;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.SpellcastingIllagerEntity;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class ArchivistScribe extends SpellcastingIllagerEntity {
    public ArchivistScribe(EntityType<? extends ArchivistScribe> type, World p_i48551_2_) {
        super(type, p_i48551_2_);
    }

    public ArchivistScribe(World world) {
        this(EntityInit.ARCHIVIST_SCRIBE.get(), world);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return MonsterEntity.func_234295_eP_()
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.35F)
                .createMutableAttribute(Attributes.MAX_HEALTH, 70.0D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 6.0D);
    }

    @Override
    protected SoundEvent getSpellSound() {
        return null;
    }

    @Override
    public void applyWaveBonus(int wave, boolean p_213660_2_) {

    }

    @Override
    public SoundEvent getRaidLossSound() {
        return null;
    }
}
