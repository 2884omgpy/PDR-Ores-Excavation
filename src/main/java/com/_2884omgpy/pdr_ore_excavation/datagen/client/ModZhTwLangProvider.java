package com._2884omgpy.pdr_ore_excavation.datagen.client;

import com._2884omgpy.pdr_ore_excavation.PDROreExcavation;
import com._2884omgpy.pdr_ore_excavation.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModZhTwLangProvider extends LanguageProvider
{
    public ModZhTwLangProvider(PackOutput output)
    {
        super(output, PDROreExcavation.MOD_ID,"zh_tw");
    }

    @Override
    protected void addTranslations()
    {
        add(ModItems.TITANIUM_DRILL.get(), "鈦金鑽頭");
        add(ModItems.DYEDREAM_ALLOY_DRILL.get(), "染夢合金鑽頭");
        add(ModItems.BLACK_METAL_DRILL.get(), "黒金屬鑽頭");
        add(ModItems.SHADOW_ALLOY_DRILL.get(), "暗影合金鑽頭");
        add(ModItems.CONGEAL_WIND_IRON_DRILL.get(), "凝風鉄鑽頭");
        add(ModItems.FLUFFY_WIND_ALLOY_DRILL.get(), "縈風合金鑽頭");

        add("itemGroup.pdr_ore_excavation.addon", "帕斯特之夢 - 機械動力：礦石開掘 - 附屬");
    }
}