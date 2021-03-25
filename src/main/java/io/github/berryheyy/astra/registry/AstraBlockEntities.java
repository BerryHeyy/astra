package io.github.berryheyy.astra.registry;

import io.github.berryheyy.astra.Reference;
import io.github.berryheyy.astra.entity.block.GasPumpUnitBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public class AstraBlockEntities {

    public static BlockEntityType<?> GAS_PUMP_UNIT_BLOCK_ENTITY = register("gas_pump_unit", GasPumpUnitBlockEntity::new, AstraBlocks.GAS_PUMP_UNIT_BLOCK);

    private static <T extends BlockEntity> BlockEntityType<T> register(String name, Supplier<T> supplier, Block parentBlock) {
        return Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Reference.MOD_ID, name),
                BlockEntityType.Builder.create(supplier, parentBlock).build(null));
    }

    // Just here to initialize the class
    public static void init() {}

}
