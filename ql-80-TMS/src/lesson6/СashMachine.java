package lesson6;

public class СashMachine {
    /*
    Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100. Сделать
метод для добавления денег в банкомат. Сделать функцию, снимающую деньги, которая
принимает сумму денег, а возвращает булевое значение - успешность выполнения
операции. При снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма. Создать конструктор с тремя параметрами -
количеством купюр каждого номинала
     */

    final int TWENTYBILL = 20;
    final int FIFTYBILL = 50;
    final int ONEHUNDREDBILL = 100;

    int quantityTwentyBill;
    int quantityFiftyBill;
    int quantityOneHundredBill;
    int balance;
    String currency;


    СashMachine(int quantityTwentyBill, int quantityFiftyBill, int quantityOneHundredBill){
        this.quantityTwentyBill = quantityTwentyBill;
        this.quantityFiftyBill = quantityFiftyBill;
        this.quantityOneHundredBill = quantityOneHundredBill;

    }

    int formBalance(){
        balance = quantityTwentyBill * TWENTYBILL +
                quantityFiftyBill * FIFTYBILL +
                quantityOneHundredBill * ONEHUNDREDBILL;

        System.out.println("QuantityOneHundredBill = " + quantityOneHundredBill + ", " +
                "QuantityFiftyBill = " + quantityFiftyBill + ", " +
                "QuantityTwentyBill = " + quantityTwentyBill);
        return balance;
    }

    public void setCurrency(String currency){
        this.currency = currency;
    }

    void print (){
        System.out.println("The balance of this cash machine is " + balance + "," +
                " currency at an - " + currency);
    }

    double addMoneyToAnСashMachine(int banknote){
        int quantityOneHundred = 0;
        int quantityFifty = 0;
        int quantityTwenty = 0;

        if(banknote > 0){
            balance += banknote;

            quantityOneHundred = banknote / ONEHUNDREDBILL;
            int remainder = banknote % ONEHUNDREDBILL;

            if((remainder % TWENTYBILL) == 0){
                quantityTwenty = remainder / TWENTYBILL;
            } else {
                quantityFifty = remainder / FIFTYBILL;
                int residue = remainder % FIFTYBILL;
                quantityTwenty = residue / TWENTYBILL;
            }

            quantityOneHundredBill += quantityOneHundred;
            quantityFiftyBill += quantityFifty;
            quantityTwentyBill += quantityTwenty;
        } else {
            System.out.println("You cannot deposit funds below zero.");
        }
        return balance;
    }

    boolean withdrawMoneyFromAnСashMachine(int banknote){
        int quantityOneHundred = 0;
        int quantityFifty = 0;
        int quantityTwenty = 0;

        int counterTwenty = 0;
        int counterFifty = quantityFiftyBill;
        int counterOneHundred = quantityOneHundredBill;

        if(balance >= banknote){
            balance -= banknote;

            quantityFifty = banknote / FIFTYBILL;
            int remainderOfFifty = banknote % FIFTYBILL;

            if(remainderOfFifty == 10 || remainderOfFifty == 30){
                quantityFifty -= 1;
                remainderOfFifty += FIFTYBILL;
                counterTwenty = remainderOfFifty / TWENTYBILL;
            } else {
                counterTwenty = remainderOfFifty / TWENTYBILL;
            }

            if (quantityFiftyBill >= quantityFifty){
                counterFifty -= quantityFifty;
            } else{
                if((quantityFifty % 2) == 0 && (quantityFiftyBill % 2) == 0){
                    quantityFifty -= counterFifty;
                } else if((quantityFifty % 2) != 0 && (quantityFiftyBill % 2) != 0){
                    quantityFifty -= counterFifty;
                } else {
                    counterFifty -= 1;
                    quantityFifty -= counterFifty;
                }
            }

            int sum = quantityFifty * FIFTYBILL;
            quantityOneHundred = sum / ONEHUNDREDBILL;

            if (quantityOneHundredBill >= quantityOneHundred){
                counterOneHundred -= quantityOneHundred;
            } else {
                quantityOneHundred -= counterOneHundred;
            }

            sum = quantityOneHundred * ONEHUNDREDBILL;
            quantityTwenty = sum / TWENTYBILL;
            counterTwenty += quantityTwenty;

            quantityOneHundredBill -= counterOneHundred;
            quantityFiftyBill -= counterFifty;
            quantityTwentyBill -= counterTwenty;

            System.out.println("The operation was successful. You removed it " + banknote + " rubles. " +
                    counterOneHundred + " one hundred ruble bills, " + counterFifty +
                    " fifty ruble bills, " + counterTwenty + " twenty ruble bills.");
            return true;
        } else {
            System.out.println("There is no such amount in the ATM!");
            return false;
        }
    }
}
