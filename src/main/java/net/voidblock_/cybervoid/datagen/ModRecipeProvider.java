package net.voidblock_.cybervoid.datagen;


import net.minecraft.client.Minecraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.voidblock_.cybervoid.block.ModBlocks;
import net.voidblock_.cybervoid.item.ModItems;
import net.voidblock_.cybervoid.util.ModTags;


import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        super.buildRecipes(recipeOutput);
        List<ItemLike> SILICON_SMELTABLES = List.of(ModItems.SILICON_DUST,
                ModBlocks.SILICON_ORE, ModBlocks.DEEPSLATE_SILICON_ORE, ModItems.RAW_SILICON);

        //silicon block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SILICON_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.SILICON_INGOT.get())
                .unlockedBy("has_silicon_ingot", has(ModItems.SILICON_INGOT))
                .save(recipeOutput);

        //iron rod
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.IRON_INGOT)
                .pattern(" ")
                .pattern("I")
                .pattern("I")
                .define('I', Items.IRON_INGOT)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(recipeOutput);

        //blockcoin block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLOCKCOIN_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.BLOCKCOIN.get())
                .unlockedBy("has_blockcoin", has(ModItems.BLOCKCOIN))
                .save(recipeOutput);
        //capacitor
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CAPACITOR.get())
                .pattern("III")
                .pattern("III")
                .pattern("R R")
                .define('R', ModItems.IRON_ROD.get())
                .define('I', Items.IRON_INGOT)
                .unlockedBy("has_iron_rod", has(ModItems.IRON_ROD))
                .save(recipeOutput);

        //transistor
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TRANSISTOR.get())
                .pattern(" I ")
                .pattern("III")
                .pattern("RRR")
                .define('R', ModItems.IRON_ROD.get())
                .define('I', Items.IRON_INGOT)
                .unlockedBy("has_iron_rod", has(ModItems.IRON_ROD))
                .save(recipeOutput);

        //resistor
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RESISTOR.get())
                .pattern("IWI")
                .define('I', ModItems.IRON_ROD.get())
                .define('W', ItemTags.PLANKS)
                .unlockedBy("has_wooden_plank", has(ItemTags.PLANKS))
                .save(recipeOutput);

        //shapeless recipes

        //silicon ingots from block
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.SILICON_INGOT.get(),9 )
                .requires(ModBlocks.SILICON_BLOCK)
                .unlockedBy("has_silicon_block",  has(ModBlocks.SILICON_BLOCK))
                .save(recipeOutput);

        //silicon dust from smashing
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.SILICON_DUST.get(),2 )
                .requires(ModItems.RAW_SILICON)
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_raw_silicon",  has(ModItems.RAW_SILICON))
                .save(recipeOutput);

        //iron sheet from smashing
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.IRON_SHEET.get())
                .requires(Items.IRON_INGOT)
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_iron_ingot",  has(Items.IRON_INGOT))
                .save(recipeOutput);

        //silicon sheet from smashing
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.SILICON_SHEET.get())
                .requires(ModItems.SILICON_INGOT)
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_silicon_ingot",  has(ModItems.SILICON_INGOT))
                .save(recipeOutput);




        oreSmelting(recipeOutput, SILICON_SMELTABLES, RecipeCategory.MISC, ModItems.SILICON_INGOT.get(),0.25f, 200, "silicon" );


        }
    }

