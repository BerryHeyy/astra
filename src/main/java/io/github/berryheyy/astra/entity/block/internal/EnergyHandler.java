package io.github.berryheyy.astra.entity.block.internal;

public class EnergyHandler {

    final int amperage;
    final int voltage;
    final int energyBufferMax;

    int energyBuffer;

    public EnergyHandler(int amperage, int voltage, int energyBufferMax) {
        this.amperage = amperage;
        this.voltage = voltage;
        this.energyBufferMax = energyBufferMax;

        this.energyBuffer = 0;
    }

}
