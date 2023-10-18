package com.ren.lorecraft.common.entities;

import com.ren.lorecraft.core.init.EntityInit;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class MountainTravelerBlackGoat extends AnimalEntity {

    public static final int GOAT_FALL_DAMAGE_REDUCTION = 10;
    public static final double GOAT_SCREAMING_CHANCE = 0.02D;
    public static final double UNIHORN_CHANCE = 0.1F;
    private static final DataParameter<Boolean> IS_SCREAMING_GOAT = EntityDataManager.createKey(MountainTravelerBlackGoat.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Boolean> HAS_LEFT_HORN = EntityDataManager.createKey(MountainTravelerBlackGoat.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Boolean> HAS_RIGHT_HORN = EntityDataManager.createKey(MountainTravelerBlackGoat.class, DataSerializers.BOOLEAN);
    private boolean isLoweringHead;
    private int lowerHeadTick;

    public MountainTravelerBlackGoat(EntityType<? extends MountainTravelerBlackGoat> type, World worldIn) {
        super(type, worldIn);
        this.getNavigator().setCanSwim(true);
    }

    public MountainTravelerBlackGoat(World world) {
        this(EntityInit.BLACK_GOAT.get(), world);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return MobEntity.func_233666_p_().
                createMutableAttribute(Attributes.MAX_HEALTH, 20.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.2F)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 4.0F);
    }

    @Override
    protected int calculateFallDamage(float distance, float damageMultiplier) {
        return super.calculateFallDamage(distance, damageMultiplier) - GOAT_FALL_DAMAGE_REDUCTION;
    }

    @Nullable
    @Override
    public AgeableEntity createChild(ServerWorld world, AgeableEntity mate) {
        return null;
    }
}
