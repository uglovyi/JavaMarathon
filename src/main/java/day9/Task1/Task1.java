package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Gyt", "gr1");
        Teacher techer = new Teacher("Bob", "music");
        System.out.println(student.getGroupName());
        System.out.println(techer.getSubjectName());
        student.printInfo();
        techer.printInfo();
    }
}
