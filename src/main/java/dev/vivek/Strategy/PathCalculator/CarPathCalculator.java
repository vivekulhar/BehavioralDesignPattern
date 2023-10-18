package dev.vivek.Strategy.PathCalculator;

public class CarPathCalculator implements PathCalculator{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Finding path for car from " + source + " to " + destination);
    }
}
