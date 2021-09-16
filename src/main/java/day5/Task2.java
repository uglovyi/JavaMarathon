package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike car = new Motorbike("green", "zaz", 1978);

        System.out.println("Color is " + car.getColor());
        System.out.println("Model is " + car.getModel());
        System.out.println("Year is " + car.getYear());

    }
}
