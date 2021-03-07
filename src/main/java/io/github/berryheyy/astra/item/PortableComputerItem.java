package io.github.berryheyy.astra.item;

import io.github.berryheyy.astra.Astra;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class PortableComputerItem extends AstraItem {

    public PortableComputerItem() {
        super(new FabricItemSettings().group(Astra.ASTRA_ITEM_GROUP));
    }
}
