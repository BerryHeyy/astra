package io.github.berryheyy.astra.entity.block;

import io.github.berryheyy.astra.block.Inspectable;
import io.github.berryheyy.astra.entity.block.internal.EnergyHandler;
import io.github.berryheyy.astra.entity.block.internal.ImplementedInventory;
import io.github.berryheyy.astra.registry.AstraBlockEntities;
import io.github.berryheyy.astra.screenhandlers.GasPumpUnitScreenHandler;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerFactory;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Tickable;
import net.minecraft.util.collection.DefaultedList;
import org.jetbrains.annotations.Nullable;

public class GasPumpUnitBlockEntity extends BlockEntity implements Tickable, NamedScreenHandlerFactory, Inspectable, ImplementedInventory {

    EnergyHandler energyHandler;
    final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(4, ItemStack.EMPTY);

    public GasPumpUnitBlockEntity() {
        super(AstraBlockEntities.GAS_PUMP_UNIT_BLOCK_ENTITY);
    }

    @Override
    public void tick() {

    }

    @Override
    public Text getDisplayName() {
        return new TranslatableText("");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new GasPumpUnitScreenHandler(syncId, inv, this, energyHandler);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }
}
