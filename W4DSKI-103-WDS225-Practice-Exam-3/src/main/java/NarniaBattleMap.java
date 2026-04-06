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

        // TODO: Hier Aufgabe 4 implementieren
    }

}
