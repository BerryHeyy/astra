package io.github.berryheyy.astra;

import io.github.berryheyy.astra.block.registry.RegistryHandler;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Astra implements ModInitializer {

	public final static Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);

	@Override
	public void onInitialize() {
		RegistryHandler.registerBlocks();
	}
}
