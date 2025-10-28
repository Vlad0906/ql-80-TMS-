package lesson9.job;

public class MyJob {
    /*
    Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
который печатает название должности и имплементировать этот метод в созданные
классы
     */
    public static void main(String[] args) {
        getArrayOfPositions();
    }

    public static void getArrayOfPositions(){
        JobTitle[] array = {
                new Director("director"),
                new Worker("worker"),
                new Accountant("accountant")
        };

        for(JobTitle post : array){
            post.printJobTitle();
        }
    }
}
