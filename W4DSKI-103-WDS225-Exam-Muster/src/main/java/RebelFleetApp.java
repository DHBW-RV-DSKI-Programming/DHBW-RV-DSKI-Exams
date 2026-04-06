package main.java;

public class RebelFleetApp {

    public static void main(String[] args) {
        int totalPower = 0;

        for (Spaceship ship : Spaceship.values()) { // 1 Punkt
            if (!ship.getPilot().equals("Wedge Antilles")) { // 1 Punkt
                totalPower += ship.getFirepower(); // 1 Punkt
            }
        }

        System.out.println("Rebels' offensive power: " + totalPower); // 1 Punkt
    }

}

// Gesamtpunktzahl: 4 Punkte