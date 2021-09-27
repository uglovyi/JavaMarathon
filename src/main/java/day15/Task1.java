package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("shoes.csv");
        try {
            Scanner scanner = new Scanner(file);
            List<String> list = new ArrayList<>();

            while (scanner.hasNext()){
                String[] dim = scanner.nextLine().split(";");
                if("0".equals(dim[2])){
                    //Вариант 1
                    list.add((new StringBuilder()).append(dim[0]).append(", ").append(dim[1]).append(", ").append(dim[2]).toString());
                    //Вариант 2
                    list.add(String.format("%s , %s, %s", dim[0], dim[1], dim[2]));
                }
            }
            for (String str:
                 list) {
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
