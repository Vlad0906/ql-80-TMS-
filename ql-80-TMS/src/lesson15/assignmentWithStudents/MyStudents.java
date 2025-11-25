package lesson15.assignmentWithStudents;

import java.util.LinkedList;
import java.util.List;

public class MyStudents {
    /*
    Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
Написать метод, который удаляет студентов со средним баллом <3. Если средний
балл>=3, студент переводится на следующий курс. Дополнительно написать метод
printStudents(List<Student> students, int course), который получает список студентов и
номер курса. А также печатает на консоль имена тех студентов из списка, которые
обучаются на данном курсе
     */
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();

        students.add(new Student("Vadim", "15Q", 2, new double[]{7, 6, 8, 7}));
        students.add(new Student("Pavel", "17E", 3, new double[]{9, 7, 9, 9}));
        students.add(new Student("Dima", "12W", 3, new double[]{2, 3, 1, 2}));
        students.add(new Student("Gleb", "15Q", 1, new double[]{8, 5, 7, 5}));
        students.add(new Student("Vova", "14R", 4, new double[]{8, 7, 8, 7}));
        students.add(new Student("Artur", "17E", 2, new double[]{7, 6, 9, 6}));

        Student.removalOrPromotionOfAStudent(students);
        Student.printStudents(students);
    }
}
