package day12.task3;

public class MusicBand {
    String name;
    int year;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
