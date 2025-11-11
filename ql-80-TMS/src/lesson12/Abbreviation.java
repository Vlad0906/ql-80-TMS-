package lesson12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Abbreviation {
    /*
    Вывести в консоль из строки которую пользователь вводит с клавиатуры все
аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
только из прописных букв, без чисел
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = getText(scan);
        findAnAbbreviation(text);
    }

    public static String getText(Scanner scan){
        System.out.print("Please enter one line containing abbreviations: ");
        return scan.nextLine();
    }

    public static void findAnAbbreviation(String text){
        Pattern pattern = Pattern.compile("\\b[A-Z]{2,6}\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
