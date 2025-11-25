package lesson15.smallTasks;

public class MyAnimals {
    /*
    Создать класс, который будет хранить в себе коллекцию с названиями животных.
Реализовать методы удаления и добавления животных по следующим правилам:
добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
объекта этого класса в main методе другого класса.
     */
    public static void main(String[] args) {
        AnimalCatalog catalog = new AnimalCatalog();
        catalog.add("Tiger");
        catalog.add("Lion");
        catalog.add("Cat");
        catalog.add("Dog");
        catalog.delete();
        catalog.add("Rabbit");
        catalog.delete();

        catalog.print();
    }
}
