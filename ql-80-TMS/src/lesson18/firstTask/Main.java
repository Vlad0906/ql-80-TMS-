package lesson18.firstTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    /*
    Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
Stream'ов:
- Удалить дубликаты
- Оставить только четные элементы
- Вывести сумму оставшихся элементов в стриме
     */
    public static void main(String[] args) {
        getArrayList();
    }

    public static void getArrayList(){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList
                (1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4));

        int sum = arrayList.stream().distinct().filter(n -> ((n % 2) == 0)).reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}
