package dev.vivek.Flyweight.PUBG1;

public class FlyingBullet implements Prototype<FlyingBullet>{
    private double speed;
    private CurrentCoordinates currentCoordinates;
    private TargetCoordinates targetCoordinates;
    private Direction direction;
    private Bullet bullet;
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public CurrentCoordinates getCurrentCoordinates() {
        return currentCoordinates;
    }

    public void setCurrentCoordinates(CurrentCoordinates currentCoordinates) {
        this.currentCoordinates = currentCoordinates;
    }

    public TargetCoordinates getTargetCoordinates() {
        return targetCoordinates;
    }

    public void setTargetCoordinates(TargetCoordinates targetCoordinates) {
        this.targetCoordinates = targetCoordinates;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public FlyingBullet(Bullet bullet){
        this.bullet = bullet;
    }
    @Override
    public void shoot() {
        System.out.println("Shooting bullet with damage : " + bullet.getDamage() + " and speed : " + speed + " and direction : " + direction);
    }


}
