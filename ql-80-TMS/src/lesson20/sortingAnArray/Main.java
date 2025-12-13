package lesson20.sortingAnArray;

import java.util.Arrays;

public class Main {
    /*
    Сортировка массива цифр в нескольких потоках различными алгоритмами:
 сортировка вставками;
 сортировка выбором;
 сортировка пузырьком.
Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
результат отсортированных массивов в консоль
     */
    public static void main(String[] args) {
        int[] array = {9, 4, 17, 23, 6, -5, 0, 81, -45};

        int[] arrayForInsertionSort = array.clone();
        int[] arrayForSelectionSort = array.clone();
        int[] arrayForBubbleSort = array.clone();

        MyThread insertionSort = new MyThread(() ->{
            int j;
            for (int i = 1; i < arrayForInsertionSort.length; i++) {
                int tmp = arrayForInsertionSort[i];
                for (j = i; j > 0 && tmp < arrayForInsertionSort[j - 1]; j--) {
                    arrayForInsertionSort[j] = arrayForInsertionSort[j - 1];
                }
                arrayForInsertionSort[j] = tmp;
            }
        });

        MyThread selectionSort = new MyThread(() ->{
            for (int i = 0; i < arrayForSelectionSort.length; i++) {
                int pos = i;
                int min = arrayForSelectionSort[i];
                for (int j = i + 1; j < arrayForSelectionSort.length; j++) {
                    if (arrayForSelectionSort[j] < min) {
                        pos = j;
                        min = arrayForSelectionSort[j];
                    }
                }
                arrayForSelectionSort[pos] = arrayForSelectionSort[i];
                arrayForSelectionSort[i] = min;
            }
        });

        MyThread bubbleSort = new MyThread(() ->{
            for (int i = 0; i < arrayForBubbleSort.length - 1; i++) {
                for (int j = 0; j < arrayForBubbleSort.length - i - 1; j++) {
                    if(arrayForBubbleSort[j] > arrayForBubbleSort[j + 1]){
                        int tmp = arrayForBubbleSort[j];
                        arrayForBubbleSort[j] = arrayForBubbleSort[j + 1];
                        arrayForBubbleSort[j + 1] = tmp;
                    }
                }
            }
        });

        insertionSort.start();
        selectionSort.start();
        bubbleSort.start();

        try{
            insertionSort.join();
            selectionSort.join();
            bubbleSort.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Sorted array by insertions - " + Arrays.toString(arrayForInsertionSort));
        System.out.println("Sorted array by selection - " + Arrays.toString(arrayForSelectionSort));
        System.out.println("Bubble sorted array - " + Arrays.toString(arrayForBubbleSort));
    }
}