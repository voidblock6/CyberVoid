package net.voidblock_.cybervoid.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.voidblock_.cybervoid.CyberVoid;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_SILICON_ORE = registerKey("add_silicon_ore");
    public static final ResourceKey<BiomeModifier> ADD_BLOCKCOIN_ORE = registerKey("add_blockcoin_ore");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        // Add Silicon Ore to all overworld biomes
        context.register(ADD_SILICON_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SILICON_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        ResourceKey<Biome> LOWLANDS = ResourceKey.create(
                Registries.BIOME,
                ResourceLocation.fromNamespaceAndPath("cybervoid", "lowlands")
        );

        ResourceKey<Biome> HIGHLANDS = ResourceKey.create(
                Registries.BIOME,
                ResourceLocation.fromNamespaceAndPath("cybervoid", "highlands")
        );

        // Add Blockcoin Ore only to lowlands and highlands
        context.register(ADD_BLOCKCOIN_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(
                        biomes.getOrThrow(LOWLANDS),
                        biomes.getOrThrow(HIGHLANDS)
                ),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.BLOCKCOIN_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(
                NeoForgeRegistries.Keys.BIOME_MODIFIERS,
                ResourceLocation.fromNamespaceAndPath(CyberVoid.MOD_ID, name)
        );
    }
}
