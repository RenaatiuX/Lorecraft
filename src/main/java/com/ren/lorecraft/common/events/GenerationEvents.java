package com.ren.lorecraft.common.events;

import com.ren.lorecraft.Lorecraft;
import com.ren.lorecraft.common.world.gen.EntityGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Lorecraft.MOD_ID)
public class GenerationEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(BiomeLoadingEvent event) {
        EntityGeneration.onEntitySpawn(event);
    }
}
