package lesson09.marker;

public class Human implements Cloneable {
    /*
    Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable
    */
    private String sex;
    private int age;

    Human(String sex, int age){
        this.sex = sex;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public Human clone() throws CloneNotSupportedException {
        return (Human) super.clone();
    }

    @Override
    public String toString() {
        return "Human(sex - '" + sex + "', age = " + age + ")";
    }

}
