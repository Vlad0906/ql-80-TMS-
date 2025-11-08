package lesson08.beast;

public class Dog extends Animal{
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
        System.out.println("The dog barks!");
    }

    @Override
    public void eat(String food){
        if (food.equalsIgnoreCase("Meat") || food.equalsIgnoreCase("Bone")){
            System.out.println("The dog loves to eat " + food);
        } else {
            System.out.println("Dogs don't eat that. " +
                    "You definitely shouldn't keep dogs.");
        }
    }

}
