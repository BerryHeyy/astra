package io.github.berryheyy.astra.registry;

import io.github.berryheyy.astra.Reference;
import io.github.berryheyy.astra.block.fusionreactor.FusionReactorControllerBlock;
import io.github.berryheyy.astra.data.ItemModelGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AstraBlocks {

    public static final FusionReactorControllerBlock FUSION_REACTOR_CONTROLLER = register("fusion_reactor_controller", new FusionReactorControllerBlock());

    public static <T extends Block> T register(String name, T block) {
        T registeredBlock = Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, name), block);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(ItemGroup.MISC)));

        ItemModelGenerator.registerBlockItemModel(name);
        return registeredBlock;
    }

    public static void init() {}

}
