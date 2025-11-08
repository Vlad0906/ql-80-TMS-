package lesson08.beast;

public class MyAnimal {
    public static void main(String[] args) {
        /*
    Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
Переопределить методы voice(), eat(String food) чтобы они выводили верную
информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
или другую строку то он будет недоволен
     */

        Dog dog = new Dog();
        dog.voice();
        dog.eat("meat");

        System.out.println("-".repeat(50));

        Tiger tiger = new Tiger();
        tiger.voice();
        tiger.eat("vegetable");

        System.out.println("-".repeat(50));

        Rabbit rabbit = new Rabbit();
        rabbit.voice();
        rabbit.eat("grass");
    }
}
