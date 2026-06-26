package net.mapplect.kirbylandv1.util;

import net.mapplect.kirbylandv1.KirbyLandV1;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_DETECTABLE_BLOCKS =
                createTag("metal_detector_detectable_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(KirbyLandV1.MOD_ID, name));
        }

    }

    public static class Items {
        public static final TagKey<Item> MAGNOLIA_LOGS =
                TagKey.of(RegistryKeys.ITEM, new Identifier("kirbylandv1", "magnolia_logs"));

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(KirbyLandV1.MOD_ID, name));

        }

    }
}
