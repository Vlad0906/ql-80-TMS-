package lesson10.objectCloning;

public class Id{
    /*
    Создать программу для реализации поверхностного и глубокого клонирования объекта
класса User. Пусть на вход программе будет передаваться тип операции клонирования
(поверхностное клонирование или глубокое), а также id юзера для клонирования
     */

    private String name;

    Id(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
