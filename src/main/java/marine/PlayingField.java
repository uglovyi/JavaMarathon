package marine;

import java.util.HashSet;
import java.util.Set;

public class PlayingField {
    Set<Cell> field = new HashSet<>();
    Set<Ship> ships = new HashSet<>();
    static final int MAX_X = 9;
    static final int MAX_Y = 9;
    static final int MIN_X = 0;
    static final int MIN_Y = 0;

    public PlayingField() {
        for (int x = MIN_X; x <= MAX_X; x++) {
            for (int y = MIN_Y; y <= MAX_Y; y++) {
                field.add(new Cell(x, y));
            }
        }
    }

    public boolean checkCoordinate(int x, int y){
        if(!((x >= MIN_X) && (x <= MAX_X) && (y >= MIN_Y) && (y <= MAX_Y))){
            System.out.format("Координата [%d, %d] не попадает в игровое поле%n", x, y);
            return false;
        }

        return true;
    }

    public boolean checkTouchShips(int x, int y){

        for (Ship ship: ships) {
            if(ship.getLocation().contains(getCell(x, y))){
                System.out.format("Координата [%d, %d] занята кораблем %s%n", x, y, ship);
                return false;
            }
            if(ship.getHalo().contains(getCell(x, y))){
                System.out.format("Координата [%d, %d] занята ореолом корабля %s%n", x, y, ship);
                return false;
            }

        }

        return true;
    }

    public void shootAtCell(int x, int y){
        Cell cell = getCell(x, y);
        if(cell.getStatus() == CellStatus.OPEN){
            System.out.format("Координата %s уже открыта %n", cell);
            return;
        }
        cell.setStatus(CellStatus.OPEN);
        for (Ship ship: ships) {
            if(ship.getLocation().contains(getCell(x, y))){
                ship.hit();
                return;
            }
        }
        System.out.format("Мимо!%n");
    }

    public boolean checkGameOver(){
        return ships.stream().filter(u -> u.getStatus()==ShipStatus.DESTROYED).count() == Ship.MAX_SHIPS;
    }

    public Cell getCell(int x, int y){
        return field.stream().filter(u -> u.getX()==x && u.getY()==y).findFirst().get();
    }

    public void addShip(Ship ship){
        ships.add(ship);
    }

    public void printPlayingField(){
        for (int y = MIN_Y; y <= MAX_Y; y++) {
            for (int x = MIN_X; x <= MAX_X; x++) {
                boolean cellBusy = false;
                for (Ship ship: ships) {
                    if(ship.getLocation().contains(getCell(x, y))){
                        //ship.hit();
                        cellBusy = true;
                        break;
                    }
                }
                boolean cellHalo = false;
                for (Ship ship: ships) {
                    if(ship.getHalo().contains(getCell(x, y))){
                        //ship.hit();
                        cellHalo = true;
                        break;
                    }
                }
                if(cellBusy && getCell(x, y).getStatus() == CellStatus.CLOSE) {
                    System.out.print("\uD83D\uDEE5");
                }else if(cellBusy && getCell(x, y).getStatus() == CellStatus.OPEN){
                    System.out.print("\uD83D\uDFE5");
                }else if(cellHalo){
                    System.out.print("\uD83D\uDFE6");
                }else{
                    System.out.print("⬜");
                }
            }
            System.out.println();
        }

    }
}
