package day9.Task2;

public class Rectangle  extends Figure{
    private int height, width;

    public Rectangle(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.setColor(color);

    }

    @Override
    public double area() {
        return height*width;
    }

    @Override
    public double perimeter() {
        return (height+width)*2;
    }
}
