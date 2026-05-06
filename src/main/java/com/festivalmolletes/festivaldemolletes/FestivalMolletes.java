package com.festivalmolletes.festivaldemolletes;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FestivalMolletes.MODID)
public class FestivalMolletes
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "festivaldemolletes";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "festivaldemolletes" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    // Create a Deferred Register to hold Items which will all be registered under the "festivaldemolletes" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "festivaldemolletes" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    //Materiales para talavera
    public static final RegistryObject<Item> BASE_BARRO = ITEMS.register("base_barro",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BASE_TALAVERA_VACIA = ITEMS.register("base_talavera_vacia",
            () -> new Item(new Item.Properties()));

    // Ítem del diseño (antes de meter al horno)
    public static final RegistryObject<Item> BASE_TALAVERA_MODELO_1 = ITEMS.register("base_talavera_modelo_1",
            () -> new Item(new Item.Properties()));

    // --- BLOQUES ---
    // El bloque final ya cocido
    public static final RegistryObject<Block> TALAVERA_MODELO_1 = BLOCKS.register("talavera_modelo_1",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.LAPIS)
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()));

    // El ítem del bloque para el inventario (debe llamarse igual que el bloque)
    public static final RegistryObject<Item> TALAVERA_MODELO_1_ITEM = ITEMS.register("talavera_modelo_1",
            () -> new BlockItem(TALAVERA_MODELO_1.get(), new Item.Properties()));

    // Ítem del diseño (antes de meter al horno)
    public static final RegistryObject<Item> BASE_TALAVERA_MODELO_2 = ITEMS.register("base_talavera_modelo_2",
            () -> new Item(new Item.Properties()));

    // --- BLOQUES ---
    // El bloque final ya cocido
    public static final RegistryObject<Block> TALAVERA_MODELO_2 = BLOCKS.register("talavera_modelo_2",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.LAPIS)
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()));

    // El ítem del bloque para el inventario (debe llamarse igual que el bloque)
    public static final RegistryObject<Item> TALAVERA_MODELO_2_ITEM = ITEMS.register("talavera_modelo_2",
            () -> new BlockItem(TALAVERA_MODELO_2.get(), new Item.Properties()));



    // Ítem del diseño (antes de meter al horno)
    public static final RegistryObject<Item> BASE_TALAVERA_MODELO_3 = ITEMS.register("base_talavera_modelo_3",
            () -> new Item(new Item.Properties()));

    // --- BLOQUES ---
    // El bloque final ya cocido
    public static final RegistryObject<Block> TALAVERA_MODELO_3 = BLOCKS.register("talavera_modelo_3",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.LAPIS)
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()));

    // El ítem del bloque para el inventario (debe llamarse igual que el bloque)
    public static final RegistryObject<Item> TALAVERA_MODELO_3_ITEM = ITEMS.register("talavera_modelo_3",
            () -> new BlockItem(TALAVERA_MODELO_3.get(), new Item.Properties()));


    // Ítem del diseño (antes de meter al horno)
    public static final RegistryObject<Item> BASE_TALAVERA_MODELO_4 = ITEMS.register("base_talavera_modelo_4",
            () -> new Item(new Item.Properties()));

    // --- BLOQUES ---
    // El bloque final ya cocido
    public static final RegistryObject<Block> TALAVERA_MODELO_4 = BLOCKS.register("talavera_modelo_4",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.LAPIS)
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()));

    // El ítem del bloque para el inventario (debe llamarse igual que el bloque)
    public static final RegistryObject<Item> TALAVERA_MODELO_4_ITEM = ITEMS.register("talavera_modelo_4",
            () -> new BlockItem(TALAVERA_MODELO_4.get(), new Item.Properties()));



    // Registro del Mollete
    // Nutrición 8 (4 muslitos), Saturación 0.8f
    public static final RegistryObject<Item> MOLLETE = ITEMS.register("mollete",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(8)
                    .saturationMod(0.8f)
                    .build())));

    // Registro del Mollete con Tocino
    public static final RegistryObject<Item> MOLLETE_TOCINO = ITEMS.register("mollete_tocino",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(10)
                    .saturationMod(1.0f)
                    .build())));

    // TAB CREATIVO ACTUALIZADA
    public static final RegistryObject<CreativeModeTab> MOLLETE_TAB =
            CREATIVE_MODE_TABS.register("mollete_tab", () -> CreativeModeTab.builder()
                    .icon(() -> MOLLETE.get().getDefaultInstance())
                    .title(Component.translatable("itemGroup." + MODID + ".mollete_tab"))
                    .displayItems((parameters, output) -> {
                        // Primero la comida
                        output.accept(MOLLETE.get());
                        output.accept(MOLLETE_TOCINO.get());

                        // Proceso de Talavera (Orden lógico)
                        output.accept(BASE_BARRO.get());
                        output.accept(BASE_TALAVERA_VACIA.get());
                        output.accept(BASE_TALAVERA_MODELO_1.get());
                        output.accept(BASE_TALAVERA_MODELO_2.get());
                        output.accept(BASE_TALAVERA_MODELO_3.get());
                        output.accept(BASE_TALAVERA_MODELO_4.get());

                        // El bloque final (usamos el RegistryObject del bloque)
                        output.accept(TALAVERA_MODELO_1.get());
                        output.accept(TALAVERA_MODELO_2.get());
                        output.accept(TALAVERA_MODELO_3.get());
                        output.accept(TALAVERA_MODELO_4.get());
                    })
                    .build());
    public FestivalMolletes(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        // Register the commonSetup method for modloading
        // modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so tabs get registered
        CREATIVE_MODE_TABS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);


        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

//    private void commonSetup(final FMLCommonSetupEvent event)
//    {
//        // Some common setup code
//        LOGGER.info("HELLO FROM COMMON SETUP");
//
//        if (Config.logDirtBlock)
//            LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
//
//        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);
//
//        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
//    }


    // You can use SubscribeEvent and let the Event Bus discover methods to call
//    @SubscribeEvent
//    public void onServerStarting(ServerStartingEvent event)
//    {
//        // Do something when the server starts
//        LOGGER.info("HELLO from server starting");
//    }
//
//    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
//    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
//    public static class ClientModEvents
//    {
//        @SubscribeEvent
//        public static void onClientSetup(FMLClientSetupEvent event)
//        {
//            // Some client setup code
//            LOGGER.info("HELLO FROM CLIENT SETUP");
//            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
//        }
//    }
}
