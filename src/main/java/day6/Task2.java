package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("boing", 1971, 100, 2000);
        airplane.setLength(150);
        airplane.setYear(1980);
        airplane.fillUp(10);
        airplane.fillUp(20);
        airplane.info();
    }
}
