package lesson09.hierarchyOfFigures;

public class Triangle extends Figure{
    /*
    Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
периметра всех фигур в массиве.
     */
    private double baseLength;
    private double height;
    private double firstSide;
    private double secondSide;
    final double HALF = 0.5;

    Triangle(double baseLength, double height, double firstSide, double secondSide){
        this.baseLength = baseLength;
        this.height = height;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double calculateTheArea() {
        return HALF * baseLength * height;
    }

    @Override
    public double calculateThePerimeter() {
        return firstSide + secondSide + baseLength;
    }
}
