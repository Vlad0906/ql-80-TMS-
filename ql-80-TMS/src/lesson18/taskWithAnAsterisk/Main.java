package lesson18.taskWithAnAsterisk;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    /*
    Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
Среди отобранных значений отобрать только те, которые имеют нечетное количество
букв в имени. После чего вернуть список List имен, записанных буквами задом наперед
     */
    public static void main(String[] args) {
        Map<Integer, String> mapp = new HashMap<>();
        mapp.put(1, "Pavel");
        mapp.put(2, "Liza");
        mapp.put(3, "Dima");
        mapp.put(4, "Vova");
        mapp.put(5, "David");
        mapp.put(6, "Inga");
        mapp.put(7, "Anton");
        mapp.put(8, "Natalia");
        mapp.put(9, "Maxim");
        mapp.put(10, "Artur");
        mapp.put(11, "Olga");
        mapp.put(12, "Elena");
        mapp.put(13, "Igor");
        mapp.put(14, "Vadim");

        //newMap - создаю новую карту из первоначального Map
        //1) filter - прохожу фильтрами по числовому диапазону 1/2/5/8/9/13
        //2) filter - нахожу значения, которые имеют нечетное количествобукв в имени
        //collect(Collectors.toMap - собираю результат в новую карту
        //ключом является оригинальное имя
        //значением является перевернутое имя
        Map<String, String> newMap = mapp.entrySet().stream().
        filter(entry -> entry.getKey() == 1 || entry.getKey() == 2 ||
        entry.getKey() == 5 || entry.getKey() == 8 || entry.getKey() == 9 || entry.getKey() == 13).
        filter(entry -> (entry.getValue().length() % 2) != 0).
        collect(Collectors.toMap(
        entry -> entry.getValue(),
        entry -> new StringBuilder(entry.getValue()).reverse().toString()));

        List<String> names = new ArrayList<>(newMap.values());
        System.out.println(names);
    }
}
