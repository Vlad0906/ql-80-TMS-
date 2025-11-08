package lesson08.beast;

public class Tiger extends Animal{
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
        System.out.println("Tiger growls");
    }

    @Override
    public void eat(String food){
        if (food.equalsIgnoreCase("Meat") || food.equalsIgnoreCase("Fish")){
            System.out.println("The tiger loves to eat " + food);
        } else {
            System.out.println("Are you serious? Even a schoolchild knows tigers don't eat that." +
                    "Buy a ticket to the zoo now.");
        }
    }

}
