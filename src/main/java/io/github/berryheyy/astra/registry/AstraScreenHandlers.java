package io.github.berryheyy.astra.registry;

import io.github.berryheyy.astra.Reference;
import io.github.berryheyy.astra.screenhandlers.GasPumpUnitScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class AstraScreenHandlers {

    public static final ScreenHandlerType<GasPumpUnitScreenHandler> GAS_PUMP_UNIT_SCREEN_HANDLER = register("gas_pump_unit", GasPumpUnitScreenHandler::new);

    private static <T extends ScreenHandler> ScreenHandlerType<T> register(String name, ScreenHandlerRegistry.SimpleClientHandlerFactory<T> supplier) {
        return ScreenHandlerRegistry.registerSimple(new Identifier(Reference.MOD_ID),
                supplier);
    }

    public static void init() {}

}
