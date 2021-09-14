package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            if(num2 == 0){
                break;
            }
            System.out.println(num1/num2);
        }
    }
}
