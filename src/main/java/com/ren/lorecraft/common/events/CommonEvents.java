package com.ren.lorecraft.common.events;

import com.ren.lorecraft.Lorecraft;
import com.ren.lorecraft.common.entities.*;
import com.ren.lorecraft.core.init.EntityInit;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = Lorecraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonEvents {

    @SubscribeEvent
    public static void addEntityAttribute(EntityAttributeCreationEvent event) {
        event.put(EntityInit.SOUL_WALKER.get(), SoulWalker.createAttributes().create());
        event.put(EntityInit.BOOKSHELF_GOLEM.get(), BookShelfGolem.createAttributes().create());
        event.put(EntityInit.VIKING.get(), Viking.createAttributes().create());
        event.put(EntityInit.BLACK_GOAT.get(), MountainTravelerBlackGoat.createAttributes().create());
        event.put(EntityInit.MARAUDING_MERCHANT.get(), MaraudingMerchant.createAttributes().create());
        event.put(EntityInit.FIRST_ENCHANTER.get(), FirstEnchanter.createAttributes().create());
        event.put(EntityInit.ARCHIVIST_SCRIBE.get(), ArchivistScribe.createAttributes().create());
        event.put(EntityInit.GOLEM_DEVASTATOR.get(), GolemDevastator.createAttributes().create());
        event.put(EntityInit.MOUNTAIN_TRAVELER.get(), MountainTraveler.createAttributes().create());
        event.put(EntityInit.PIGLIN_BLACKSMITH.get(), PiglinBlacksmith.createAttributes().create());
        event.put(EntityInit.PIGLIN_GILDED_CHIEF.get(), PiglinGildedChief.createAttributes().create());
    }
}
