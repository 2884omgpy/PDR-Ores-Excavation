package com._2884omgpy.pdr_ore_excavation.datagen.client;

import com._2884omgpy.pdr_ore_excavation.init.ModItems;
import com.pasterdream.pasterdreammod.PasterDreamMod;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

public class ModItemModelsProvider extends ItemModelProvider
{
    public ModItemModelsProvider(PackOutput output, ExistingFileHelper existingFileHelper)
    {
        super(output, PasterDreamMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        basicItem(ModItems.TITANIUM_DRILL.get());
        basicItem(ModItems.DYEDREAM_ALLOY_DRILL.get());
        basicItem(ModItems.BLACK_METAL_DRILL.get());
        basicItem(ModItems.SHADOW_ALLOY_DRILL.get());
        basicItem(ModItems.CONGEAL_WIND_IRON_DRILL.get());
        basicItem(ModItems.FLUFFY_WIND_ALLOY_DRILL.get());
    }

    @Override
    public ItemModelBuilder basicItem(Item item)
    {
        return basicItem(Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(item)));
    }
}
