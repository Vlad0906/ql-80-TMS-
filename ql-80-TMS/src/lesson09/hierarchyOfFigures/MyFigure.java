package lesson09.hierarchyOfFigures;

public class MyFigure {
    /*
    Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
периметра всех фигур в массиве.
     */
    public static void main(String[] args) {
                getTheSumOfThePerimeter();
    }

    public static void getTheSumOfThePerimeter(){
        Figure[] array = {
                new Triangle(6, 4, 7, 7),
                new Rectangle(5, 7),
                new Circle(5),
                new Rectangle(6,8),
                new Circle(7)
        };

        double sum = 0;
        for(Figure figure : array){
            sum += figure.calculateThePerimeter();
        }
        System.out.println("We output the sum of the perimeter of all figures: " + sum);
    }
}
