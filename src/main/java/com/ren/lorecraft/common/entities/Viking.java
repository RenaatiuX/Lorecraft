package com.ren.lorecraft.common.entities;

import com.google.common.collect.Maps;
import com.ren.lorecraft.core.init.EntityInit;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.monster.AbstractIllagerEntity;
import net.minecraft.entity.monster.AbstractRaiderEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.pathfinding.GroundPathNavigator;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.Difficulty;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.raid.Raid;

import javax.annotation.Nullable;
import java.util.Map;

public class Viking extends AbstractIllagerEntity {
    public Viking(EntityType<? extends Viking> type, World worldIn) {
        super(type, worldIn);
    }

    public Viking(World world) {
        this(EntityInit.VIKING.get(), world);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return MonsterEntity.func_234295_eP_()
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.35F)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 24.0D)
                .createMutableAttribute(Attributes.MAX_HEALTH, 50.0D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 9.0D);
    }

    @Nullable
    @Override
    public ILivingEntityData onInitialSpawn(IServerWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason, @Nullable ILivingEntityData spawnDataIn, @Nullable CompoundNBT dataTag) {
        ILivingEntityData ilivingentitydata = super.onInitialSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
        ((GroundPathNavigator)this.getNavigator()).setBreakDoors(true);
        this.setEquipmentBasedOnDifficulty(difficultyIn);
        this.setEnchantmentBasedOnDifficulty(difficultyIn);
        return ilivingentitydata;
    }

    @Override
    protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty) {
        if (this.getRaid() == null) {
            this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.IRON_AXE));
            this.setItemStackToSlot(EquipmentSlotType.OFFHAND, new ItemStack(Items.SHIELD));
        }
    }

    @Override
    public boolean isOnSameTeam(Entity entityIn) {
        if (super.isOnSameTeam(entityIn)) {
            return true;
        } else if (entityIn instanceof LivingEntity && ((LivingEntity)entityIn).getCreatureAttribute() == CreatureAttribute.ILLAGER) {
            return this.getTeam() == null && entityIn.getTeam() == null;
        } else {
            return false;
        }
    }

    @Override
    public void applyWaveBonus(int wave, boolean p_213660_2_) {
        ItemStack itemstack = new ItemStack(Items.IRON_AXE);
        Raid raid = this.getRaid();
        int i = 1;
        if (wave > raid.getWaves(Difficulty.NORMAL)) {
            i = 2;
        }

        boolean flag = this.rand.nextFloat() <= raid.getEnchantOdds();
        if (flag) {
            Map<Enchantment, Integer> map = Maps.newHashMap();
            map.put(Enchantments.SHARPNESS, i);
            EnchantmentHelper.setEnchantments(map, itemstack);
        }

        this.setItemStackToSlot(EquipmentSlotType.MAINHAND, itemstack);
    }

    @Override
    public SoundEvent getRaidLossSound() {
        return SoundEvents.ENTITY_VINDICATOR_CELEBRATE;
    }
}
