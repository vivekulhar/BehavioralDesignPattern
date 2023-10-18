package dev.vivek.Strategy.PathCalculator.Factory;

import dev.vivek.Strategy.PathCalculator.*;

public class PathCalculatorFactory {
    static CarPathCalculator carPathCalculator = new CarPathCalculator();
    static BikePathCalculator bikePathCalculator = new BikePathCalculator();
    static WalkPathCalculator walkPathCalculator = new WalkPathCalculator();
    public static PathCalculator getPathCalculator(VehicleType vehicleType) {
        switch (vehicleType) {
            case Car:
                return carPathCalculator;
            case Bike:
                return bikePathCalculator;
            case Foot:
                return walkPathCalculator;
            default:
                return null;
        }
    }
}
