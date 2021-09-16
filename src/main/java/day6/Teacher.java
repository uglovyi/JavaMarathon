package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

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
        Random random = new Random();
        int rnd = random.nextInt(4) + 2;
        String grade = "неизвестно";
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
            case 5:
                grade =  "отлично";
                break;
        }
        System.out.println("Преподаватель "+this.getName()+" оценил студента с именем "+student.getName()+" по предмету "+this.getSubject()+" на оценку "+grade+".");
    }
}
