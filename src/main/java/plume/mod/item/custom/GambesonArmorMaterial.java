package plume.mod.item.custom;

import net.minecraft.item.equipment.*;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import plume.mod.Gambeson;

import java.util.Map;

import static plume.mod.util.ModTags.Items.REPAIRS_GAMBESON_ARMOR;

public class GambesonArmorMaterial {
    public static final int BASE_DURABILITY = 15;
    public static final RegistryKey<EquipmentAsset> GAMBESON_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(Gambeson.MOD_ID, "gambeson"));

    public static final ArmorMaterial INSTANCE = new ArmorMaterial(
            BASE_DURABILITY,
            Map.of(
                    EquipmentType.HELMET, 3,
                    EquipmentType.CHESTPLATE, 8,
                    EquipmentType.LEGGINGS, 6,
                    EquipmentType.BOOTS, 3
            ),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0.0F,
            0.0F,
            REPAIRS_GAMBESON_ARMOR,
            GAMBESON_ARMOR_MATERIAL_KEY
    );
}
