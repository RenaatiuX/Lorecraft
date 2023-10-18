package com.ren.lorecraft.common.entities;

import com.ren.lorecraft.core.init.EntityInit;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.monster.AbstractIllagerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.item.MerchantOffer;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class MaraudingMerchant extends AbstractIllagerEntity {
    public MaraudingMerchant(EntityType<? extends MaraudingMerchant> type, World worldIn) {
        super(type, worldIn);
    }

    public MaraudingMerchant(World world) {
        this(EntityInit.MARAUDING_MERCHANT.get(), world);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return MonsterEntity.func_234295_eP_()
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.35F)
                .createMutableAttribute(Attributes.MAX_HEALTH, 30.0D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 3.0D);
    }

    @Override
    public void applyWaveBonus(int wave, boolean p_213660_2_) {

    }

    @Override
    public SoundEvent getRaidLossSound() {
        return null;
    }
}
