package plume.mod.item.client;

import net.minecraft.util.Identifier;
import plume.mod.Gambeson;
import plume.mod.item.custom.GambesonArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GambesonArmorRenderer extends GeoArmorRenderer<GambesonArmorItem> {
    public GambesonArmorRenderer() {
        super(new DefaultedItemGeoModel<>(Identifier.of(Gambeson.MOD_ID, "armor/example_armor")));
    }
}
