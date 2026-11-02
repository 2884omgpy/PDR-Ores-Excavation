package com._2884omgpy.pdr_ore_excavation.datagen.server;

import com._2884omgpy.pdr_ore_excavation.PDROreExcavation;
import com._2884omgpy.pdr_ore_excavation.init.ModItems;
import com.pasterdream.pasterdreammod.init.ModBlocks;
import com.tom.createores.Registration;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipesProvider extends RecipeProvider implements IConditionBuilder
{
    public ModRecipesProvider(PackOutput pOutput)
    {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> writer)
    {
        //有序合成配方
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.TITANIUM_DRILL.get())
                .pattern("AB ")
                .pattern("BCB")
                .pattern(" BB")
                .define('A', ModBlocks.TITANIUM_BLOCK.get())
                .define('B', com.pasterdream.pasterdreammod.init.ModItems.TITANIUM_INGOT.get())
                .define('C', Registration.DIAMOND_DRILL_ITEM)
                .unlockedBy("has_titanium_block", has(ModBlocks.TITANIUM_BLOCK.get()))
                .unlockedBy("has_titanium_ingot", has(com.pasterdream.pasterdreammod.init.ModItems.TITANIUM_INGOT.get()))
                .unlockedBy("has_diamond_drill", has(Registration.DIAMOND_DRILL_ITEM))
                .save(writer, ResourceLocation.fromNamespaceAndPath(PDROreExcavation.MOD_ID, "titanium_drill_craft"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.DYEDREAM_ALLOY_DRILL.get())
                .pattern("AB ")
                .pattern("BCB")
                .pattern(" BB")
                .define('A', ModBlocks.DYEDREAM_ALLOY_BLOCK.get())
                .define('B', com.pasterdream.pasterdreammod.init.ModItems.DYEDREAM_ALLOY_INGOT.get())
                .define('C', Registration.NETHERITE_DRILL_ITEM)
                .unlockedBy("has_dyedream_alloy_block", has(ModBlocks.DYEDREAM_ALLOY_BLOCK.get()))
                .unlockedBy("has_dyedream_alloy_ingot", has(com.pasterdream.pasterdreammod.init.ModItems.DYEDREAM_ALLOY_INGOT.get()))
                .unlockedBy("has_netherite_drill", has(Registration.NETHERITE_DRILL_ITEM))
                .save(writer, ResourceLocation.fromNamespaceAndPath(PDROreExcavation.MOD_ID, "dyedream_alloy_drill_craft"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.BLACK_METAL_DRILL.get())
                .pattern("AB ")
                .pattern("BCB")
                .pattern(" BB")
                .define('A', ModBlocks.BLACK_METAL_BLOCK.get())
                .define('B', com.pasterdream.pasterdreammod.init.ModItems.BLACK_METAL_INGOT.get())
                .define('C', Registration.DIAMOND_DRILL_ITEM)
                .unlockedBy("has_black_metal_block", has(ModBlocks.BLACK_METAL_BLOCK.get()))
                .unlockedBy("has_black_metal_ingot", has(com.pasterdream.pasterdreammod.init.ModItems.BLACK_METAL_INGOT.get()))
                .unlockedBy("has_diamond_drill", has(Registration.DIAMOND_DRILL_ITEM))
                .save(writer, ResourceLocation.fromNamespaceAndPath(PDROreExcavation.MOD_ID, "black_metal_drill_craft"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.SHADOW_ALLOY_DRILL.get())
                .pattern("AB ")
                .pattern("BCB")
                .pattern(" BB")
                .define('A', com.pasterdream.pasterdreammod.init.ModItems.SHADOW_ALLOY_INGOT.get())
                .define('B', com.pasterdream.pasterdreammod.init.ModItems.SHADOW_ALLOY_INGOT.get())
                .define('C', Registration.NETHERITE_DRILL_ITEM)
                .unlockedBy("has_shadow_alloy_ingot", has(com.pasterdream.pasterdreammod.init.ModItems.SHADOW_ALLOY_INGOT.get()))
                .unlockedBy("has_netherite_drill", has(Registration.NETHERITE_DRILL_ITEM))
                .save(writer, ResourceLocation.fromNamespaceAndPath(PDROreExcavation.MOD_ID, "shadow_alloy_drill_craft"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CONGEAL_WIND_IRON_DRILL.get())
                .pattern("AB ")
                .pattern("BCB")
                .pattern(" BB")
                .define('A', ModBlocks.CONGEAL_WIND_IRON_BLOCK.get())
                .define('B', com.pasterdream.pasterdreammod.init.ModItems.CONGEAL_WIND_IRON_INGOT.get())
                .define('C', Registration.DIAMOND_DRILL_ITEM)
                .unlockedBy("has_congeal_wind_iron_block", has(ModBlocks.CONGEAL_WIND_IRON_BLOCK.get()))
                .unlockedBy("has_congeal_wind_iron_ingot", has(com.pasterdream.pasterdreammod.init.ModItems.CONGEAL_WIND_IRON_INGOT.get()))
                .unlockedBy("has_diamond_drill", has(Registration.DIAMOND_DRILL_ITEM))
                .save(writer, ResourceLocation.fromNamespaceAndPath(PDROreExcavation.MOD_ID, "congeal_wind_iron_drill_craft"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.FLUFFY_WIND_ALLOY_DRILL.get())
                .pattern("AB ")
                .pattern("BCB")
                .pattern(" BB")
                .define('A', ModBlocks.FLUFFY_WIND_ALLOY_BLOCK.get())
                .define('B', com.pasterdream.pasterdreammod.init.ModItems.FLUFFY_WIND_ALLOY_INGOT.get())
                .define('C', Registration.NETHERITE_DRILL_ITEM)
                .unlockedBy("has_fluffy_wind_alloy_block", has(ModBlocks.FLUFFY_WIND_ALLOY_BLOCK.get()))
                .unlockedBy("has_fluffy_wind_alloy_ingot", has(com.pasterdream.pasterdreammod.init.ModItems.FLUFFY_WIND_ALLOY_INGOT.get()))
                .unlockedBy("has_netherite_drill", has(Registration.NETHERITE_DRILL_ITEM))
                .save(writer, ResourceLocation.fromNamespaceAndPath(PDROreExcavation.MOD_ID, "fluffy_wind_alloy_drill_craft"));
    }
}
