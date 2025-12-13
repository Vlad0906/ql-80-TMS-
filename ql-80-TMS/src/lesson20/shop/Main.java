package lesson20.shop;

public class Main {
    /*
    Имеются сущности Магазин, Производитель, Покупатель. Цель задачи сделать так чтобы
производитель произвел 5 единиц продукта, а покупатель их купил. Пока производитель
не произвел продукт, покупатель не может его купить. При этом одновременно в магазине
может находиться не более 3 товаров
     */

    public static void main(String[] args) {
        Shop shop = new Shop();

        // Поток producer производит 5 товаров и используется метод sleep для имитации работы
        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    shop.produce();
                    Thread.sleep(1000);
                }
                System.out.println();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Поток buyer покупает 5 товаров из магазина. Метод sleep используется для имитации работы
        Thread buyer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    shop.buy();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        buyer.start();

        try {
            producer.join();
            buyer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}