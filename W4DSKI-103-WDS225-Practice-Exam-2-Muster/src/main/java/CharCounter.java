package main.java;

public class CharCounter {

    public static int[] countOccurrences(String text, char[] targets) { // 1 Punkt
        int[] counts = new int[targets.length]; // 1 Punkt

        for (int i = 0; i < text.length(); i++) { // 0,5 Punkte
            char currentChar = text.charAt(i); // 0,5 Punkte

            for (int j = 0; j < targets.length; j++) { // 0,5 Punkte
                if (currentChar == targets[j]) { // 0,5 Punkte
                    counts[j]++; // 0,5 Punkte
                }
            }
        }

        return counts; // 0,5 Punkte
    }

    public static void main(String[] args) {
        String inputData = "security_breach_detected_at_midnight";
        char[] searchList = {'s', 'e', '_', 'a'}; // 1 Punkt

        int[] finalCounts = countOccurrences(inputData, searchList); // 1 Punkt

        System.out.printf("Search Results for: '%s'", inputData); // 0,5 Punkte
        System.out.println("\n------------------------------------"); // 0,5 Punkte
        for (int i = 0; i < searchList.length; i++) { // 0,5 Punkte
            System.out.printf("Character '%s' appeared %d times\n", searchList[i], finalCounts[i]); // 0,5 Punkte
        }
    }

}

// Gesamtpunktzahl: 9 Punkte
