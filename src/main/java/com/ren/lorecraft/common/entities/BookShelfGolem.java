package com.ren.lorecraft.common.entities;

import com.ren.lorecraft.core.init.EntityInit;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BookShelfGolem extends GolemEntity {
    public BookShelfGolem(EntityType<? extends BookShelfGolem> type, World worldIn) {
        super(type, worldIn);
    }

    public BookShelfGolem(World world) {
        this(EntityInit.BOOKSHELF_GOLEM.get(), world);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new WaterAvoidingRandomWalkingGoal(this, 1.0D, 1.0000001E-5F));
        this.goalSelector.addGoal(2, new LookAtGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.addGoal(3, new LookRandomlyGoal(this));
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 10)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.25D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 1);
    }

    @Override
    protected ActionResultType getEntityInteractionResult(PlayerEntity playerIn, Hand hand) {
        return super.getEntityInteractionResult(playerIn, hand);
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return super.getAmbientSound();
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return super.getHurtSound(damageSourceIn);
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return super.getDeathSound();
    }
}
