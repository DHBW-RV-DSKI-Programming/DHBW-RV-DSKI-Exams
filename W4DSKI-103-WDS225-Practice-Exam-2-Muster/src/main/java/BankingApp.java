package main.java;

import java.math.BigDecimal;

//record BankTransfer(String transferDate, double transferAmount) {
record BankTransfer(String transferDate, BigDecimal transferAmount) { // 1 Punkt

}

public class BankingApp {

    public static void main(String[] args) {
//        BankTransfer transfer1 = new BankTransfer("2026-01-01", 50.3);
        BankTransfer transfer1 = new BankTransfer("2026-01-01", new BigDecimal("50.3")); // 1 Punkt
//        BankTransfer transfer2 = new BankTransfer("2026-01-02", 66.33);
        BankTransfer transfer2 = new BankTransfer("2026-01-02", new BigDecimal("66.33")); // 1 Punkt
//        BankTransfer transfer3 = new BankTransfer("2026-01-03", 11.3);
        BankTransfer transfer3 = new BankTransfer("2026-01-03", new BigDecimal("11.3")); // 1 Punkt

//        double transferSum = transfer1.transferAmount() + transfer2.transferAmount() + transfer3.transferAmount();
        BigDecimal transferSum = transfer1.transferAmount().add(transfer2.transferAmount()).add(transfer3.transferAmount()); // 2 Punkte
        System.out.println("Sum: " + transferSum);
    }

}

// Gesamtpunktzahl: 6 Punkte
