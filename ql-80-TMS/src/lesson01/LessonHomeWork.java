package lesson01;

public class LessonHomeWork {
    public static void main(String[] args) {
        calculateTheValue();
        calculateSumOfTwoNumbers();
        calculateSumOfThreeNumbers();
        roundOffAFractionalNumber();
        getTheResultWithARemainder();
        swapTheMeaning();
    }

    public static void calculateTheValue(){
        //Написать приложение, которое будет вычислять и выводить значение по формуле:
        //a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.

        int b = 6;
        int c = 11;

        double a = 4 * (b + c - 1) / 2;
        System.out.println("The result of the formula is: " + a);
    }

    public static void calculateSumOfTwoNumbers(){
        //В переменной n хранится двузначное число. Создайте программу,
        //вычисляющую и выводящую на экран сумму цифр n. Например: n =26,
        //в результате мы должны получить 8 (2+6)

        int n = 51;
        int divider = 10;
        int divisionResult = n / divider;
        int remainderOfDivision = n % divider;

        int sum = divisionResult + remainderOfDivision;

        System.out.println("Sum of digits n equal to: " + sum);
    }

    public static void calculateSumOfThreeNumbers(){
        //В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
        //выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
        //9 (1+2+6).

        int n = 392;
        int divisorByHundred = 100;
        int dividerByTen = 10;

        int resultDivisionByHundred = n / divisorByHundred;

        int numberOfHundreds = divisorByHundred * resultDivisionByHundred;
        int subtrahend = n - numberOfHundreds;
        int resultDivisionByTen = subtrahend / dividerByTen;

        int remainderOfDivision = n % dividerByTen;

        int sum = resultDivisionByHundred + resultDivisionByTen + remainderOfDivision;

        System.out.println("Sum of three numbers equal to: " + sum);

    }

    public static void roundOffAFractionalNumber(){
        //В переменной n хранится вещественное число с ненулевой дробной частью.
        //Создайте программу, округляющую число n до ближайшего целого и
        //выводящую результат на экран

        double number = 47.65;
        double unit = 1.0;
        double half = 0.5;
        int convertedNumber = (int) number;
        double comparisonNumber = number - convertedNumber;

        if (comparisonNumber >= half){
            comparisonNumber = unit - comparisonNumber;
            number += comparisonNumber;
        } else {
            number -= comparisonNumber;
        }
        System.out.println("The number to be rounded is: " + number);
    }

    public static void getTheResultWithARemainder(){
        //В переменных q и w хранятся два натуральных числа.
        //Создайте программу, выводящую на экран результат
        //деления q на w с остатком. Пример вывода программы (для случая,
        //когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.

        int q = 23;
        int w = 4;

        int divisionResult = q / w;
        int remainderOfDivision = q % w;

        System.out.println("The result of division is: " + divisionResult + "," +
                " remainder of division: " + remainderOfDivision);
    }

    public static void swapTheMeaning(){
        //Написать программу которая будет менять местами значение целочисленных
        //переменных. Пример:
        //int a = 1; int b = 2;
        ////код (ваше решение)
        //sout(a); //выведет 2
        //sout(b); //выведет 1

        int a = 11;
        int b = 7;

        a -= b;
        b += a;
        a = b - a;

        System.out.println("The value of a: " + a + "," +
                " the value of b: " + b);
    }
}
