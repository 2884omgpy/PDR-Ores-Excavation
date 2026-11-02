package com._2884omgpy.pdr_ore_excavation.datagen.client;

import com._2884omgpy.pdr_ore_excavation.PDROreExcavation;
import com._2884omgpy.pdr_ore_excavation.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModJaJpLangProvider extends LanguageProvider
{
    public ModJaJpLangProvider(PackOutput output)
    {
        super(output, PDROreExcavation.MOD_ID,"ja_jp");
    }

    @Override
    protected void addTranslations()
    {
        add(ModItems.TITANIUM_DRILL.get(), "チタンのドリル");
        add(ModItems.DYEDREAM_ALLOY_DRILL.get(), "夢を染める合金のドリル");
        add(ModItems.BLACK_METAL_DRILL.get(), "黑金属のドリル");
        add(ModItems.SHADOW_ALLOY_DRILL.get(), "影合金のドリル");
        add(ModItems.CONGEAL_WIND_IRON_DRILL.get(), "凝集風の鉄のドリル");
        add(ModItems.FLUFFY_WIND_ALLOY_DRILL.get(), "漂う風の合金のドリル");

        add("itemGroup.pdr_ore_excavation.addon", "パスタの夢 - Create:Ore Excavation - Addon");
    }
}