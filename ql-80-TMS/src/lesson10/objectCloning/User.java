package lesson10.objectCloning;

public class User {
        /*
        Создать программу для реализации поверхностного и глубокого клонирования объекта
класса User. Пусть на вход программе будет передаваться тип операции клонирования
(поверхностное клонирование или глубокое), а также id юзера для клонирования
         */
   private String name;
   private int age;
   private Id id;

    User(String name, int age, Id id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id){
        this.id = id;
    }

    public static User copySuperficially(User user){
        return new User(user.getName(), user.getAge(), user.getId());
    }

    public static User copyDeep(User user){
        Id copyId = new Id(user.getId().getName());
        return new User(user.getName(), user.getAge(), copyId);
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + ", id=" + id + "}";
    }

}
