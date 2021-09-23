package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Courier courier1 = new Courier(warehouse1);
        Courier courier11 = new Courier(warehouse1);
        Picker picker1 = new Picker(warehouse1);
        businessProcess(picker1);
        businessProcess(courier1);
        businessProcess(courier11);
        System.out.println("Собрано " + warehouse1.getCountPickedOrders());
        System.out.println("Доставлено " + warehouse1.getCountDeliveredOrders());
        System.out.println("ЗП picker1 " + picker1.getSalary());
        System.out.println("ЗП courier1 " + courier1.getSalary());
        System.out.println("ЗП courier11 " + courier11.getSalary());
        Courier.bonusToAll();

        Warehouse warehouse2 = new Warehouse();
        Courier courier2 = new Courier(warehouse2);
        Picker picker2 = new Picker(warehouse2);
        courier2.bonus();
        picker2.bonus();
    }
    static void businessProcess(Worker worker){

        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

}
