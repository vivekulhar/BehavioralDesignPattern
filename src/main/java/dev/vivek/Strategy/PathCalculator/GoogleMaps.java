package dev.vivek.Strategy.PathCalculator;

import dev.vivek.Strategy.PathCalculator.Factory.PathCalculatorFactory;

public class GoogleMaps {
    PathCalculator pathCalculator;

    public void findPath(String source, String destination, VehicleType vehicleType) {

        pathCalculator = PathCalculatorFactory.getPathCalculator(vehicleType);
        pathCalculator.findPath(source, destination);
    }
}
