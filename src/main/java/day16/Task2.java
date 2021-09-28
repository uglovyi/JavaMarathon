package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        try {
            File file1 = new File("file1.txt");

            PrintWriter printWriter1 = new PrintWriter(file1);

            //Сгенерим случайные числа и потом все сразу запишем в файл 1
            Random random = new Random();
            StringJoiner stringJoiner = new StringJoiner(" ");
            for (int i = 0; i < 1000; i++) {
                stringJoiner.add(String.valueOf(random.nextInt(101)));
            }
            printWriter1.println(stringJoiner);
            printWriter1.close();

            //Прочитаем числа из файла 1, получим средние по 20 и все сразу запишем в файл 2
            stringJoiner = new StringJoiner(" ");
            Scanner scanner2 = new Scanner(file1);
            String[] stringArray2 = scanner2.nextLine().split(" ");
            List<Float> resultArray = new ArrayList<>();
            int counter = 0, sum = 0;
            for (String string2:stringArray2) {
                counter ++;
                sum += Integer.parseInt(string2);
                if(counter%20 == 0){
                    stringJoiner.add(String.valueOf(sum/20F));
                    sum = 0;
                }
            }

            File file2 = new File("file2.txt");
            PrintWriter printWriter2 = new PrintWriter(file2);
            printWriter2.println(stringJoiner);
            printWriter2.close();

            //Получим среднюю из файла 2 и выведем на экран
            printResult(file2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void printResult(File file) {
        Scanner scanner2;
        try {
            scanner2 = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        String[] stringArray3 = scanner2.nextLine().split(" ");
        float sum = 0;
        for (String string3: stringArray3
             ) {
            sum += Float.parseFloat(string3);
        }
        System.out.println((int)sum);
        scanner2.close();
    }
}
