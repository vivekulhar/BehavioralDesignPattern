package dev.vivek.Flyweight.PUBG2;
//Concrete flyweight
public class Terrorist implements Player{
    private String weapon;

    public Terrorist(String weapon){
        this.weapon = weapon;
    }

    @Override
    public void play(){
        System.out.println("Terrorist with weapon "+weapon +"is playing.");
    }
}
