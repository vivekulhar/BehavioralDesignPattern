package dev.vivek.Flyweight.PUBG1;

import java.awt.image.BufferedImage;

public class Bullet {
    private double radius;
    private double weight;
    private String color;
    private int damage;
    private BufferedImage image;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
    public Bullet(){

    }
    public Bullet(Bullet bullet){
        this.radius = bullet.radius;
        this.weight = bullet.weight;
        this.color = bullet.color;
        this.damage = bullet.damage;
        this.image = bullet.image;
    }

}
