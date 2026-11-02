package com._2884omgpy.pdr_ore_excavation.datagen.client;

import com._2884omgpy.pdr_ore_excavation.PDROreExcavation;
import com._2884omgpy.pdr_ore_excavation.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModZhCnLangProvider extends LanguageProvider
{
    public ModZhCnLangProvider(PackOutput output)
    {
        super(output, PDROreExcavation.MOD_ID,"zh_cn");
    }

    @Override
    protected void addTranslations()
    {
        add(ModItems.TITANIUM_DRILL.get(), "钛金钻头");
        add(ModItems.DYEDREAM_ALLOY_DRILL.get(), "染梦合金钻头");
        add(ModItems.BLACK_METAL_DRILL.get(), "黑金属钻头");
        add(ModItems.SHADOW_ALLOY_DRILL.get(), "暗影合金钻头");
        add(ModItems.CONGEAL_WIND_IRON_DRILL.get(), "凝风铁钻头");
        add(ModItems.FLUFFY_WIND_ALLOY_DRILL.get(), "萦风合金钻头");

        add("itemGroup.pdr_ore_excavation.addon", "帕斯特之梦 - 机械动力：矿石开掘 - 附属");
    }
}