package marine;

import java.util.*;

public class Player {
    private String name;
    private PlayingField field;
    private static Player player1;
    private static Player player2;
    private static int counter;

    public Player(String name, PlayingField field) {
        this.name = name;
        this.field = field;
        counter ++;
        if(Player.counter == 1) Player.player1 = this;
        if(Player.counter == 2) Player.player2 = this;
    }

    public void fillPlayingField(){
        System.out.println();
        System.out.println("Начнем расставлять корабли для " + this);
        fillShipCoordinates(DescsNumber.FOURDESC);
        fillShipCoordinates(DescsNumber.THREEDESC);
        fillShipCoordinates(DescsNumber.THREEDESC);
        fillShipCoordinates(DescsNumber.TWODESC);
        fillShipCoordinates(DescsNumber.TWODESC);
        fillShipCoordinates(DescsNumber.TWODESC);
        fillShipCoordinates(DescsNumber.ONEDESC);
        fillShipCoordinates(DescsNumber.ONEDESC);
        fillShipCoordinates(DescsNumber.ONEDESC);
        fillShipCoordinates(DescsNumber.ONEDESC);
    }

    private void fillShipCoordinates(DescsNumber descsNumber){
        Scanner scanner = new Scanner(System.in);
        while (true){
            String text1="", text2="";
            switch (descsNumber.descsCount){
                case 4:{
                    text1 = "четырехпалубного";
                    text2 = "x1,y1;x2,y2;x3,y3;x4,y4";
                    break;
                }
                case 3:{
                    text1 = "трехпалубного";
                    text2 = "x1,y1;x2,y2;x3,y3";
                    break;
                }
                case 2:{
                    text1 = "двухпалубного";
                    text2 = "x1,y1;x2,y2";
                    break;
                }
                case 1:{
                    text1 = "однопалубного";
                    text2 = "x1,y1";
                    break;
                }
            }
            System.out.format("Введи координаты %s корабля (формат %s)%n", text1, text2);
            String text = scanner.nextLine();
            String[] coordinates = text.split(";");
            if (coordinates.length != descsNumber.descsCount) {
                System.out.format("Надо ввести %d координаты в формате %s%n", descsNumber.descsCount, text2);
                continue;
            }
            int i = 0;
            List<Cell> shipCoordinates = new ArrayList<>();
            for (String coordinate: coordinates
            ) {
                String[] position = coordinate.split(",");
                if(position.length != 2){
                    System.out.format("Координата №%d должна вводится в формате x,y", i);
                    break;
                }
                try {
                    int x = Integer.parseInt(position[0]);
                    int y = Integer.parseInt(position[1]);

                    shipCoordinates.add(this.field.getCell(x, y));

                } catch (NumberFormatException e){
                    System.out.format("Координата №%d должна вводится в формате x,y и содержать только числа%n", i);
                    break;
                }
                i ++;

            }

            if(descsNumber.descsCount == i) {
                Ship newShip = Ship.valueOf(descsNumber, field, shipCoordinates);
                if (newShip != null) {
                    System.out.format("Корабль %s для игрока %s добавлен на игровую доску %n", newShip, this);
                    break;
                }
            }
        }
    }

    public static void makeMove(Player player){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        while (true){
            System.out.format("Игрок %s вводит цель (формат x,y)%n", player);
            String text = scanner.nextLine();
            String[] position = text.split(",");
            if(position.length != 2){
                System.out.format("Цель должна вводится в формате x,y%n");
                continue;
            }
            try {
                int x = Integer.parseInt(position[0]);
                int y = Integer.parseInt(position[1]);

                if(player.equals(Player.player1))
                    Player.player2.field.shootAtCell(x, y);
                else
                    Player.player1.field.shootAtCell(x, y);
                break;

            } catch (NumberFormatException e){
                System.out.format("Цель должна вводится в формате x,y и содержать только числа%n");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
