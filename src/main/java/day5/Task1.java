package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("green");
        car.setYear(1978);
        car.setModel("zaz");
        System.out.println("Color is " + car.getColor());
        System.out.println("Model is " + car.getModel());
        System.out.println("Year is " + car.getYear());
    }
}

