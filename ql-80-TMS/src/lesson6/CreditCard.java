package lesson6;

public class CreditCard {
    /*
    Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
выводит текущую информацию о карточке. Напишите программу, которая создает три
объекта класса CreditCard у которых заданы номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
третьей. Выведите на экран текущее состояние всех трех карточек
     */

    int accountNumber;
    double currentAccountBalance;

    CreditCard(int accountNumber, double currentAccountBalance){
        this.accountNumber = accountNumber;
        this.currentAccountBalance = currentAccountBalance;
    }

    double calculateTheAmount(double ... money) {
        for(double addition : money){
            currentAccountBalance += addition;
        }
        return currentAccountBalance;
    }

    double withdrawMoney(double ... money){
        for(double addition : money){
            currentAccountBalance -= addition;
        }
        return currentAccountBalance;
    }

    void display(){
        System.out.println("Account number of this card - " + accountNumber + "," +
                " balance is " + currentAccountBalance);
    }
}
