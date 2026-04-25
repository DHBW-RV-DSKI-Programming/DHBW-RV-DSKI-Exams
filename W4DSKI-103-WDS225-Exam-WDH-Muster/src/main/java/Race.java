package main.java;

interface EnergyRecoverySystem { // 1 Punkt

    void boost(); // 1 Punkt

}

interface DragReductionSystem { // 1 Punkt

    void openFlap(); // 1 Punkt

}

class RedBullRacingRB22 implements EnergyRecoverySystem, DragReductionSystem { // 2 Punkte

    @Override // 0,5 Punkte
    public void boost() { // 1 Punkt
        System.out.println("Regaining energy"); // 1 Punkt
    }

    @Override // 0,5 Punkte
    public void openFlap() { // 1 Punkt
        System.out.println("DRS Active: Drag reduced."); // 1 Punkt
    }

}

public class Race {

    public static void main(String[] args) {
        RedBullRacingRB22 max = new RedBullRacingRB22(); // 1 Punkt
        max.boost(); // 1 Punkt
        max.openFlap(); // 1 Punkt
    }

}

// Gesamtpunktzahl: 14 Punkte