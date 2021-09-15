package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter teh number");
        int num = scanner.nextInt();

        int[] arr = new int[num];
        for (int i=0;i<num;i++){
            arr[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        int count8 = 0;
        int count1 = 0;
        int countChet = 0;
        int countNechet = 0;
        int sum = 0;
        for (int elem:arr
             ) {
            if(elem>8) count8++;
            if(elem==1) count1++;
            if(elem%2==0) countChet++;
            if(elem%2>0) countNechet++;
            sum += elem;
        }
        System.out.println(count8);
        System.out.println(count1);
        System.out.println(countChet);
        System.out.println(countNechet);
        System.out.println(sum);
    }
}
