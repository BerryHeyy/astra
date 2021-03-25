package io.github.berryheyy.astra.client;

import io.github.berryheyy.astra.client.screen.GasPumpUnitHandledScreen;
import io.github.berryheyy.astra.registry.AstraScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

@Environment(EnvType.CLIENT)
public class AstraClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        registerHandledScreens();
    }

    private static void registerHandledScreens() {
        ScreenRegistry.register(AstraScreenHandlers.GAS_PUMP_UNIT_SCREEN_HANDLER, GasPumpUnitHandledScreen::new);
    }
}
