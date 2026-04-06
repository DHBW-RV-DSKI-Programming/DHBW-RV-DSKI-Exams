package main.java;

public class TimeCalculator {
    public static void main(String[] args) {
//        long microsPerDay = 24 * 60 * 60 * 1000 * 1000;
        long microsPerDay = 24L * 60 * 60 * 1000 * 1000;
        long thirtyDays = microsPerDay * 30;

        System.out.println("Microseconds in 30 days: " + thirtyDays);
    }
}

// Gesamtpunktzahl: 5 Punkte