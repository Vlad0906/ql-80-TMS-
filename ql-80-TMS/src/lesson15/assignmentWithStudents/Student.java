package lesson15.assignmentWithStudents;

import java.util.List;

public class Student {
    /*
    Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
Написать метод, который удаляет студентов со средним баллом <3. Если средний
балл>=3, студент переводится на следующий курс. Дополнительно написать метод
printStudents(List<Student> students, int course), который получает список студентов и
номер курса. А также печатает на консоль имена тех студентов из списка, которые
обучаются на данном курсе
     */
    static final double GPA = 3.0;

    private String name;
    private String group;
    private int course;
    private double[] arrayOfRatings;

    Student(String name, String group, int course, double[] arrayOfRatings){
        this.name = name;
        this.group = group;
        this.course = course;
        this.arrayOfRatings = arrayOfRatings;
    }

    public String getName() {
        return name;
    }

    public void transferToTheNextCourse(){
        course++;
    }

    public double calculateGPA(){
        double sum = 0;
        for (double numbers : arrayOfRatings){
            sum += numbers;
        }

        return sum / arrayOfRatings.length;
    }

    public static void printStudents(List<Student> students){
        for(Student progeny : students){
            if(progeny.course == 1){
                System.out.println("Student information: " + progeny.getName() + " course " + progeny.course);
            } else if (progeny.course == 2) {
                System.out.println("Student information: " + progeny.getName() + " course " + progeny.course);
            } else if (progeny.course == 3){
                System.out.println("Student information: " + progeny.getName() + " course " + progeny.course);
            } else if (progeny.course == 4){
                System.out.println("Student information: " + progeny.getName() + " course " + progeny.course);
            } else if (progeny.course > 4){
                System.out.println("Student: " + progeny.getName() + " - i've already graduated");
            }
        }
    }

    public static void removalOrPromotionOfAStudent(List<Student> students){
        for (int i = students.size() - 1; i >= 0; i--) {
            Student disciple = students.get(i);
            if (disciple.calculateGPA() < GPA) {
                students.remove(i);
            } else {
                disciple.transferToTheNextCourse();
            }
        }
    }
}
