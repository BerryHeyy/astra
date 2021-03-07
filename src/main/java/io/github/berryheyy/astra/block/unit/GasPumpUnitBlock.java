package io.github.berryheyy.astra.block.unit;

import io.github.berryheyy.astra.block.AstraBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;

public class GasPumpUnitBlock extends AstraBlock {

    public GasPumpUnitBlock() {
        super(FabricBlockSettings.of(Material.METAL));
    }
}
