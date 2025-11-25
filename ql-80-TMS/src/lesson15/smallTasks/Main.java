package lesson15.smallTasks;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        getRidOfARepeatingElement(scan);

    }

    public static void getRidOfARepeatingElement(Scanner scan){
        /*
        Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
При решении использовать коллекции
         */
        System.out.print("Please enter the numbers as one line: ");
        String numbers = scan.nextLine();
        String[] array = numbers.split("[\\s,]+");

        HashSet<String> set = new HashSet<>(Arrays.asList(array));
        System.out.println("Array after getting rid of duplicate elements - " + set);
    }
}
