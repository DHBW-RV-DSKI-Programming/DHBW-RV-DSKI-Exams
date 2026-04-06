package main.java;

interface Maintainable {
    void performMaintenance();
}

abstract class Vehicle implements Maintainable {
    String model;
    double engineHealth;

    Vehicle(String model, double health) {
        this.model = model;
        this.engineHealth = health;
    }
}

class Truck extends Vehicle {
    Truck(String model, double health) { super(model, health); }

    @Override
    public void performMaintenance() {
        this.engineHealth = 1.0;
        System.out.println(model + " restored to 100% health.");
    }
}

public class FleetManager {

    public static void modifyVehicle(Vehicle v) {
        v.engineHealth = 0.2;
    }

    public static void main(String[] args) {
        Vehicle[] fleet = {
                new Truck("Freightliner", 0.8),
                new Truck("Volvo", 0.9)
        };

        Vehicle[] shadowFleet = fleet;
        modifyVehicle(shadowFleet[0]);

        System.out.println("Engine Health of fleet[0]: " + fleet[0].engineHealth);

        Vehicle[] deepBackup = new Vehicle[fleet.length]; // 1 Punkt

        for (int i = 0; i < fleet.length; i++) { // 1 Punkt
            deepBackup[i] = new Truck(fleet[i].model, fleet[i].engineHealth); // 1 Punkt
        }

        System.out.println("\n--- Testing Deep Copy ---"); // 0,5 Punkte
        deepBackup[0].engineHealth = 1.0; // 1 Punkt

        System.out.println("Deep Backup[0] Health: " + deepBackup[0].engineHealth); // 1 Punkt
        System.out.println("Original Fleet[0] Health: " + fleet[0].engineHealth);   // 1 Punkt
    }
}

// Gesamtpunktzahl: 6,5 Punkte