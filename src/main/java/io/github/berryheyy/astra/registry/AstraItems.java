package io.github.berryheyy.astra.registry;

import io.github.berryheyy.astra.Reference;
import io.github.berryheyy.astra.data.ItemModelGenerator;
import io.github.berryheyy.astra.item.PortableComputerItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AstraItems {

    public static final PortableComputerItem PORTABLE_COMPUTER = register("portable_computer", new PortableComputerItem());

    /**
     * Registers an item and also registers it's model via {@link io.github.berryheyy.astra.data.ItemModelGenerator} class.
     *
     * @param name Name of item to register
     * @param item Item to register
     * @param <T> Type of item to register
     * @return returns the registered block
     */
    public static <T extends Item> T register(String name, T item) {
        ItemModelGenerator.registerItemModel(name);
        return Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, name), item);
    }

    public static void init() {}

}
