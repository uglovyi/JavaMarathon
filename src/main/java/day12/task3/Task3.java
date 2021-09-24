package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        List<MusicBand> list = new ArrayList<MusicBand>();
        int year;
        for (int i = 0; i < 12; i++) {
            year = random.nextInt(40) + 1978;
            list.add(new MusicBand("gr"+i, year));
        }
        Collections.shuffle(list);

        System.out.println(list);

        System.out.println(groupsAfter2000(list));
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> bands2000 = new ArrayList<>();
        for (MusicBand band:
             bands) {
            if (band.year > 2000) bands2000.add(band);
        }
        return bands2000;
    }
}
