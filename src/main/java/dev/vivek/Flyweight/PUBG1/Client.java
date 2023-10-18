package dev.vivek.Flyweight.PUBG1;

public class Client {
    public static void fillBulletRegistry(BulletRegistry registry){
        Bullet bullet = new Bullet();
        bullet.setDamage(100);
        //bullet.setSpeed(200);
        bullet.setColor("RED");
        bullet.setImage(null);
        bullet.setRadius(10);
        bullet.setWeight(300);
        registry.register("AKM",bullet);

        bullet = new Bullet();
        bullet.setDamage(200);
        bullet.setColor("GREEN");
        bullet.setImage(null);
        bullet.setRadius(20);
        bullet.setWeight(400);
        registry.register("M416",bullet);
    }

    public static void main(String[] args) {
        BulletRegistry registry = new BulletRegistry();
        fillBulletRegistry(registry);

        FlyingBullet flyingBullet = new FlyingBullet(registry.get("AKM"));
        FlyingBullet flyingBullet1 = new FlyingBullet(registry.get("M416"));

        flyingBullet.setDirection(Direction.SOUTH);
        flyingBullet1.setDirection(Direction.NORTH);
        flyingBullet.setCurrentCoordinates(new CurrentCoordinates(10,20,30));
        flyingBullet1.setCurrentCoordinates(new CurrentCoordinates(40,50,60));


        flyingBullet1.shoot();
        flyingBullet.shoot();
    }
}
