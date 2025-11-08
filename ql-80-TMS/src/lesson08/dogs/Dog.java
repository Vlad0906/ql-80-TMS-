package lesson08.dogs;

public class Dog{
    /*
    Написать такой конструктор, который запретит создание объекта класса Dog в других
классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
способа
     */

   private Dog(){

   }

    public static void voice(){
        System.out.println("The dog barks");
    }

    public static void eat(){
        System.out.println("The dog eats meat and bones");
    }

    public static Dog createDog(){
       return new Dog();
    }
}
