package src.calcs;

import src.shapes.Shape;

public class Calculations {

    public double calculateTotalArea(Shape[] shapes){
         double area = 0;
         for(int i=0; i<shapes.length; i++){
             area += shapes[i].area();
         }
         return area;
    }

    public double calculateDistance(Shape shape1, Shape shape2){
        int posX1 = shape1.getPosX();
        int posX2 = shape2.getPosX();
        int posY1 = shape1.getPosY();
        int posY2 = shape2.getPosY();
        return Math.sqrt(Math.pow(posX1 - posX2, 2) + Math.pow(posY1 - posY2, 2));
    }

}
