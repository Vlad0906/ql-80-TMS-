package lesson15.smallTasks;

import java.util.ArrayList;

public class AnimalCatalog {
    /*
    Создать класс, который будет хранить в себе коллекцию с названиями животных.
Реализовать методы удаления и добавления животных по следующим правилам:
добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
объекта этого класса в main методе другого класса.
     */
    ArrayList<String> animals;

    public AnimalCatalog(){
        animals = new ArrayList<>();
    }

    public void add(String species){
        animals.addFirst(species);
    }

    public void delete(){
        if (!animals.isEmpty()){
            animals.removeLast();
        }else{
            System.out.println("There is nothing to delete");
        }
    }

    public void print(){
        if (!animals.isEmpty()){
            System.out.println(animals);
        }else{
            System.out.println("Directory is empty");
        }
    }
}
