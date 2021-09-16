package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(1977);
        car1.info();
        System.out.println(car1.yearDifference(2010));
        Motorbike motorbike1 = new Motorbike("ford","green", 1980);
        motorbike1.info();
        System.out.println(motorbike1.yearDifference(2010));
    }
}
