package day8;

public class Task1 {
    public static void main(String[] args) {
        String s1 = "";
        StringBuilder stb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            s1 = s1 + i + " ";
        }
        long stopTime = System.currentTimeMillis();
        System.out.println(s1);
        System.out.println("Длительность работы %l мс.: " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            stb.append(i);
            stb.append(' ');
        }
        stopTime = System.currentTimeMillis();
        System.out.println(stb);
        System.out.println("Длительность работы %l в мс.: " + (stopTime - startTime));
    }
}
