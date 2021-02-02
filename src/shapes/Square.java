package src.shapes;

public class Square extends Shape {

    private int side;

    @Override
    public double area() {
        return this.side * this.side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
