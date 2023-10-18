package dev.vivek.Strategy.PathCalculator;

public class BikePathCalculator implements PathCalculator{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Finding path for bike from " + source + " to " + destination);
    }
}
