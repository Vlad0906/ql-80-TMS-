package lesson9.hierarchyOfFigures;

public class Rectangle extends Figure{
    /*
    Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
периметра всех фигур в массиве.
     */
    private double length;
    private double height;

    Rectangle(double length, double height){
        this.length = length;
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateTheArea() {
        return length * height;
    }

    @Override
    public double calculateThePerimeter() {
        return length + height + length + height;
    }
}
