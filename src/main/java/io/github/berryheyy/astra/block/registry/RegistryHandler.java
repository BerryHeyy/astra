package io.github.berryheyy.astra.block.registry;

import io.github.berryheyy.astra.Reference;
import io.github.berryheyy.astra.block.data.ItemModelGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegistryHandler {

    public static void registerBlocks() {
        registerBlock(AstraBlocks.FUSION_REACTOR_CONTROLLER, "fusion_reactor_controller");
    }

    private static void registerBlock(Block block, String name) {
        Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, name), block);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(ItemGroup.MISC)));

        ItemModelGenerator.registerBlockItemModel(name);
    }

}
