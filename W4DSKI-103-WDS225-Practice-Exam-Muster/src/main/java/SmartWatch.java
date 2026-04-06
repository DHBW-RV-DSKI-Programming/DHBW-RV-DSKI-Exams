package main.java;

public class SmartWatch extends Watch { // 1 Punkt

    private boolean hasHeartRateMonitor; // 0,5 Punkte

    public SmartWatch(String brand, String model, double price, boolean hasHeartRateMonitor) {
        super(brand, model, price);
        this.hasHeartRateMonitor = hasHeartRateMonitor;
    } // 1 Punkt

    @Override
    public String toString() {
        return "SmartWatch{" +
                super.toString() + '\'' +
                ", hasHeartRateMonitor=" + hasHeartRateMonitor +
                '}';
    } // 1 Punkt

}

// Gesamtpunktzahl: 3,5 Punkte