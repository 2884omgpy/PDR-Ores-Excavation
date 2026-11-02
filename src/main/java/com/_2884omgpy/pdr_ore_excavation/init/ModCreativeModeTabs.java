package com._2884omgpy.pdr_ore_excavation.init;

import com._2884omgpy.pdr_ore_excavation.PDROreExcavation;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PDROreExcavation.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PDR_ORE_EXCAVATION_DRILLS = CREATIVE_MODE_TABS.register("pdr_ore_excavation_drills",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.pdr_ore_excavation.addon"))
                    .icon(() -> new ItemStack(ModItems.DYEDREAM_ALLOY_DRILL.get()))
                    .displayItems((parameters, output) ->
                    {
                        output.accept(ModItems.TITANIUM_DRILL.get());
                        output.accept(ModItems.DYEDREAM_ALLOY_DRILL.get());
                        output.accept(ModItems.BLACK_METAL_DRILL.get());
                        output.accept(ModItems.SHADOW_ALLOY_DRILL.get());
                        output.accept(ModItems.CONGEAL_WIND_IRON_DRILL.get());
                        output.accept(ModItems.FLUFFY_WIND_ALLOY_DRILL.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
