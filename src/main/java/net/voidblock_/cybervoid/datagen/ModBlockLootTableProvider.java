package net.voidblock_.cybervoid.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.voidblock_.cybervoid.block.ModBlocks;
import net.voidblock_.cybervoid.item.ModItems;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.SILICON_BLOCK.get());
        dropSelf(ModBlocks.AQUA_CYBER_BLOCK.get());
        dropSelf(ModBlocks.LIME_CYBER_BLOCK.get());
        dropSelf(ModBlocks.RED_CYBER_BLOCK.get());

        add(ModBlocks.SILICON_ORE.get(),
                block -> createOreDrop(ModBlocks.SILICON_ORE.get(), ModItems.RAW_SILICON.get()));

        add(ModBlocks.DEEPSLATE_SILICON_ORE.get(),
        block -> createOreDrop(ModBlocks.DEEPSLATE_SILICON_ORE.get(), ModItems.RAW_SILICON.get()));


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;

    }
}





