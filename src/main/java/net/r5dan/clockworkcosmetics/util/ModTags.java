package net.r5dan.clockworkcosmetics.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.r5dan.clockworkcosmetics.ClockworkCosmetics;


public class ModTags {
    public static class Blocks {

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ClockworkCosmetics.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> COSMETICS = tag("cosmetics");
        public static final TagKey<Item> NETHERITE_COSMETICS = tag("netherite_cosmetics");
        public static final TagKey<Item> DIAMOND_COSMETICS = tag("diamond_cosmetics");
        public static final TagKey<Item> COSMETICS_1 = tag("cosmetics_1");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(ClockworkCosmetics.MOD_ID, name));
        }
    }
}
