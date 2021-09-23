package day11.task1;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class Courier implements Worker{
    int salary;
    boolean isPayed = false;
    Warehouse warehouse;
    public static List<WeakReference<Courier>> instances = new ArrayList<>();

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
        instances.add(new java.lang.ref.WeakReference<Courier>(this));
    }

    @Override
    public String toString() {
        return "Courier{" +
                hashCode() +
                '}';
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.AddDeliveredOrders();
        //bonus(warehouse);
    }

    @Override
    public void bonus() {
        if(isPayed)
            System.out.println("Бонус уже был выплачен");
        else if(warehouse.getCountDeliveredOrders() >= 10000){
            salary += 50000;
            isPayed = true;
        }
        else
            System.out.println("Бонус пока не доступен");
    }

    public static void bonusToAll() {
        Courier courier;
        for (WeakReference<Courier> instance:
                Courier.instances) {

            courier = instance.get();
            if(courier==null) continue;

            if(courier.isPayed)
                System.out.println("Бонус уже был выплачен для " + courier);
            else if(courier.warehouse.getCountDeliveredOrders() >= 10000){
                courier.salary += 50000;
                System.out.println("Выдаем бонус " + courier);
                courier.isPayed = true;
            }
            else
                System.out.println("Бонус пока не доступен для " + courier);

        }
    }
}
