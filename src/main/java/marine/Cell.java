package marine;

public class Cell {
    private int x, y;
    private CellStatus status;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.status = CellStatus.CLOSE;
    }

    public CellStatus getStatus() {
        return status;
    }

    public void setStatus(CellStatus status) {
        this.status = status;
    }



    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
