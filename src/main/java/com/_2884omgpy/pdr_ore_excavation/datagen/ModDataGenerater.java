package com._2884omgpy.pdr_ore_excavation.datagen;

import com._2884omgpy.pdr_ore_excavation.PDROreExcavation;
import com._2884omgpy.pdr_ore_excavation.datagen.client.*;
import com._2884omgpy.pdr_ore_excavation.datagen.server.ModItemTagsProvider;
import com._2884omgpy.pdr_ore_excavation.datagen.server.ModRecipesProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = PDROreExcavation.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDataGenerater
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        //物品配方
        generator.addProvider(event.includeServer(), new ModRecipesProvider(packOutput));
        //物品标签
        generator.addProvider(event.includeServer(), new ModItemTagsProvider(packOutput, lookupProvider, existingFileHelper));

        //物品模型
        generator.addProvider(event.includeClient(), new ModItemModelsProvider(packOutput, existingFileHelper));
        //语言文件
        generator.addProvider(event.includeClient(), new ModEnUsLangProvider(packOutput));
        generator.addProvider(event.includeClient(), new ModZhCnLangProvider(packOutput));
        generator.addProvider(event.includeClient(), new ModLzhLangProvider(packOutput));
        generator.addProvider(event.includeClient(), new ModZhTwLangProvider(packOutput));
        generator.addProvider(event.includeClient(), new ModJaJpLangProvider(packOutput));
    }
}
