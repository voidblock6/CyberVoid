package net.voidblock_.cybervoid.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.voidblock_.cybervoid.CyberVoid;
import net.voidblock_.cybervoid.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBiomeTagProvider extends BiomeTagsProvider {

    public ModBiomeTagProvider(PackOutput output,
                               CompletableFuture<HolderLookup.Provider> lookup,
                               ExistingFileHelper fileHelper) {
        super(output, lookup, CyberVoid.MOD_ID, fileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        ResourceKey<Biome> BLOCKCHAIN = ResourceKey.create(
                Registries.BIOME,
                ResourceLocation.fromNamespaceAndPath(CyberVoid.MOD_ID, "blockchain")
        );

        tag(ModTags.Biomes.IS_BLOCKCHAIN);
        ResourceLocation.fromNamespaceAndPath("cybervoid", "blockchain");

        // lowlands biome
        ResourceKey<Biome> LOWLANDS = ResourceKey.create(
                Registries.BIOME,
                ResourceLocation.fromNamespaceAndPath("cybervoid", "lowlands"));

        // highlands biome
        ResourceKey<Biome> HIGHLANDS = ResourceKey.create(
                Registries.BIOME,
                ResourceLocation.fromNamespaceAndPath("cybervoid", "highlands")
        );

        tag(ModTags.Biomes.IS_BLOCKCHAIN)
                .add(LOWLANDS)
                .add(HIGHLANDS);

    }
}