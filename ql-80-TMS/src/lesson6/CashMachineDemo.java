package lesson6;

public class CashMachineDemo {
    public static void main(String[] args) {
        СashMachine cashMachine = new СashMachine(43, 20, 18);

        cashMachine.setCurrency("belarusian ruble");
        cashMachine.formBalance();
        cashMachine.print();

        System.out.println("-".repeat(50));

        cashMachine.withdrawMoneyFromAnСashMachine(3410);
        cashMachine.formBalance();
        cashMachine.print();

        System.out.println("-".repeat(50));

        cashMachine.addMoneyToAnСashMachine(1170);
        cashMachine.formBalance();
        cashMachine.print();

        System.out.println("-".repeat(50));

        cashMachine.withdrawMoneyFromAnСashMachine(1300);
        cashMachine.formBalance();
        cashMachine.print();

    }
}
