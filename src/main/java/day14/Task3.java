package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        parseFileToObjList(file);

    }
    public static List<Person> parseFileToObjList(File file){
        List<Person> persons = new ArrayList<>();
        Scanner scanner;
        try {
            scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String[] strdim = scanner.nextLine().split(" ");
                if (strdim.length != 2 || Integer.parseInt(strdim[1]) <= 0) {
                    throw new IOException("Некорректный входной файл");
                }
                persons.add(new Person(strdim[0], Integer.parseInt(strdim[1])));

            }
            scanner.close();

            System.out.println(persons);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
            persons.clear();
        }

        return persons;
    }
}
