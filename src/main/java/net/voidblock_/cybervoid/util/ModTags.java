package net.voidblock_.cybervoid.util;




import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.voidblock_.cybervoid.CyberVoid;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(CyberVoid.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> HAMMERS = createTag("hammers");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(CyberVoid.MOD_ID, name));
        }
    }
    public static class Biomes {
        public static final TagKey<Biome> IS_BLOCKCHAIN = createTag("is_blockchain");

        private static TagKey<Biome> createTag(String name) {
            return TagKey.create(Registries.BIOME,ResourceLocation.fromNamespaceAndPath(CyberVoid.MOD_ID, name));
        }
    }

}