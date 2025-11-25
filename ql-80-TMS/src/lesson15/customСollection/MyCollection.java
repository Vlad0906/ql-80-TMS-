package lesson15.customСollection;

import java.util.Arrays;

public class MyCollection<T> {
    /*
    Представим, что в Java нет коллекции типа ArrayList. Создать свой класс, симулирующий
работу класса динамической коллекции - т.е. создать свою кастомную коллекцию. В
основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных
классов(т.е. это generic).
Предусмотреть операции(методы):
1. добавления элемента
2. удаления элемента
3. получение элемента по индексу
4. проверка есть ли элемент в коллекции
5. очистка всей коллекции
Предусмотреть конструктор без параметров - создает массив размером
по умолчанию. Предусмотреть конструктор с задаваемым размером внутреннего
массива. Предусмотреть возможность автоматического расширения коллекции при
добавлении элемента в том случае, когда коллекция уже заполнена.
     */
    private int size;
    private Object[] array;
    private static int counter = 0;

    MyCollection(){
        this.array = new Object[10];
    }

    MyCollection(int size){
        this.array = new Object[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getElements() {
        return array;
    }

    public void setElements(Object[] elements) {
        this.array = elements;
    }

    public <T> boolean addMyCollection(T element){
        if(counter == array.length){
            Object[] newArray = new Object[array.length / 2 + array.length];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[counter] = element;
        counter++;
        return true;
    }

    public <T> boolean removeByElement(T element){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)){
                while (i != array.length - 1){
                    array[i] = array[i + 1];
                    i++;
                }
                if(i == (array.length - 1)){
                    array[i] = null;
                }
            }
        }
        counter--;
        return true;
    }

    public <T> boolean removeByIndex(int index){
        for (int i = index; i <= array.length - 1; i++) {
           if(i + 1 > array.length - 1){
               array[i] = null;
           } else{
               array[i] = array[i + 1];
           }
        }
        counter--;
        return true;
    }


    public <T> Object getAnElementByIndex(int index){
        if(index >= array.length || index < 0){
            return null;
        } else{
            return array[index];
        }
    }

    public <T> boolean checkElementPresence(T element){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    public <T> boolean clearMyCollection(){
        Arrays.fill(array, null);
        counter = 0;
        return true;
    }

    public <T> void printCollection(){
        System.out.println(Arrays.toString(array));
    }
}
