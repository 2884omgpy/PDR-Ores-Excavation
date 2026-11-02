package com._2884omgpy.pdr_ore_excavation.datagen.server;

import com._2884omgpy.pdr_ore_excavation.PDROreExcavation;
import com._2884omgpy.pdr_ore_excavation.init.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider
{
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, CompletableFuture.completedFuture(TagsProvider.TagLookup.empty()), PDROreExcavation.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        tag(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("createoreexcavation", "drills")))
                .add(ModItems.TITANIUM_DRILL.get())
                .add(ModItems.DYEDREAM_ALLOY_DRILL.get())
                .add(ModItems.BLACK_METAL_DRILL.get())
                .add(ModItems.SHADOW_ALLOY_DRILL.get())
                .add(ModItems.CONGEAL_WIND_IRON_DRILL.get())
                .add(ModItems.FLUFFY_WIND_ALLOY_DRILL.get());
    }
}