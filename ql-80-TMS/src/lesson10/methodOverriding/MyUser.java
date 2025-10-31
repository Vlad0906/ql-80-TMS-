package lesson10.methodOverriding;

public class MyUser {
    /*
    Создать класс для описания пользователя системы. Переопределить в классе методы
toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
значением полей и сравнить с помощью метода equals.
     */
    public static void main(String[] args) {
        compareUsers();
    }

    public static void compareUsers(){
        User nikita = new User("Никита", 18);
        nikita.setPassword("qwertyu");

        User anton = new User("Антон", 29);
        anton.setPassword("qwert");

        User dima = new User("Дима", 31);
        dima.setPassword("qwertyu");

        System.out.println("I compare the first user with the second - " + nikita.equals(anton));
        System.out.println("I compare the first user with the third - " + nikita.equals(dima));
        System.out.println("I compare the second user with the third - " + anton.equals(dima));

        System.out.println("-".repeat(50));

        dima.setUserName("Никита");
        dima.setAge(18);

        System.out.println("I compare the first user with the modified third one - " + nikita.equals(dima));
        System.out.println("I compare the second user with the modified third one - " + anton.equals(dima));
    }
}
