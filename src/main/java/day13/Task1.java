package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");

        user1.sendMessage(user2, "Hi");
        user1.sendMessage(user2, "Как дела?");

        user2.sendMessage(user1, "Привет, User1");
        user2.sendMessage(user1, "Нормально");
        user2.sendMessage(user1, "А ты как?");

        user3.sendMessage(user1, "пришел домой");
        user3.sendMessage(user1, "пустой холодильник");
        user3.sendMessage(user1, "иду в магазин");

        user1.sendMessage(user3, "понятно");
        user1.sendMessage(user3, "далеко идти?");
        user1.sendMessage(user3, "удачи");

        user3.sendMessage(user1, "купил еду");

        MessageDatabase.showDialog(user1, user3);
    }
}
