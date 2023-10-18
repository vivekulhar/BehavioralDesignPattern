package dev.vivek.Flyweight.PUBG2;

public class CounterTerrorist implements Player{
    private String weapon;
    public CounterTerrorist(String weapon){
        this.weapon = weapon;
    }

    @Override
    public void play(){
        System.out.println("Counter-Terrorist with " +
                "weapon "+ weapon+" is playing");
    }
}
