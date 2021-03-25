package io.github.berryheyy.astra.screenhandlers;

import io.github.berryheyy.astra.block.Inspectable;
import io.github.berryheyy.astra.entity.block.internal.EnergyHandler;
import io.github.berryheyy.astra.registry.AstraScreenHandlers;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;
import org.jetbrains.annotations.Nullable;

public class GasPumpUnitScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    private final EnergyHandler energyHandler;

    public GasPumpUnitScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(4), new EnergyHandler(0, 0 , 0));
    }

    public GasPumpUnitScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory, EnergyHandler energyHandler) {
        super(AstraScreenHandlers.GAS_PUMP_UNIT_SCREEN_HANDLER, syncId);
        checkSize(inventory, 4);
        this.inventory = inventory;
        this.energyHandler = energyHandler;

        inventory.onOpen(playerInventory.player);

        for (int i = 0; i < 4; i++) {
            this.addSlot(new Slot(inventory, i, 63 + i * 18, 63));
        }

        //The player inventory
        for (int m = 0; m < 3; ++m) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + m * 9 + 9, 8 + l * 18, 84 + m * 18));
            }
        }
        //The player Hotbar
        for (int m = 0; m < 9; ++m) {
            this.addSlot(new Slot(playerInventory, m, 8 + m * 18, 142));
        }

    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    @Override
    public ItemStack transferSlot(PlayerEntity player, int index) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (index < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }

        return newStack;
    }


}
