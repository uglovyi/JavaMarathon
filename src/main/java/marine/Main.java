package marine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PlayingField playingField1 = new PlayingField();
        PlayingField playingField2 = new PlayingField();

        Player player1 = new Player("Player 1", playingField1);
        Player player2 = new Player("Player 2", playingField2);

        player1.fillPlayingField();
        player2.fillPlayingField();

        Random random = new Random();
        int rnd = random.nextInt(2);
        Player[] playersArray;
        if(rnd == 0)
            playersArray = new Player[]{player1, player2};
        else
            playersArray = new Player[]{player2, player1};

        int counter = 0;
        Player winner;

        System.out.println();
        System.out.println("Начинаем игру!");
        while(true){
            Player.makeMove(playersArray[counter]);
            if(playingField2.checkGameOver()){
                winner = player1;
                break;
            }
            if(playingField1.checkGameOver()){
                winner = player2;
                break;
            }
            counter = (counter == 0) ? 1 : 0;
        }
        System.out.println("Игра закончена! Победил " + winner);

        playingField1.printPlayingField();
        System.out.println();
        playingField2.printPlayingField();

    }
}
