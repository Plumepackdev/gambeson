package plume.mod.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import plume.mod.Gambeson;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Gambeson.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> REPAIRS_GAMBESON_ARMOR = createTag("repairs_gambeson_armor");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Gambeson.MOD_ID, name));
        }
    }
}
