package dev.vivek.Flyweight.PUBG1;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {
    Map<String, Bullet> bullets = new HashMap<>();

    public void register(String key, Bullet bullet){
        bullets.put(key,bullet);
        System.out.println("Registering bullet of key : " + key);
    }

    public Bullet get(String key){
        return bullets.get(key);
    }
}
