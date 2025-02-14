package plume.mod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import plume.mod.Gambeson;

public class ModBlocks {
    public static final RegistryKey<Block> CONDENSED_DIRT_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(Gambeson.MOD_ID, "condensed_dirt")
    );

    public static final Block CONDENSED_DIRT = register(
            new Block(AbstractBlock.Settings.create().registryKey(CONDENSED_DIRT_KEY).sounds(BlockSoundGroup.GRASS)),
            CONDENSED_DIRT_KEY,
            true
    );

    public static final RegistryKey<Block> PILLAR_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(Gambeson.MOD_ID, "pillar")
    );

    public static final Block PILLAR = register(
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .registryKey(PILLAR_KEY)
                            .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
            ), PILLAR_KEY, true
    );

    public static Block register(Block block, RegistryKey<Block> blockKey, boolean shouldRegisterItem) {
        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            // Items need to be registered with a different type of registry key, but the ID
            // can be the same.
            RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, blockKey.getValue());

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    public static void initialize(){}

}