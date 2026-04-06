package main.java;

class Icu { // 1 Punkt

    static void monitor(int bpm) { // 1 Punkt
        System.out.println("Heart Rate: " + bpm); // 1 Punkt
    }

    static void monitor(double temp) { // 1 Punkt
        System.out.println("Temp: " + temp + "°C"); // 1 Punkt
    }

    static void monitor(String med, int dose) { // 1 Punkt
        System.out.println("Administering " + dose + "mg of " + med); // 1 Punkt
    }

}

public class IcuApp {

    public static void main(String[] args) {
        Icu.monitor(72);
        Icu.monitor(36.7);
        Icu.monitor("Paracetamol", 500);
    }

}

// Gesamtpunktzahl: 7 Punkte