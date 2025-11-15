package lesson13.customException;

public class User {
    /*
    Создать класс, в котором будет статический метод. Этот метод принимает на вход три
параметра: login, password, confirmPassword. Все поля имеют тип данных String. Длина
login должна быть меньше 20 символов и не должен содержать пробелы. Если login не
соответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
password должна быть меньше 20 символов, не должен содержать пробелом и должен
содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
Если password не соответствует этим требованиям, необходимо выбросить
WrongPasswordException. WrongPasswordException и WrongLoginException -
пользовательские классы исключения с двумя конструкторами – один по умолчанию,
второй принимает сообщение исключения и передает его в конструктор класса Exception.
Метод возвращает true, если значения верны, false в противном случае.
     */

    public static boolean enterLoginAndPassword(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException{

        if(login.length() >= 20 || login.contains(" ")){
            throw new WrongLoginException("Incorrect login! " +
                    "The login must be less than 20 characters and must not contain spaces.");
        } else if (password.length() >= 20 || password.contains(" ") || !(password.matches(".*\\d.*"))){
            throw new WrongPasswordException("Incorrect password entry! " +
                    "The password must be less than 20 characters long, " +
                    "must not contain spaces, and must contain at least one number.");
        } else if (!(password.equals(confirmPassword))){
            throw new WrongPasswordException("The repeated password is incorrect.");
        } else{
            System.out.println("Authorization was successful!");
            return true;
        }
    }
}
