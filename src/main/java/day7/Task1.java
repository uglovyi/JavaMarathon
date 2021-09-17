package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("boing", 1978, 1000, 800);
        Airplane airplane2 = new Airplane("boing", 1979, 1800, 800);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}