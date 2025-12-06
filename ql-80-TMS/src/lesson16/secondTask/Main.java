package lesson16.secondTask;

import java.util.HashMap;
import java.util.Map;

public class Main {
    /*
    На вход поступает массив непустых строк, создайте и верните Map<String,
String> следующим образом: для каждой строки добавьте ее первый символ в
качестве ключа с последним символом в качестве значения. Пример:
pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
     */
    public static void main(String[] args) {
        System.out.println(getMap());
    }

    public static Map<String, String> getMap(){
        String[] array = {"wolf", "rabbit", "cat", "tiger", "dog", "lion"};

        Map<String, String> map = new HashMap<>();

        for(String word : array){
            String key = word.substring(0, 1);
            String value = word.substring(word.length() - 1, word.length());
            map.put(key, value);
        }
        return map;
    }
}
