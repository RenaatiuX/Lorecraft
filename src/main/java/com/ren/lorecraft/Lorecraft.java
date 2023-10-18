package com.ren.lorecraft;

import com.ren.lorecraft.core.init.EntityInit;
import com.ren.lorecraft.core.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod(Lorecraft.MOD_ID)
public class Lorecraft {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "lorecraft";

    public Lorecraft() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        ItemInit.ITEMS.register(modEventBus);
        EntityInit.ENTITY_TYPES.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        EntitySpawnPlacementRegistry.register(EntityInit.SOUL_WALKER.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canMonsterSpawnInLight);
    }

    public static ResourceLocation modLoc(String name) {
        return new ResourceLocation(MOD_ID, name);
    }
}
