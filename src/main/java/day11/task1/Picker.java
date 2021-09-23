package day11.task1;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class Picker implements Worker{
    int salary;
    boolean isPayed;
    Warehouse warehouse;
    public static List<WeakReference<Picker>> instances = new ArrayList<>();

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
        instances.add(new java.lang.ref.WeakReference<Picker>(this));
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.addPickedOrders();
        //bonus(warehouse);
    }

    @Override
    public void bonus() {
        if(isPayed)
            System.out.println("Бонус уже был выплачен");
        else if(warehouse.getCountPickedOrders() >= 10000){
            salary += 70000;
            isPayed = true;
        }
        else
            System.out.println("Бонус пока не доступен");
    }

    public static void bonusToAll() {
        Picker picker;
        for (WeakReference<Picker> instance:
             Picker.instances) {

            picker = instance.get();
            if(picker==null) continue;

            if(picker.isPayed)
                System.out.println("Бонус уже был выплачен для " + picker);
            else if(picker.warehouse.getCountPickedOrders() >= 10000){
                picker.salary += 70000;
                picker.isPayed = true;
            }
            else
                System.out.println("Бонус пока не доступен для " + picker);

        }
    }

}
