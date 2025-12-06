package lesson16.checkForUniqueness;

import java.util.HashMap;
import java.util.Map;

public class Uniquene {
    /*
    На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
строка является ключом, и ее значение равно true, если эта строка встречается в массиве
2 или более раз. Пример:
wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
     */

    public static final int REPETITION = 2;

    public static void main(String[] args) {
        System.out.println(getMap());
    }

    public static Map<String, Boolean> getMap(){
        String[] array = {"Wolf", "Rabbit", "Cat", "Wolf", "Dog", "Cat"};

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String word : array){
            hashMap.put(word, hashMap.getOrDefault(word, 0) +1);
        }

        HashMap<String, Boolean> newHashMap = new HashMap<>();
        for (String key : hashMap.keySet()){
            newHashMap.put(key, hashMap.get(key) >= REPETITION);
        }
        return newHashMap;
    }
}
