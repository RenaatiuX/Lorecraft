package com.ren.lorecraft.common.entities;

import com.ren.lorecraft.common.entities.enums.Variation;
import com.ren.lorecraft.core.init.EntityInit;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.AbstractSkeletonEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.piglin.AbstractPiglinEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class SoulWalker extends MonsterEntity {
    private static final DataParameter<Integer> VARIANT = EntityDataManager.createKey(SoulWalker.class, DataSerializers.VARINT);
    public SoulWalker(EntityType<? extends SoulWalker> type, World worldIn) {
        super(type, worldIn);
    }

    public SoulWalker(World world) {
        this(EntityInit.SOUL_WALKER.get(), world);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.0D, true));
        this.goalSelector.addGoal(2, new WaterAvoidingRandomWalkingGoal(this, 0.8D));
        this.goalSelector.addGoal(3, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, AbstractSkeletonEntity.class, true));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, AbstractPiglinEntity.class, true));
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 20)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.35D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 5)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 32);
    }

    @Override
    protected void registerData() {
        super.registerData();
        this.dataManager.register(VARIANT, 0);
    }

    @Override
    public void writeAdditional(CompoundNBT compound) {
        super.writeAdditional(compound);
        compound.putInt("Variant", this.getTypeVariant());
    }

    @Override
    public void readAdditional(CompoundNBT compound) {
        super.readAdditional(compound);
        this.dataManager.set(VARIANT, compound.getInt("Variant"));
    }

    @Override
    protected int getExperiencePoints(PlayerEntity player) {
        return 3 + this.world.rand.nextInt(5);
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return super.getAmbientSound();
    }

    @Override
    protected SoundEvent getDeathSound() {
        return super.getDeathSound();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return super.getHurtSound(damageSourceIn);
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        super.playStepSound(pos, blockIn);
    }

    //TODO VARIANTS
    @Nullable
    @Override
    public ILivingEntityData onInitialSpawn(IServerWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason, @Nullable ILivingEntityData spawnDataIn, @Nullable CompoundNBT dataTag) {
        Variation variant = Util.getRandomObject(Variation.values(), this.rand);
        setVariant(variant);
        return super.onInitialSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
    }

    public Variation getVariant() {
        return Variation.byId(this.getTypeVariant() & 255);
    }

    private int getTypeVariant() {
        return this.dataManager.get(VARIANT);
    }

    private void setVariant(Variation variant) {
        this.dataManager.set(VARIANT, variant.getId() & 255);
    }
}
