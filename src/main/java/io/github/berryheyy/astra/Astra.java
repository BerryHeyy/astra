package io.github.berryheyy.astra;

import io.github.berryheyy.astra.registry.AstraItems;
import io.github.berryheyy.astra.registry.RegistryHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Astra implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);

	public static final ItemGroup ASTRA_ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier(Reference.MOD_ID, "general"),
			() -> new ItemStack(AstraItems.PORTABLE_COMPUTER));

	@Override
	public void onInitialize() {
		RegistryHandler.initializeRegistration();
	}
}
