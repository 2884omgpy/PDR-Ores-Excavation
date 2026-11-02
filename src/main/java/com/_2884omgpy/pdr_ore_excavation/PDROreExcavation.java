package com._2884omgpy.pdr_ore_excavation;

import com._2884omgpy.pdr_ore_excavation.init.ModCreativeModeTabs;
import com._2884omgpy.pdr_ore_excavation.init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PDROreExcavation.MOD_ID)
public class PDROreExcavation
{
    public static final String MOD_ID = "pdr_ore_excavation";
    public static PDROreExcavation INSTANCE;

    public PDROreExcavation(FMLJavaModLoadingContext context)
    {
        INSTANCE = this;
        IEventBus modEventBus = context.getModEventBus();

        ModItems.register(modEventBus);             //物品注册
        ModCreativeModeTabs.register(modEventBus);  //创造模式物品栏注册

        MinecraftForge.EVENT_BUS.register(this);
    }
}
