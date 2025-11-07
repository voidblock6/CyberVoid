package net.voidblock_.cybervoid.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.voidblock_.cybervoid.CyberVoid;
import net.voidblock_.cybervoid.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CyberVoid.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .add(ModBlocks.AQUA_CYBER_BLOCK.get())
        .add(ModBlocks.RED_CYBER_BLOCK.get())
        .add(ModBlocks.LIME_CYBER_BLOCK.get())

        .add(ModBlocks.SILICON_BLOCK.get())
        .add(ModBlocks.SILICON_ORE.get())
        .add(ModBlocks.DEEPSLATE_SILICON_ORE.get());

tag(BlockTags.NEEDS_IRON_TOOL)
        .add(ModBlocks.SILICON_ORE.get())
        .add(ModBlocks.DEEPSLATE_SILICON_ORE.get());

tag(BlockTags.NEEDS_DIAMOND_TOOL)
        .add(ModBlocks.AQUA_CYBER_BLOCK.get())
        .add(ModBlocks.LIME_CYBER_BLOCK.get())
        .add(ModBlocks.RED_CYBER_BLOCK.get());

    }
}
