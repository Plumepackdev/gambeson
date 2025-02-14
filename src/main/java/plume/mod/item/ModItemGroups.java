package plume.mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import plume.mod.Gambeson;
import plume.mod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup MONEY_ITEMS = Registry.register(Registries.ITEM_GROUP, Identifier.of(Gambeson.MOD_ID, "money_items"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.COIN))
            .displayName(Text.translatable("itemgroup.gambeson.money_items"))
            .entries((displayContext, entries) -> {
                entries.add(ModItems.COIN);
                entries.add(ModItems.MELTED_GOLD);
                entries.add(ModBlocks.CONDENSED_DIRT.asItem());
                entries.add(ModBlocks.PILLAR.asItem());
            })
            .build());
    public static final ItemGroup ARMOR_ITEMS = Registry.register(Registries.ITEM_GROUP, Identifier.of(Gambeson.MOD_ID, "armor_items"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.GAMBESON_CHESTPLATE))
            .displayName(Text.translatable("itemgroup.gambeson.money_items"))
            .entries((displayContext, entries) -> {
                entries.add(ModItems.GAMBESON_HELMET);
                entries.add(ModItems.GAMBESON_CHESTPLATE);
                entries.add(ModItems.GAMBESON_LEGGINGS);
                entries.add(ModItems.GAMBESON_BOOTS);
            })
            .build());

    public static void registerItemGroups(){
        Gambeson.LOGGER.info("Registering item groups for "+Gambeson.MOD_ID);
    }
}
