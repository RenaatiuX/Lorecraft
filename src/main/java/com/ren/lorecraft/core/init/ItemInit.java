package com.ren.lorecraft.core.init;

import com.ren.lorecraft.Lorecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Lorecraft.MOD_ID);

    public static final RegistryObject<Item> SOUL_WALKER_SPAWN_EGG = ITEMS.register("soul_walker_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.SOUL_WALKER, 5981496, 2876650,
                    new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> BOOKSHELF_GOLEM_SPAWN_EGG = ITEMS.register("bookshelf_golem_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.BOOKSHELF_GOLEM, 11308372, 9507089,
                    new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> VIKING_SPAWN_EGG = ITEMS.register("viking_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.VIKING, 3484960, 9936285,
                    new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> BLACK_GOAT_SPAWN_EGG = ITEMS.register("black_goat_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.BLACK_GOAT, 3487559, 12627088,
                    new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> MARAUDING_MERCHANT_SPAWN_EGG = ITEMS.register("marauding_merchant_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.MARAUDING_MERCHANT, 5128769, 8949390,
                    new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> FIRST_ENCHANTER_SPAWN_EGG = ITEMS.register("first_enchanter_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.FIRST_ENCHANTER, 9057083, 9146769,
                    new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> ARCHIVIST_SCRIBE_SPAWN_EGG = ITEMS.register("archivist_scribe_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.ARCHIVIST_SCRIBE, 9057083, 8684428,
                    new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> GOLEM_DEVASTATOR_SPAWN_EGG = ITEMS.register("golem_devastator_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.GOLEM_DEVASTATOR, 8816775, 8694698,
                    new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> MOUNTAIN_TRAVELER_SPAWN_EGG = ITEMS.register("mountain_traveler_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.MOUNTAIN_TRAVELER, 5326138, 16448250,
                    new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> PIGLIN_BLACKSMITH_SPAWN_EGG = ITEMS.register("piglin_blacksmith_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.PIGLIN_BLACKSMITH, 15245428, 6299150,
                    new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> PIGLIN_GILDED_CHIEF_SPAWN_EGG = ITEMS.register("piglin_gilded_chief_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.PIGLIN_GILDED_CHIEF, 15245428, 16103452,
                    new Item.Properties().group(ItemGroup.MISC)));
}
