package day9.Task2;

public class Triangle extends Figure{
    private int side1, side2, side3;

    public Triangle(int side1, int side2, int side3, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.setColor(color);
    }

    @Override
    public double area() {
        float pp = (float)(side1 + side2 + side3)/2.f;
        return Math.sqrt(pp*(pp-side1)*(pp-side2)*(pp-side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
