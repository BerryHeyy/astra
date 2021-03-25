package io.github.berryheyy.astra.registry;

public class RegistryHandler {

    public static void initializeRegistration() {
        AstraBlocks.init();
        AstraItems.init();

        AstraBlockEntities.init();

        AstraScreenHandlers.init();
    }
}
