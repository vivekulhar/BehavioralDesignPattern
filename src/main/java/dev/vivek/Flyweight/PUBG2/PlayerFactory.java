package dev.vivek.Flyweight.PUBG2;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    private static Map<String, Player> players = new HashMap<>();
    
    public static Player getPlayer(String weapon, String type){
        String key = weapon+"_"+type;
        
        if(players.containsKey(key)){
            return players.get(key);
        }else{
            Player player;
            if(type.equalsIgnoreCase("Terrorist")){
                player  = new Terrorist(weapon);
            }else if(type.equalsIgnoreCase("CounterTerrorist")){
                player = new CounterTerrorist(weapon);
            }else{
                throw new IllegalArgumentException(
                        "Invalid player type: "+ type
                );
            }
            players.put(key,player);
            return player;
        }
    }
}
