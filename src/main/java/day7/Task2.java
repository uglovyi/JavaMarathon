package day7;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        Player[] arr = new Player[8];
        for (int y = 0; y < 8; y++) {
            arr[y] = new Player(random.nextInt(11) + 90);
        }
        Player.info();

        for (int i = 0; i < 100; i++) {
            arr[0].run();
        }
        Player.info();
    }
}
