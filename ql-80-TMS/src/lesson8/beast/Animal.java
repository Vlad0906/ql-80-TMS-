package lesson8.beast;

public class Animal {
    /*
    Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
Переопределить методы voice(), eat(String food) чтобы они выводили верную
информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
или другую строку то он будет недоволен
     */

    public void voice(){
        System.out.println("Animal gives voice!");
    }

    public void eat(String food){
        System.out.println("The animal eats all the food!");
    }
}
