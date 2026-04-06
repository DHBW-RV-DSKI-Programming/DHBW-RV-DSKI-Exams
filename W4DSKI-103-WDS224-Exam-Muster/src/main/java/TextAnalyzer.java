package main.java;

class TextAnalyzer {

    static int countConsonant(String text) {
        if (text == null) { // 1 Punkt
            return -1; // 1 Punkt
        }

        int count = 0;
        for (int i = 0; i < text.length(); i++) { // 1 Punkt
            char c = text.charAt(i); // 1 Punkt
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != ' ') { // 1 Punkt
                count++; // 1 Punkt
            }
        }
        return count; // 1 Punkt
    }

}

// Gesamtpunktzahl: 7 Punkte
