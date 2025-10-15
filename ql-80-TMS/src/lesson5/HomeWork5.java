package lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        sumOfValues();
        createChessboard();
        createSnake();
    }

    public static void sumOfValues(){
        /*
        Создать двумерный массив, заполнить его случайными числами.
        1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
        1.3 Найти сумму всех получившихся элементов и вывести в консоль.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to add to the array values: ");
        int number = scan.nextInt();
        int sum = 0;

        int[][] array = new int[4][4];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(101);
            }
        }
        System.out.print("Filled two-dimensional array - " + Arrays.deepToString(array) + "\n");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] += number;
            }
        } System.out.println("We output an array with one added to each value - " +
                Arrays.deepToString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("The sum of all values is equal to - " + sum);
    }

    public static void createChessboard(){
        /*
        Создать программу для раскраски шахматной доски с помощью цикла. Создать
двумерный массив String 8х8. С помощью циклов задать элементам массива значения
B(Black) или W(White). При выводе результат работы программы должен быть следующим:
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
         */

        String[][] array = new String[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 !=0 ) {
                    array[i][j] = "B";
                } else {
                    array[i][j] = "W";
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void createSnake(){
        /*
        Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
Формат входных данных:
Программа получает на вход два числа n и m.
Формат выходных данных:
Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
символа
         */

        int n = 4;
        int m = 6;

        int[][] a = new int[n][m];

        int counter = 0;

        for (int i = 0; i < a.length; i++) {
            if ((i % 2) != 0) {
                for (int j = a[i].length - 1; j >= 0 ; j--) {
                    a[i][j] = counter++;
                }
            } else {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = counter++;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] <= 9){
                    System.out.print(" ");
                }System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
