package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int sizeArray = scan.nextInt();

        displayElements(scan, sizeArray);
        findMinMax(scan, sizeArray);
        findTheIndex(scan, sizeArray);
        numberOfZeroValues(scan, sizeArray);
        swapElements(scan, sizeArray);
        checkSequence(scan, sizeArray);
        addOneToTheArray(scan, sizeArray);

    }
    public static void displayElements(Scanner scan, int sizeArray){
        //Пройти по массиву, вывести все элементы в прямом и в обратном порядке

        int[] array = new int[sizeArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((30 - 10) + 1));
        }

        System.out.print("We output the array in direct order: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nWe print the array in reverse order: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void findMinMax(Scanner scan, int sizeArray){
        //Найти минимальный-максимальный элементы и вывести в консоль

        int[] array = new int[sizeArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((100 - 1) + 1));
        }
        System.out.println(Arrays.toString(array));

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            } else if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println("The minimum value is " + min + " the maximum value is " + max);
    }

    public static void findTheIndex(Scanner scan, int sizeArray){
        //Найти индексы минимального и максимального элементов и вывести в консоль

        int[] array = new int[sizeArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((100 - 1) + 1));
        }
        System.out.println(Arrays.toString(array));

        int min = array[0];
        int max = array[0];

        int minIndex = -1;
        int maxIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
                minIndex = i;
            } else if (max < array[i]){
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Minimum value index - " + minIndex + ", maximum value index - " + maxIndex);
    }

    public static void numberOfZeroValues(Scanner scan, int sizeArray){
        //Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
        //сообщение, что их нет

        int[] array = new int[sizeArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((10 - 1) + 1));
        }
        System.out.println(Arrays.toString(array));

        int counter = 0;
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]){
                counter++;
            }
        }

        if (counter > 0){
            System.out.println("The number of zero values is equal to: " + counter);
        } else {
            System.out.println("There are no null elements in the array!");
        }
    }

    public static void swapElements(Scanner scan, int sizeArray){
        //Пройти по массиву и поменять местами элементы первый и последний, второй и
        //предпоследний и т.д

        int[] array = new int[sizeArray];

        System.out.print("Fill the array with values: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        } System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        System.out.println("We output the updated array:\n" + Arrays.toString(array));
    }

    public static void checkSequence(Scanner scan, int sizeArray){
        //Проверить, является ли массив возрастающей последовательностью (каждое следующее
        //число больше предыдущего).

        int[] array = new int[sizeArray];

        System.out.print("Fill the array with values: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        } System.out.println(Arrays.toString(array));

        int number = Integer.MIN_VALUE;
        //boolean isOk = false;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (number < array[i]) {
                counter++;
            }
            number = array[i];
        }

        if (counter == array.length){
            System.out.println("Array with increasing sequence");
        } else{
            System.out.println("Array without ascending order");
        }
    }

    public static void addOneToTheArray(Scanner scan, int sizeArray){
        //Имеется массив из неотрицательных чисел(любой). Представьте что массив
        //представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
        //добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
        //содержит нуля в начале, кроме самого числа 0.
        //Пример:
        //Input: [1,4,0,5,6,3]
        //Output: [1,4,0,5,6,4]
        //Input: [9,9,9]
        //Output: [1,0,0,0]
        int number = 1;
        boolean examination = true;
        int[] array = new int[sizeArray];

        System.out.println("Fill the array with values from zero to nine, the first value must not be equal to zero: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
            while (array[i] >= 10 || array[i] < 0 || array[0] == 0){
                System.out.print("You entered an incorrect number. Enter again: ");
                array[i] = scan.nextInt();
            }
        }
        System.out.println("We output the initial array - " + Arrays.toString(array));

        int[] newArray = new int[array.length + 1];

        array[array.length - 1] += number;
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] > 9){
                array[i] = 0;
                array[i - 1] += number;
            }

            if (array[0] > 9){
                for (int j = array.length - 1; j > 0; j--) {
                    newArray[j] = array[j];
                }
                newArray[0] = 1;
                newArray[1] = 0;
                examination = false;
            }
        }
        if (examination){
            System.out.print("We output the corrected array - " + Arrays.toString(array));
        } else {
            System.out.print("We output the corrected array - " + Arrays.toString(newArray));
        }
    }
}
