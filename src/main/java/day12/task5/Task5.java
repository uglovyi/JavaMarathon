package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("band1", 1978,
                new ArrayList<>(Arrays.asList(new MusicArtist("Bob", 1955), new MusicArtist("July", 1945), new MusicArtist("Harry", 1958))));
        MusicBand musicBand2 = new MusicBand("band2", 2001,
                new ArrayList<>(Arrays.asList(new MusicArtist("Bill", 1978), new MusicArtist("Alex", 1981))));

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();

    }
}
