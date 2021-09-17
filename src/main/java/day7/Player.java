package day7;

public class Player {
    private int stamina;
    private static int MAX_STAMINA = 100;
    private static int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if(countPlayers < 6) countPlayers += 1;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run(){
        if(stamina > 1){
            stamina -= 1;
        }
        else if(stamina == 1){
            countPlayers --;
            stamina = 0;
        }
    }

    public static void info(){
        if(countPlayers < 6)
            System.out.println("Команды неполные. На поле еще есть " +(6-countPlayers)+" свободных мест");
        else
            System.out.println("На поле нет свободных мест");

    }
}
