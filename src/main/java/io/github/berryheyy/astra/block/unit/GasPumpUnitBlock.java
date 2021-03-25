package io.github.berryheyy.astra.block.unit;

import io.github.berryheyy.astra.block.AstraBlock;
import io.github.berryheyy.astra.entity.block.GasPumpUnitBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class GasPumpUnitBlock extends AstraBlock implements BlockEntityProvider {

    public GasPumpUnitBlock() {
        super(FabricBlockSettings.of(Material.METAL));
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return new GasPumpUnitBlockEntity();
    }

    @Nullable
    @SuppressWarnings("deprecation")
    @Override
    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        return blockEntity instanceof NamedScreenHandlerFactory ? (NamedScreenHandlerFactory)blockEntity : null;
    }
}
