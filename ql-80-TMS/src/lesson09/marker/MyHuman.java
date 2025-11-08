package lesson09.marker;

public class MyHuman {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*
        Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable
        */
        showAnExampleOfTheMarker();
    }

    public static void showAnExampleOfTheMarker() throws CloneNotSupportedException {
        Human human = new Human("man", 56);
        Human cloneHuman = human.clone();

        System.out.println("Original - " + human);
        System.out.println("Copy of a human - " + cloneHuman);

        System.out.println("-".repeat(50));

        human.setAge(25);

        System.out.println("Original - " + human);
        System.out.println("Copy of a human - " + cloneHuman);
    }
}
