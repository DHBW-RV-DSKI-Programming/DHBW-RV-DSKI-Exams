package main.java;

// TODO: Hier Aufgabe 7 lösen

record BankTransfer(String transferDate, double transferAmount) {
}

public class BankingApp {

    public static void main(String[] args) {
        BankTransfer transfer1 = new BankTransfer("2026-01-01", 50.3);
        BankTransfer transfer2 = new BankTransfer("2026-01-02", 66.33);
        BankTransfer transfer3 = new BankTransfer("2026-01-03", 11.3);

        double transferSum = transfer1.transferAmount() + transfer2.transferAmount() + transfer3.transferAmount();
        System.out.println("Sum: " + transferSum);
    }

}
