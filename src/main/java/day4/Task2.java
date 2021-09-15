package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = rand.nextInt(10000);
        }
        int max = 0;
        int min = 10000;
        int count0 = 0;
        int sum0 = 0;
        for (int elem : arr
        ) {
            if (elem > max) {
                max = elem;
            }
            if (elem < min) {
                min = elem;
            }
            if (elem % 10 == 0) {
                count0++;
                sum0 += elem;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(count0);
        System.out.println(sum0);
    }
}
