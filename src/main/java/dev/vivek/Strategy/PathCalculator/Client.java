package dev.vivek.Strategy.PathCalculator;

import dev.vivek.Strategy.PathCalculator.Factory.PathCalculatorFactory;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Bangalore", "Chennai", VehicleType.Car);
        googleMaps.findPath("Bangalore", "Chennai", VehicleType.Bike);
        googleMaps.findPath("Bangalore", "Chennai", VehicleType.Foot);
    }
}
