package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("ss.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            int sum = 0;

            String[] strdim = new String[0];

            while (scanner.hasNext()) {
                strdim = scanner.nextLine().split(" ");
            }
            scanner.close();
            for (String strNum: strdim) {
                sum += Integer.parseInt(strNum);
            }
            if (strdim.length > 0) {
                double y = (double)sum / strdim.length;
                System.out.format(y + " --> %.3f", y);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

