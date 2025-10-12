package lesson3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        determineParity(scan);
        determineTheTemperature(scan);
        squareNumbers();
        printTheSequence();
        sumOfNumbers(scan);
    }

    public static void determineParity(Scanner scan){
        //Напишите программу, которая будет принимать на вход число из консоли и на выход
        //будет выводить сообщение четное число или нет. Для определения четности числа
        //используйте операцию получения остатка от деления (операция выглядит так: '% 2')

        System.out.print("Enter a number to determine its parity: ");
        int number = scan.nextInt();

        if ((number % 2) == 0){
            System.out.println("The number entered is even!");
        } else {
            System.out.println("The number entered is not even!");
        }
    }

    public static void determineTheTemperature(Scanner scan){
        //Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
        //Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».

        int t = scan.nextInt();

        if (t > -5){
            System.out.println("Warm");
        } else if (-5 >= t && t > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }

    public static void squareNumbers(){
        //Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно

        for (int i = 10; i <= 20; i++) {
            int number = (int) Math.pow(i, 2);
            System.out.println("Square of the number " + i + " equals: " + number);
        }
    }

    public static void printTheSequence(){
        //Необходимо, чтоб программа выводила на экран вот такую последовательность:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.

        int counter = 1;
        int number = 7;
        int result = 0;

        while (result != 98){
            result = number * counter;
            System.out.print(result + " ");

            counter++;
        }
    }

    public static void sumOfNumbers(Scanner scan){
        //Напишите программу, где пользователь вводит любое целое положительное число. А
        //программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
        //числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
        //ввести некорректные данные

        System.out.print("Please enter a positive integer: ");
        double number = scan.nextDouble();

        int sum = 0;

        while (number < 0 || (!(number % 1 == 0))){
            System.out.print("You entered an incorrect number. Enter again: ");
            number = scan.nextDouble();
        }

        for (int i = 0; i < number; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from one to " + number + " is equal to: " + sum);
    }
}
