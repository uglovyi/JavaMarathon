package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] arr = new int[12][8];
        int maxStringIndex = 0;
        int max = 0;
        int maxStr;
        for (int i = 0; i < 3; i++) {
            maxStr = 0;
            for (int y = 0; y < 4; y++) {
                arr[i][y] = rand.nextInt(50);
                maxStr += arr[i][y];
            }
            //System.out.println(Arrays.toString(arr[i]));
            if (max < maxStr) { max = maxStr; maxStringIndex = i;}
        }
        System.out.println(maxStringIndex);
        //System.out.println(Arrays.toString(arr));
    }
}
