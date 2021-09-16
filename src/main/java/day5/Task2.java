package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike car = new Motorbike("green", "zaz", 1978);

        System.out.println("Color is " + car.getColor());
        System.out.println("Model is " + car.getModel());
        System.out.println("Year is " + car.getYear());

    }
}
class Motorbike {
    private String model;
    private String color;
    private int year;

    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

}
