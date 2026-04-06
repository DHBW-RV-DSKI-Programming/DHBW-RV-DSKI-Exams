package main.java;

public class TimeCalculator {
    public static void main(String[] args) {
        // TODO: Aufgabe 7 lösen

        long microsPerDay = 24 * 60 * 60 * 1000 * 1000;
        long thirtyDays = microsPerDay * 30;

        System.out.println("Microseconds in 30 days: " + thirtyDays);
    }
}