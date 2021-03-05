package io.github.berryheyy.astra.block.fusionreactor;

import io.github.berryheyy.astra.block.AstraBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;

public class FusionReactorControllerBlock extends AstraBlock {

    public FusionReactorControllerBlock( ) {
        super(FabricBlockSettings.of(Material.METAL).strength(8.0f));
    }
}
