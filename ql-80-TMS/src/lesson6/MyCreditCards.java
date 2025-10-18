package lesson6;

public class MyCreditCards {
    public static void main(String[] args) {
        /*
    Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
выводит текущую информацию о карточке. Напишите программу, которая создает три
объекта класса CreditCard у которых заданы номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
третьей. Выведите на экран текущее состояние всех трех карточек
     */

        CreditCard belarusbank = new CreditCard(111222333, 1570.50);
        CreditCard bankBelVeb = new CreditCard(444555666, 2760.10);
        CreditCard dabrabyt = new CreditCard(777888999, 3400.60);

        belarusbank.calculateTheAmount(370.45, 188.30, 50.70);
        belarusbank.display();

        bankBelVeb.calculateTheAmount(483.55, 1764.20);
        bankBelVeb.display();

        dabrabyt.withdrawMoney(497.35, 157.30);
        dabrabyt.display();
    }
}
