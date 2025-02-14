package plume.mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import plume.mod.Gambeson;

public class ModItems {

    public static final Item COIN=registerItem("coin",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Gambeson.MOD_ID,"coin")))));
    public static final Item MELTED_GOLD=registerItem("melted_gold",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Gambeson.MOD_ID,"melted_gold")))));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Gambeson.MOD_ID,name),item);
    }

    public static void registerModItems(){
        Gambeson.LOGGER.info("Registering items for "+Gambeson.MOD_ID);


        //Puts in ingredients tab
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
        //    fabricItemGroupEntries.add(COIN);
        //});
    }
}
