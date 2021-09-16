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

class Car {
    private String model;
    private String color;
    private int year;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
