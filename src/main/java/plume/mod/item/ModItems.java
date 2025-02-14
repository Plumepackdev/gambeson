package plume.mod.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import plume.mod.Gambeson;
import plume.mod.item.custom.GambesonArmorMaterial;

public class ModItems {

    public static final Item COIN=registerItem("coin",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Gambeson.MOD_ID,"coin")))));
    public static final Item MELTED_GOLD=registerItem("melted_gold",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Gambeson.MOD_ID,"melted_gold")))));

    public static final RegistryKey<Item> GAMBESON_HELMET_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Gambeson.MOD_ID, "gambeson_helmet"));
    public static final Item GAMBESON_HELMET = registerItem("gambeson_helmet",new ArmorItem(GambesonArmorMaterial.INSTANCE, EquipmentType.HELMET, new Item.Settings().registryKey(GAMBESON_HELMET_KEY).maxDamage(EquipmentType.HELMET.getMaxDamage(GambesonArmorMaterial.BASE_DURABILITY))));

    public static final RegistryKey<Item> GAMBESON_CHESTPLATE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Gambeson.MOD_ID, "gambeson_chestplate"));
    public static final Item GAMBESON_CHESTPLATE = registerItem("gambeson_chestplate",new ArmorItem(GambesonArmorMaterial.INSTANCE, EquipmentType.CHESTPLATE, new Item.Settings().registryKey(GAMBESON_CHESTPLATE_KEY).maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(GambesonArmorMaterial.BASE_DURABILITY))));

    public static final RegistryKey<Item> GAMBESON_LEGGINGS_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Gambeson.MOD_ID, "gambeson_leggings"));
    public static final Item GAMBESON_LEGGINGS = registerItem("gambeson_leggings",new ArmorItem(GambesonArmorMaterial.INSTANCE, EquipmentType.LEGGINGS, new Item.Settings().registryKey(GAMBESON_LEGGINGS_KEY).maxDamage(EquipmentType.LEGGINGS.getMaxDamage(GambesonArmorMaterial.BASE_DURABILITY))));

    public static final RegistryKey<Item> GAMBESON_BOOTS_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Gambeson.MOD_ID, "gambeson_boots"));
    public static final Item GAMBESON_BOOTS = registerItem("gambeson_boots",new ArmorItem(GambesonArmorMaterial.INSTANCE, EquipmentType.BOOTS, new Item.Settings().registryKey(GAMBESON_BOOTS_KEY).maxDamage(EquipmentType.BOOTS.getMaxDamage(GambesonArmorMaterial.BASE_DURABILITY))));

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
