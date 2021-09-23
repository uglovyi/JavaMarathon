package day11.task1;

public class Warehouse {
    private int countPickedOrders, countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void addPickedOrders(){
        countPickedOrders ++;
    }
    public void AddDeliveredOrders(){
        countDeliveredOrders ++;
    }
    @Override
    public String toString() {
        return "Warehouse{}";
    }
}
