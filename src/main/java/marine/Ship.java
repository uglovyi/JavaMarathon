package marine;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ship {
    private DescsNumber decksNumber;
    private List<Cell> location;
    private PlayingField field;
    private Set<Cell> halo;
    private ShipStatus status;
    static final int MAX_SHIPS = 10;


    private Ship(DescsNumber decksNumber, PlayingField field, List<Cell> location) {
        this.decksNumber = decksNumber;
        this.field = field;
        this.location = new ArrayList<>(location);
        this.halo = calcHalo();
        status = ShipStatus.INTACT;
    }

    //Фабрика
    public static Ship valueOf(DescsNumber decksNumber, PlayingField field, List<Cell> location){
        Ship ship = new Ship(decksNumber, field, location);
        if(!ship.validate()){
            return null;
        }
        field.addShip(ship);
        return ship;
    }

    protected Set<Cell> calcHalo(){
        halo = new HashSet<>();
        for (Cell cell: this.location) {
            for (int i = -1; i <= 1; i++) {
                if(cell.getX() + i < PlayingField.MIN_X || cell.getX() + i > PlayingField.MAX_X)
                    continue;
                for (int j = -1; j <= 1; j++) {
                    if(cell.getY() + j < PlayingField.MIN_Y || cell.getY() + j > PlayingField.MAX_Y)
                        continue;
                    if(i == 0 && j == 0)
                        continue;

                    halo.add(field.getCell(cell.getX() + i, cell.getY() + j));
                }
            }
        }
        return halo;
    }

    protected boolean validate(){
        if(location.size() != decksNumber.descsCount) {
            System.out.println("Количество координат не соответствует кол-ву палуб");
            return false;//throw IllegalArgumentException;
        }
        switch (decksNumber.descsCount){
            case 2:{
                int x0 = location.get(0).getX();
                int y0 = location.get(0).getY();
                int x1 = location.get(1).getX();
                int y1 = location.get(1).getY();
                if(!(x0 == x1 && Math.abs(y0-y1) == 1 || y0 == y1 && Math.abs(x0-x1) == 1)){
                    System.out.println("Клетки должны стоять рядом либо вертикально либо горизонтально");
                    return false;
                }
                break;
            }
            case 3:{
                int x0 = location.get(0).getX();
                int y0 = location.get(0).getY();
                int x1 = location.get(1).getX();
                int y1 = location.get(1).getY();
                int x2 = location.get(2).getX();
                int y2 = location.get(2).getY();
                if(!((x0 == x1 && Math.abs(y0-y1) == 1 || y0 == y1 && Math.abs(x0-x1) == 1) && (x1 == x2 && Math.abs(y1-y2) == 1 || y1 == y2 && Math.abs(x1-x2) == 1))){
                    System.out.println("Клетки должны стоять рядом либо вертикально либо горизонтально");
                    return false;
                }
                break;
            }
            case 4:{
                int x0 = location.get(0).getX();
                int y0 = location.get(0).getY();
                int x1 = location.get(1).getX();
                int y1 = location.get(1).getY();
                int x2 = location.get(2).getX();
                int y2 = location.get(2).getY();
                int x3 = location.get(3).getX();
                int y3 = location.get(3).getY();
                if(!((x0 == x1 && Math.abs(y0-y1) == 1 || y0 == y1 && Math.abs(x0-x1) == 1) && (x1 == x2 && Math.abs(y1-y2) == 1 || y1 == y2 && Math.abs(x1-x2) == 1) && (x2 == x3 && Math.abs(y2-y3) == 1 || y2 == y3 && Math.abs(x2-x3) == 1))){
                    System.out.println("Клетки должны стоять рядом либо вертикально либо горизонтально");
                    return false;
                }
                break;
            }
        }

        for (Cell cell: location) {
            if(!this.field.checkCoordinate(cell.getX(), cell.getY())){
                return false;
            }

            if(!this.field.checkTouchShips(cell.getX(), cell.getY())){
                return false;
            }
        }

        return true;
    }

    public List<Cell> getLocation() {
        return location;
    }

    public Set<Cell> getHalo() {
        return halo;
    }

    public ShipStatus getStatus() {
        return status;
    }

    public void hit() {
        int hitCount = 0;
        for (Cell locationCell: location) {
            if(locationCell.getStatus() == CellStatus.OPEN) hitCount ++;
        }
        if(hitCount == decksNumber.descsCount){
            this.status = ShipStatus.DESTROYED;
            System.out.format("Корабль %s УБИТ! %n", this);
        } else{
            this.status = ShipStatus.WOUNDED;
            System.out.format("Корабль %s РАНЕН! %n", this);
        }

    }

    @Override
    public String toString() {
        return decksNumber.description;
    }
}
