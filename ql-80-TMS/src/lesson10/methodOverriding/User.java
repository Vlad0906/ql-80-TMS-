package lesson10.methodOverriding;

public class User {
    /*
    Создать класс для описания пользователя системы. Переопределить в классе методы
toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
значением полей и сравнить с помощью метода equals.
     */

    private String userName;
    private int age;
    private String password;

    User(String userName, int age){
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        User user = (User) object;

        if(this.getAge() != user.getAge()) return false;
        if(!(this.getPassword().equals(user.getPassword()))) return false;
        return this.getUserName().equals(user.getUserName());
    }

    @Override
    public int hashCode() {
        int userNameHash = 0;
        int passwordHash = 0;

        if (this.getUserName() != null) userNameHash = userName.hashCode();
        if (this.getPassword() != null) passwordHash = password.hashCode();

        return 11 * userNameHash + passwordHash + age;
    }

    @Override
    public String toString() {
        return "User:\n" +
                "userName = '" + userName + '\'' + ",\n" +
                "age = " + age + ",\n" +
                "password = '" + password + '\'' + ".";
    }
}
