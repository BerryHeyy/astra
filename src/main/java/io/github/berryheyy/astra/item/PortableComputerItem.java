package io.github.berryheyy.astra.item;

import io.github.berryheyy.astra.Astra;
import io.github.berryheyy.astra.block.Inspectable;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerFactory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PortableComputerItem extends AstraItem {

    public PortableComputerItem() {
        super(new FabricItemSettings().group(Astra.ASTRA_ITEM_GROUP));
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        if (!world.isClient) {
            BlockPos pos = context.getBlockPos();
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof Inspectable) {
                NamedScreenHandlerFactory screenHandlerFactory = world.getBlockState(pos).createScreenHandlerFactory(world, pos);

                if (screenHandlerFactory != null) {
                    context.getPlayer().openHandledScreen(screenHandlerFactory);
                }
            }
        }

        return ActionResult.SUCCESS;
    }
}
