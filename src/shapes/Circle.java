package src.shapes;

import src.abilities.IRollable;

public class Circle extends Shape implements IRollable {
    public int radius;

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void roll() {
        System.out.println("Roll!");
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
