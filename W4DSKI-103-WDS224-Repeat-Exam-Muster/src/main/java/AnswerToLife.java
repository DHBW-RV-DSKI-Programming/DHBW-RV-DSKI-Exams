package main.java;

public class AnswerToLife {

    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) { // 1 Punkt
            if (i == 42) { // 1 Punkt
                System.out.println("You have reached the answer to life, the universe, and everything."); // 1 Punkt
                break; // 1 Punkt
            } else if (i % 2 == 0) { // 1 Punkt
                System.out.println(i + " is even."); // 1 Punkt
            } else { // 1 Punkt
                System.out.println(i + " is odd."); // 1 Punkt
            }
        }
    }

}

// Gesamtpunktzahl: 8 Punkte
