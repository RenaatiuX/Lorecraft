package com.ren.lorecraft.common.entities;

import com.ren.lorecraft.core.init.EntityInit;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.piglin.AbstractPiglinEntity;
import net.minecraft.entity.monster.piglin.PiglinAction;
import net.minecraft.world.World;

public class PiglinBlacksmith extends AbstractPiglinEntity {
    public PiglinBlacksmith(EntityType<? extends PiglinBlacksmith> p_i241915_1_, World p_i241915_2_) {
        super(p_i241915_1_, p_i241915_2_);
    }
    public PiglinBlacksmith(World world) {
        this(EntityInit.PIGLIN_BLACKSMITH.get(), world);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return MonsterEntity.func_234295_eP_()
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.35F)
                .createMutableAttribute(Attributes.MAX_HEALTH, 100.0D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 7.0D);
    }

    //can haunt
    @Override
    protected boolean func_234422_eK_() {
        return false;
    }

    //Arm pose
    @Override
    public PiglinAction func_234424_eM_() {
        return null;
    }

    //Play converted sound
    @Override
    protected void func_241848_eP() {

    }
}
