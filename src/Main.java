package src;

import src.calcs.Calculations;
import src.shapes.Circle;
import src.shapes.Shape;
import src.shapes.Square;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args){
        Calculations calcs = new Calculations();

        Circle circle = new Circle();
        circle.setRadius(2);
        circle.setPosX(1);
        circle.setPosY(2);

        Square square = new Square();
        square.setSide(4);
        square.setPosX(4);
        square.setPosY(5);

        Shape[] shapes = new Shape[2];
        shapes[0] = circle;
        shapes[1] = square;

        System.out.println("Total Area: " + calcs.calculateTotalArea(shapes));
        System.out.println("Distance: " + calcs.calculateDistance(circle, square));

    }

}
