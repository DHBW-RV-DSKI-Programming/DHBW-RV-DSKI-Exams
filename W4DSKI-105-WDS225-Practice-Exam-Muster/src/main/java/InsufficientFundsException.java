package main.java;

public class InsufficientFundsException extends Exception { // 2 Punkte

    public InsufficientFundsException(double amount, double balance) {
        super("Cannot withdraw " + amount + " — current balance is " + balance);
    } // 2 Punkte

}

// Gesamtpunktzahl: 4 Punkte