package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        parseFileToStringList(file);
    }

    public  static List<String> parseFileToStringList(File file){
        Scanner scanner;
        List<String> inputData = new ArrayList<>();
        try {
            scanner = new Scanner(file);
            String str;

            while (scanner.hasNext()) {
                str = scanner.nextLine();
                String[] strdim = str.split(" ");
                if(strdim.length != 2 || Integer.parseInt(strdim[1]) <= 0) {
                    throw new IOException("Некорректный входной файл");
                }
                inputData.add(str);
            }
            scanner.close();

            System.out.println(inputData);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
            inputData.clear();
        }
        return inputData;
    }
}
