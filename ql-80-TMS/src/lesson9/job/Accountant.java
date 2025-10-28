package lesson9.job;

public class Accountant implements JobTitle{
    /*
    Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
который печатает название должности и имплементировать этот метод в созданные
классы
     */
    private String post;

    Accountant(String post){
        this.post = post;
    }

    public void setPost(String post){
        this.post = post;
    }

    @Override
    public void printJobTitle() {
        System.out.println("I have a position - " + post);
    }
}
