package com._2884omgpy.pdr_ore_excavation.datagen.client;

import com._2884omgpy.pdr_ore_excavation.PDROreExcavation;
import com._2884omgpy.pdr_ore_excavation.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModEnUsLangProvider extends LanguageProvider
{
    public ModEnUsLangProvider(PackOutput output)
    {
        super(output, PDROreExcavation.MOD_ID,"en_us");
    }

    @Override
    protected void addTranslations()
    {
        add(ModItems.TITANIUM_DRILL.get(), "Titanium Drill");
        add(ModItems.DYEDREAM_ALLOY_DRILL.get(), "Dyedream Alloy Drill");
        add(ModItems.BLACK_METAL_DRILL.get(), "Black Metal Drill");
        add(ModItems.SHADOW_ALLOY_DRILL.get(), "Shadow Alloy Drill");
        add(ModItems.CONGEAL_WIND_IRON_DRILL.get(), "Congeal Wind Iron Drill");
        add(ModItems.FLUFFY_WIND_ALLOY_DRILL.get(), "Fluffy Wind Alloy Drill");

        add("itemGroup.pdr_ore_excavation.addon", "Paster Dream:Reborn - Create:Ore Excavation Addon");
    }
}