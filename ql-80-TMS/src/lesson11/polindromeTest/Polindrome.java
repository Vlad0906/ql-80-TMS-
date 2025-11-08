package lesson11.polindromeTest;

import java.util.Scanner;

public class Polindrome {
    /*
    Дана строка произвольной длины с произвольными словами. Написать программу для
проверки является ли любое выбранное слово в строке палиндромом.
Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е
слово в этой строке палиндромом.
Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например,
в строке 5 слов, а на вход программе передали число 500
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = getText();
        String[] array = breakItDownIntoWords(text);
        int number = getNumber(scan, array);
        checkForAPolindrome(number, array);
    }

    public static String getText(){
        return "Маленький принц никогда еще не видал таких огромных бутонов " +
                "и предчувствовал, что увидит чудо.";
    }

    public static String[] breakItDownIntoWords(String text) {
        return text.split("[\\s,.]+");
    }

    public static int getNumber(Scanner scan, String[] array){
        System.out.print("Please enter the ordinal number of " +
                "the word you want to check for a polindrome: ");

        int number = scan.nextInt();
        while (number < 0 || number > array.length - 1){
            System.out.print("There is no word with this number. " +
                    "Please enter a different number: ");
            number = scan.nextInt();
        }
        return number;
    }

    public static void checkForAPolindrome(int number, String[] array){
        String word = array[number];
        String newWord = new StringBuilder(word).reverse().toString();

        if (word.equalsIgnoreCase(newWord)){
            System.out.println("'" + word + "' - this word is a polindrome!");
        } else {
            System.out.println("'" + word + "' - this word is not a polindrome. " +
                    "Choose another one.");
        }
    }
}
