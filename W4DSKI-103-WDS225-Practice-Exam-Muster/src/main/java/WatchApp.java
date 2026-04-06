package main.java;

public class WatchApp {

    public static void main(String[] args) {
        Watch watch1 = new Watch("Rolex", "Submariner", 7500.0); // 0,5 Punkte
        Watch watch2 = new SmartWatch("Apple", "Watch Series 6", 399.0, true); // 0,5 Punkte
        System.out.println("Watch 1: " + watch1); // 0,5 Punkte
        System.out.println("Watch 2: " + watch2); // 0,5 Punkte
    }

}

// Gesamtpunktzahl: 2 Punkte