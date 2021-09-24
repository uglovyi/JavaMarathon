package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("band1", 1978, new ArrayList<String>(Arrays.asList("Bob", "July", "Harry")));
        MusicBand musicBand2 = new MusicBand("band2", 2001, new ArrayList<String>(Arrays.asList("Bill", "Alex")));

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
