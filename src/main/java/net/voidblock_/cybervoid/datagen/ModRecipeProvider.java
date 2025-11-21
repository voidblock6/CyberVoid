package net.voidblock_.cybervoid.datagen;


import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SILICON_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.SILICON_INGOT.get())
                .unlockedBy("has_silicon_ingot", has(ModItems.SILICON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLOCKCOIN_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.BLOCKCOIN.get())
                .unlockedBy("has_blockcoin", has(ModItems.BLOCKCOIN))
                .save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.SILICON_INGOT.get(),9 )
                .requires(ModBlocks.SILICON_BLOCK)
                .unlockedBy("has_silicon_block",  has(ModBlocks.SILICON_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.SILICON_DUST.get(),2 )
                .requires(ModItems.RAW_SILICON)
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_raw_silicon",  has(ModItems.RAW_SILICON))
                .save(recipeOutput);






        oreSmelting(recipeOutput, SILICON_SMELTABLES, RecipeCategory.MISC, ModItems.SILICON_INGOT.get(),0.25f, 200, "silicon" );


        }
    }

