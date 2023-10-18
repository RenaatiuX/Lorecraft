package com.ren.lorecraft.client.events;

import com.ren.lorecraft.Lorecraft;
import com.ren.lorecraft.client.render.entities.*;
import com.ren.lorecraft.core.init.EntityInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Lorecraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        entityRenderer();
    }

    private static void entityRenderer() {
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.SOUL_WALKER.get(), SoulWalkerRender::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.BOOKSHELF_GOLEM.get(), BookShelfGolemRender::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.VIKING.get(), VikingRender::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.BLACK_GOAT.get(), MountainTravelerBlackGoatRender::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.MARAUDING_MERCHANT.get(), MaraudingMerchantRender::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.FIRST_ENCHANTER.get(), FirstEnchanterRender::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.ARCHIVIST_SCRIBE.get(), ArchivistScribeRender::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.GOLEM_DEVASTATOR.get(), GolemDevastatorRender::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.MOUNTAIN_TRAVELER.get(), MountainTravelerRender::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.PIGLIN_BLACKSMITH.get(), PiglinBlacksmithRender::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.PIGLIN_GILDED_CHIEF.get(), PiglinGildedChiefRender::new);
    }
}
