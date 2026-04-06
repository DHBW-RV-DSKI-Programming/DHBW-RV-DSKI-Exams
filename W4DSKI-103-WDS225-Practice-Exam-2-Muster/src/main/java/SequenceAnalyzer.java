package main.java;

import java.util.ArrayList;
import java.util.List;

public class SequenceAnalyzer {

    public static void main(String[] args) {
        int longestSequenceSize = longestSequence(new ArrayList<>(List.of(10, 11, 12, 12, 13, 15, 16, 20))); // 0,5 Punkte
        System.out.println(longestSequenceSize); // 0,5 Punkte
    }

    public static int longestSequence(ArrayList<Integer> ids) { // 1 Punkt
        int maxStreak = 1; // 1 Punkt
        int currentStreak = 1; // 1 Punkt

        for (int i = 0; i < ids.size() - 1; i++) { // 1 Punkt
            int current = ids.get(i); // 1 Punkt
            int next = ids.get(i + 1); // 1 Punkt

            if (next == current + 1) { // 1 Punkt
                currentStreak++; // 1 Punkt
            } else if (next != current) { // 1 Punkt
                if (currentStreak > maxStreak) { // 1 Punkt
                    maxStreak = currentStreak; // 1 Punkt
                }
                currentStreak = 1; // 1 Punkt
            }
        }
        return Math.max(currentStreak, maxStreak); // 1 Punkt
    }

}

// Gesamtpunktzahl: 14 Punkte