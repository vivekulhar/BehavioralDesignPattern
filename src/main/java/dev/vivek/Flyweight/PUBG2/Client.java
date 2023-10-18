package dev.vivek.Flyweight.PUBG2;

public class Client {
    public static void main(String[] args) {
        Player terrorist1 = PlayerFactory.getPlayer("AK-47","Terrorist");
        terrorist1.play();

        Player terrorist2 = PlayerFactory.getPlayer("AK-47","Terrorist");
        terrorist2.play();

        Player counterTerrorist1 = PlayerFactory.getPlayer("M4A1","CounterTerrorist");
        counterTerrorist1.play();

        Player counterTerrorist2 = PlayerFactory.getPlayer("M4A1","CounterTerrorist");
        counterTerrorist2.play();
    }
}
