package lesson07.Apple;

import java.lang.reflect.Field;

public class MyApple {
    /*
    Создать класс Apple и добавить в него поле color с модификатором доступа private и
инициализировать его. В методе main другого класса создать объект Apple, и не
используя сеттеры изменить значение поля color
     */
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Apple apple = new Apple();
        apple.print();

        Field field = Apple.class.getDeclaredField("color");
        field.setAccessible(true);
        field.set(apple, "blue");

        apple.print();
    }
}
