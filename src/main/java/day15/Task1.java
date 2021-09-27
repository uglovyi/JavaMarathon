package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("shoes.csv");
        try {
            Scanner scanner = new Scanner(file);
            List<String> list = new ArrayList<>();
            PrintWriter printWriter = new PrintWriter("shoes0.csv");

            while (scanner.hasNext()){
                String[] dim = scanner.nextLine().split(";");
                if("0".equals(dim[2])){
                    //Вариант 1
                    list.add((new StringBuilder()).append(dim[0]).append(", ").append(dim[1]).append(", ").append(dim[2]).toString());
                    //Вариант 2
                    list.add(String.format("%s , %s, %s", dim[0], dim[1], dim[2]));
                }
            }
            scanner.close();
            for (String str:
                 list) {
                printWriter.println(str);
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
