package lesson09.hierarchyOfFigures;

public class Circle extends Figure{
    /*
    Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
периметра всех фигур в массиве.
     */
    final double PI = 3.14;
    private double radius;
    final int DEGREE = 2;

    Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateTheArea() {
        return PI * Math.pow(radius, DEGREE);
    }

    @Override
    public double calculateThePerimeter() {
        return DEGREE * radius * PI;
    }
}
