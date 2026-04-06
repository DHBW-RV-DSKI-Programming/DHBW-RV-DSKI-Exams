package main.java;

import java.util.ArrayList;
import java.util.List;

record Soldier(String name, int strength, double magicMultiplier) {
    public int getEffectiveStrength() {
        return (int) (strength * magicMultiplier);
    }
}

public class NarniaBattleMap {

    public static void main(String[] args) {
        ArrayList<Soldier> aslansArmy = new ArrayList<>(List.of(
                new Soldier("Talking Lion", 100, 1.0),
                new Soldier("Centaur", 50, 1.2),
                new Soldier("Dryad", 30, 1.5),
                new Soldier("Faun", 15, 2.0),
                new Soldier("Bird", 5, 1.0),
                new Soldier("Susan Pevensie", 99, 1.1)
        ));

        String shortestName = null; // 1 Punkt
        int minLength = Integer.MAX_VALUE; // 1 Punkt

        for (Soldier soldier : aslansArmy) { // 1 Punkt
            String currentName = soldier.name(); // 1 Punkt
            int currentLen = currentName.length(); // 1 Punkt

            if (currentLen < minLength) { // 1 Punkt
                minLength = currentLen; // 1 Punkt
                shortestName = currentName; // 1 Punkt
            }
        }

        Soldier strongest = aslansArmy.getFirst(); // 1 Punkt
        for (Soldier c : aslansArmy) { // 1 Punkt
            if (c.getEffectiveStrength() > strongest.getEffectiveStrength()) { // 1 Punkt
                strongest = c; // 1 Punkt
            }
        }

        System.out.println("Shortest name: " + shortestName); // 0,5 Punkte
        System.out.println("Strongest unit: " + strongest.name()); // 0,5 Punkte
    }

}

// Gesamtpunktzahl: 13 Punkte