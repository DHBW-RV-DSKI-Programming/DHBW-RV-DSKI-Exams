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

    public void withdraw(double amount) throws InsufficientFundsException { // 1 Punkt
        if (amount > balance) { // 1 Punkt
            throw new InsufficientFundsException(amount, balance); // 1 Punkt
        }
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

        try { // 1 Punkt
            account.withdraw(withdrawalAmount);
        } catch (InsufficientFundsException e) { // 1 Punkt
            LOGGER.warning("Withdrawal failed: " + e.getMessage()); // 1 Punkt
            LOGGER.info("Needed money: " + (withdrawalAmount - account.getBalance())); // 2 Punkte
        }
    }

}

// Gesamtpunktzahl: 8 Punkte