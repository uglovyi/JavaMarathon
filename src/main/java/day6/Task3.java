package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher tech1 = new Teacher("Mila", "math");
        Teacher tech2 = new Teacher("Lena", "english");
        Student stud1 = new Student("Misha");
        tech1.evaluate(stud1);
        tech2.evaluate(stud1);
    }
}
