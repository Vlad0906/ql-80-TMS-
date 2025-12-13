package lesson20.shop;

public class Shop {
    /*
    Имеются сущности Магазин, Производитель, Покупатель. Цель задачи сделать так чтобы
производитель произвел 5 единиц продукта, а покупатель их купил. Пока производитель
не произвел продукт, покупатель не может его купить. При этом одновременно в магазине
может находиться не более 3 товаров
     */
    private int productCount = 0;
    private final int maximumQuantity = 3;
    private int basket = 0;

    //Блоком while проверяем количество произведенных продуктов. Если их количество равно 0 - ждем.
    //В противном случае отнимаем произведенные продукты по одному
    public synchronized void buy() throws InterruptedException {
        while (productCount == 0) {
            wait();
        }
        productCount--;
        basket++;
        System.out.println("Purchased, in cart: " + basket);
        notifyAll();
    }

    //Блоком while проверяем сколько продуктов произведено и сравниваем с вместимостью магазина.
    //Если количество продуктов больше или равно - ждем. В противном случае добавляем к счетчику продуктов по одному.
    public synchronized void produce() throws InterruptedException {
        while (productCount >= maximumQuantity) {
            wait();
        }
        productCount++;
        System.out.println("Produced: " + productCount);
        notifyAll();
    }
}