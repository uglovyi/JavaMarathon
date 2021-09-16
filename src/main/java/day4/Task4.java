package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = rand.nextInt(10000);
        }

    }
}
