package com._2884omgpy.pdr_ore_excavation.init;

import com._2884omgpy.pdr_ore_excavation.PDROreExcavation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PDROreExcavation.MOD_ID);

    public static final RegistryObject<Item> TITANIUM_DRILL = ITEMS.register("titanium_drill", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DYEDREAM_ALLOY_DRILL = ITEMS.register("dyedream_alloy_drill", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BLACK_METAL_DRILL = ITEMS.register("black_metal_drill", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SHADOW_ALLOY_DRILL = ITEMS.register("shadow_alloy_drill", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CONGEAL_WIND_IRON_DRILL = ITEMS.register("congeal_wind_iron_drill", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FLUFFY_WIND_ALLOY_DRILL = ITEMS.register("fluffy_wind_alloy_drill", () -> new Item(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
