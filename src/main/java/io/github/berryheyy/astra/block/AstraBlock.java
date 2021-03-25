package io.github.berryheyy.astra.block;

import io.github.berryheyy.astra.registry.AstraItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AstraBlock extends Block {

    public AstraBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        if (player.getStackInHand(hand).getItem().equals(AstraItems.PORTABLE_COMPUTER)) return ActionResult.FAIL;

        return ActionResult.PASS;
    }
}
