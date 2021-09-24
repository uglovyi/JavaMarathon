package day12.task5;

import java.util.List;

public class MusicBand {
    String name;
    int year;
    List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public static void transferMembers(MusicBand musicBandFrom, MusicBand musicBandTo){
        musicBandTo.members.addAll(musicBandFrom.members);
        musicBandFrom.members.clear();
    }

    public void printMembers(){
        System.out.println(getMembers());
    }
}
