package net.voidblock_.cybervoid.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.voidblock_.cybervoid.CyberVoid;
import net.voidblock_.cybervoid.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CyberVoid.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWhitItem(ModBlocks.SILICON_BLOCK);
        blockWhitItem(ModBlocks.SILICON_ORE);
        blockWhitItem(ModBlocks.DEEPSLATE_SILICON_ORE);

        blockWhitItem(ModBlocks.AQUA_CYBER_BLOCK);
        blockWhitItem(ModBlocks.RED_CYBER_BLOCK);
        blockWhitItem(ModBlocks.LIME_CYBER_BLOCK);


    }
    private void blockWhitItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(),cubeAll(deferredBlock.get()));
    }
}
