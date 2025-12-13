package lesson20.settingMinimumAndMaximum;

import java.util.Scanner;

public class Main {
    /*
    Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
вычислений возвращаются в метод main()
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter 5 digits: ");
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = scan.nextInt();
        }

        final int[] min = {array[0]};
        final int[] max = {array[0]};

        Object lock = new Object();

        MyThread threadMin = new MyThread(() ->{
            for(int minValue : array){
                synchronized(lock){
                    if(min[0] > minValue){
                        min[0] = minValue;
                    }
                }
            }
        });

        MyThread threadMax = new MyThread(() ->{
            for(int maxValue : array){
                synchronized (lock){
                    if(max[0] < maxValue){
                        max[0] = maxValue;
                    }
                }
            }
        });

        threadMin.start();
        threadMax.start();

        try{
            threadMin.join();
            threadMax.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Мinimum value - " + min[0]);
        System.out.println("Маximum value - " + max[0]);
    }
}
