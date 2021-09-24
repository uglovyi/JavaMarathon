package day12.task5;

public class MusicArtist {
    String name;
    int year;

    public MusicArtist(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
