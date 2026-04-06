package main.java;

public class HogwartsApp {

    public static void main(String[] args) {
        HogwartsHouse hogwartsHouse = HogwartsHouse.RAVENCLAW; // 1 Punkt
        switch (hogwartsHouse) { // 1 Punkt
            case RAVENCLAW: // 1 Punkt
                System.out.println("You are wise and disciplined."); // 1 Punkt
                break; // 1 Punkt
            case GRYFFINDOR: // 1 Punkt
                System.out.println("You are brave and empathetic."); // 1 Punkt
                break; // 1 Punkt
            case SLYTHERIN: // 1 Punkt
                System.out.println("You are ambitious and cunning."); // 1 Punkt
                break; // 1 Punkt
        }
    }

}

// Gesamtpunktzahl: 11 Punkte