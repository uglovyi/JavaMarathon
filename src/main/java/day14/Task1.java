package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("ss.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            int num, count = 0, sum = 0;
            String str="";
            //Вариант 1
//            while (scanner.hasNext()) {
//                num = scanner.nextInt();
//                count++;
//                sum += num;
//            }
//            scanner.close();
//            if (count != 10) {
//                throw new IOException("Некорректный входной файл");
//            }

            //Вариант 2
            while (scanner.hasNext()) {
                str = scanner.nextLine();
            }
            scanner.close();
            String[] strdim = str.split(" ");
            if(strdim.length != 10){
                throw new IOException("Некорректный входной файл");
            }
            for (String strNum: strdim) {
                sum += Integer.parseInt(strNum);
            }

            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
