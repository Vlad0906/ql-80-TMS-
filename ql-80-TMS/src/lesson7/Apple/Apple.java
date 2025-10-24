package lesson7.Apple;

public class Apple {
    /*
    Создать класс Apple и добавить в него поле color с модификатором доступа private и
инициализировать его. В методе main другого класса создать объект Apple, и не
используя сеттеры изменить значение поля color
     */

    private String color = "red";

    public void print(){
        System.out.println("Apple color - " + color);
    }
}
