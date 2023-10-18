package dev.vivek.Strategy.PathCalculator;

public class WalkPathCalculator implements PathCalculator{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Finding path for walk from " + source + " to " + destination);
    }
}
