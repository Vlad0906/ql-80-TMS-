package lesson08.beast;

public class Rabbit extends Animal{
    /*
    Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
Переопределить методы voice(), eat(String food) чтобы они выводили верную
информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
или другую строку то он будет недоволен
     */

    @Override
    public void voice(){
        System.out.println("The rabbit grinds its teeth loudly!");
    }

    @Override
    public void eat(String food){
        if (food.equalsIgnoreCase("Grass") || food.equalsIgnoreCase("Vegetable")){
            System.out.println("Rabbit loves to eat " + food);
        } else {
            System.out.println("The rabbit won't eat that.");
        }
    }
}
