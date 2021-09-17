package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    Random random = new Random();
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student student){
        int rnd = random.nextInt(4) + 2;
        String grade;
        switch (rnd){
            case 2:
                grade = "неудовлетворительно";
                break;
            case 3:
                grade =  "удовлетворительно";
                break;
            case 4:
                grade =  "хорошо";
                break;
            default:
                grade =  "отлично";
        }
        System.out.println("Преподаватель "+this.getName()+" оценил студента с именем "+student.getName()+" по предмету "+this.getSubject()+" на оценку "+grade+".");
    }
}
