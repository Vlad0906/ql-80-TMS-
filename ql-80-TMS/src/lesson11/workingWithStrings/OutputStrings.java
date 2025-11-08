package lesson11.workingWithStrings;

import java.util.Arrays;
import java.util.Scanner;

public class OutputStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = getArrayString(scan);
        findTheLengthOfTheString(array);
        arrangeTheLines(array);
        outputLengthLessThanAverage(array);
        findAWordFromDifferentSymbols(array);
        duplicateEachLetterInAString(scan);
    }

    public static String[] getArrayString(Scanner scan){
        System.out.print("Please enter the first line: ");
        String firstLine = scan.nextLine();
        System.out.print("Please enter second line: ");
        String secondLine = scan.nextLine();
        System.out.print("Please enter the third line: ");
        String thirdLine = scan.nextLine();

        return new String[]{firstLine, secondLine, thirdLine};
    }


    public static void findTheLengthOfTheString(String[] array){
        /*
        Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
найденные строки и их длину.
         */

        int minSize = Integer.MAX_VALUE;
        int maxSize = Integer.MIN_VALUE;
        String minLine = "";
        String maxLine = "";

        for (int i = 0; i < array.length; i++) {
           if (maxSize < array[i].length()){
               maxSize = array[i].length();
               maxLine = array[i];
           }

            if (minSize > array[i].length()) {
                minSize = array[i].length();
                minLine = array[i];
            }
        }
        System.out.println("The shortest line - '" + minLine + "', its length is: " + minSize);
        System.out.println("The longest line - '" + maxLine + "', its length is: " + maxSize);
    }

    public static void arrangeTheLines(String[] array){
        /*
        Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
значений их длины
         */

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].length() > array[j].length()){
                    String tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        System.out.println("Output ordered strings in order of increasing length" +
                Arrays.toString(array));
    }

    public static void outputLengthLessThanAverage(String[] array){
        /*
        Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
средней, а также их длину
         */

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].length();
        }
        int averageLength = sum / array.length;

        for (int i = 0; i < array.length; i++) {
            if(array[i].length() < averageLength){
                System.out.println("'" + array[i].toString() + "' " +
                        "- this line is shorter than average!" +
                        " Its length is: " + array[i].length());
            }
        }
    }

    public static void findAWordFromDifferentSymbols(String[] array){
        /*
        Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
Если таких слов несколько, найти первое из них.
         */

        String word = null;
        boolean isFound = false;

        for (String words : array) {
            String[] stringArray = words.split("\\s+");
            for(String text : stringArray){
                boolean isCorrect = true;
                for (int i = 0; i < text.length(); i++) {
                    char newChar = text.charAt(i);
                    if(text.indexOf(newChar) != text.lastIndexOf(newChar)){
                        isCorrect = false;
                        break;
                    }
                }
                if (isCorrect){
                    word = text;
                    isFound = true;
                    break;
                }
            }
            if(isFound) break;
        }
        if (word != null) {
            System.out.println(word);
        } else {
            System.out.println("A word consisting only of unique values was not found");
        }
    }

    public static void duplicateEachLetterInAString(Scanner scan){
        /*
        Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo"
         */

        System.out.print("Please enter a string: ");
        String line = scan.nextLine();
        char[] charArray = line.toCharArray();

        StringBuilder newStringBuilder = new StringBuilder();

        for(char newChar : charArray){
            newStringBuilder.append(newChar);
            newStringBuilder.append(newChar);
        }

        System.out.println(newStringBuilder);
    }
}
