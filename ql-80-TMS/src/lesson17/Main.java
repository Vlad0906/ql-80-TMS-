package lesson17;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("You will be a hundred years old in - " +
                          findOutWhenYouBeAHundredYearsOld(scan));
        printPositiveNumbers();
        transferAmountUsingFunction(scan);
        transferAmountUsingConsumer(scan);
        expandLine(scan);
    }

    public static LocalDate findOutWhenYouBeAHundredYearsOld(Scanner scan){
        /*
        Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
когда пользователю исполнится 100 лет. Использовать Date/Time API.
         */
        System.out.print("Please enter your age(year-month-day): ");
        LocalDate dateOfBirth = LocalDate.parse(scan.nextLine());

        return dateOfBirth.plusYears(100);
    }

    public static void printPositiveNumbers(){
        /*
        Используя Predicate среди массива чисел вывести только те, которые являются
положительными.
         */
        int[] array = {4, 78, 6, 0, -12, 9, -43, -30, 51, 62, -16};

        Predicate<Integer> isPositive= number -> number > 0;
        for(int number : array){
            if (isPositive.test(number)){
                System.out.print("'" + number + "',");
            }
        }
    }

    public static void transferAmountUsingFunction(Scanner scan){
        /*
        Используя Function реализовать лямбду, которая будет принимать в себя строку в
формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
возвращать сумму, переведенную сразу в доллары.
         */
        double exchangeRate = 0.3446;
        System.out.print("Enter the amount in Belarusian rubles (in the format \"amount BYN\"): ");
        String amountInBYN = scan.nextLine();
        String newAmountInBYN = amountInBYN.replaceAll("[^0-9.]", "");
        double amount = Double.parseDouble(newAmountInBYN);

        Function<Double, Double> function = num -> num * exchangeRate;

        double sum = function.apply(amount);
        System.out.println("Amount in dollars - " + sum);
    }

    public static void transferAmountUsingConsumer(Scanner scan){
        /*
        Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
выводить сумму, переведенную сразу в доллары
         */
        double exchangeRate = 0.3446;
        System.out.print("Enter the amount in Belarusian rubles (in the format \"amount BYN\"): ");
        String amountInBYN = scan.nextLine();
        String newAmountInBYN = amountInBYN.replaceAll("[^0-9.]", "");
        double amount = Double.parseDouble(newAmountInBYN);

        Consumer<Double> consumer = sum -> System.out.println("Amount in dollars - " + sum);

        double amountInDollars = exchangeRate * amount;
        consumer.accept(amountInDollars);
    }

    public static String expandLine(Scanner scan){
        /*
        Используя Supplier написать метод, который будет возвращать введенную с консоли
строку задом наперед
         */
        System.out.print("Enter string: ");
        StringBuilder line = new StringBuilder(scan.nextLine());

        Supplier<String> supplier = () -> String.valueOf(line.reverse());
        String reverseLine = supplier.get();
        System.out.println(reverseLine);
        return reverseLine;
    }
}
