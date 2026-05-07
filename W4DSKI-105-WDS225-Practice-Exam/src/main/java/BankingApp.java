package main.java;

import java.util.logging.Logger;

class BankAccount {

    private final String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        // TODO: Hier Aufgabe 2 implementieren
        balance -= amount;
    }

    public double getBalance() { return balance; }
    public String getOwner()   { return owner; }

}


public class BankingApp {

    private final static Logger LOGGER = Logger.getLogger(BankingApp.class.getName());

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Jake Peralta", 300.0);
        double withdrawalAmount = 1000.0;

        // TODO: Hier Aufgabe 2 implementieren
        account.withdraw(withdrawalAmount);
    }

}