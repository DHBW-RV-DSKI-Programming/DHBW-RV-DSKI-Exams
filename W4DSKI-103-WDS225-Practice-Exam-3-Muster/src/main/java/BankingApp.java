package main.java;

class Account {

    public static final String BANK_NAME = "Gringotts"; // 2 Punkte
    private final String accountNumber; // 1 Punkte
    private double balance; // 1 Punkte

    public Account(String accountNumber, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    } // 1 Punkte

    public final void printInfo() { // 1 Punkte
        System.out.println("Account: " + accountNumber + " | Balance: $" + balance); // 1 Punkte
    }

    public void deposit(double amount) { // 1 Punkte
        balance += amount; // 1 Punkte
    }
}

public class BankingApp {

    public static void main(String[] args) {
        Account account = new Account("GTB-998877", 5000.0); // 1 Punkte
        account.deposit(50); // 1 Punkte

        System.out.println("Welcome to " + Account.BANK_NAME); // 1 Punkte
        account.printInfo(); // 1 Punkte
    }

}

// Gesamtpunktzahl: 13 Punkte