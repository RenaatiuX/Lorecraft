package com.ren.lorecraft.core.init;

import com.ren.lorecraft.Lorecraft;
import com.ren.lorecraft.common.entities.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class EntityInit {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Lorecraft.MOD_ID);

    public static final RegistryObject<EntityType<SoulWalker>> SOUL_WALKER = register("soul_walker",
            () -> EntityType.Builder.<SoulWalker>create(SoulWalker::new, EntityClassification.MONSTER).size(1.0F, 1.0F));
    public static final RegistryObject<EntityType<BookShelfGolem>> BOOKSHELF_GOLEM = register("bookshelf_golem",
            () -> EntityType.Builder.<BookShelfGolem>create(BookShelfGolem::new, EntityClassification.CREATURE).size(0.5F, 0.5F));
    public static final RegistryObject<EntityType<Viking>> VIKING = register("viking",
            () -> EntityType.Builder.<Viking>create(Viking::new, EntityClassification.MONSTER).size(0.5F, 0.5F));
    public static final RegistryObject<EntityType<MountainTravelerBlackGoat>> BLACK_GOAT = register("mountain_traveler_black_goat",
            () -> EntityType.Builder.<MountainTravelerBlackGoat>create(MountainTravelerBlackGoat::new, EntityClassification.CREATURE).size(0.9F, 1.3F));
    public static final RegistryObject<EntityType<MaraudingMerchant>> MARAUDING_MERCHANT = register("marauding_merchant",
            () -> EntityType.Builder.<MaraudingMerchant>create(MaraudingMerchant::new, EntityClassification.MONSTER).size(0.6F, 1.95F));
    public static final RegistryObject<EntityType<FirstEnchanter>> FIRST_ENCHANTER = register("first_enchanter",
            () -> EntityType.Builder.<FirstEnchanter>create(FirstEnchanter::new, EntityClassification.MONSTER).size(0.6F, 1.95F));
    public static final RegistryObject<EntityType<ArchivistScribe>> ARCHIVIST_SCRIBE = register("archivist_scribe",
            () -> EntityType.Builder.<ArchivistScribe>create(ArchivistScribe::new, EntityClassification.MONSTER).size(0.6F, 1.95F));
    public static final RegistryObject<EntityType<GolemDevastator>> GOLEM_DEVASTATOR = register("golem_devastator",
            () -> EntityType.Builder.<GolemDevastator>create(GolemDevastator::new, EntityClassification.MONSTER).size(1.0F, 2.95F));
    public static final RegistryObject<EntityType<MountainTraveler>> MOUNTAIN_TRAVELER = register("mountain_traveler",
            () -> EntityType.Builder.<MountainTraveler>create(MountainTraveler::new, EntityClassification.MONSTER).size(0.6F, 1.95F));
    public static final RegistryObject<EntityType<PiglinBlacksmith>> PIGLIN_BLACKSMITH = register("piglin_blacksmith",
            () -> EntityType.Builder.<PiglinBlacksmith>create(PiglinBlacksmith::new, EntityClassification.MONSTER).size(1.2F, 2.5f));
    public static final RegistryObject<EntityType<PiglinGildedChief>> PIGLIN_GILDED_CHIEF = register("piglin_gilded_chief",
            () -> EntityType.Builder.<PiglinGildedChief>create(PiglinGildedChief::new, EntityClassification.MONSTER).size(1.3F, 2.8F));
    public static final <T extends Entity> RegistryObject<EntityType<T>> register(String name, Supplier<EntityType.Builder<T>> builder){
        return ENTITY_TYPES.register(name, () -> builder.get().build(Lorecraft.modLoc(name).toString()));
    }
}
