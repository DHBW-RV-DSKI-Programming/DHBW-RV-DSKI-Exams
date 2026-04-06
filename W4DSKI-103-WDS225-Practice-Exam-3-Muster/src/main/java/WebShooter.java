package main.java;

public class WebShooter {

    public static void main(String[] args) {
        String webPattern = "AAAABBBCCDAA";
        String compressed = "";
        String decompressed = "";

        for (int i = 0, count = 1; i < webPattern.length(); i++) { // 1 Punkt
            if (i + 1 < webPattern.length() && webPattern.charAt(i) == webPattern.charAt(i+1)) { // 1 Punkt
                count++; // 1 Punkt
            } else { // 1 Punkt
                String compressedPart = String.format("%d%s", count, webPattern.charAt(i)); // 1 Punkt
                compressed += compressedPart; // 1 Punkt
                count = 1; // 1 Punkt
            }
        }
        System.out.println("Compressed Web: " + compressed); // 0,5 Punkte

        for (int i = 0; i < compressed.length(); i += 2) { // 1 Punkt
            int repeatCount = switch (compressed.charAt(i)) {
                case '1' -> 1;
                case '2' -> 2;
                case '3' -> 3;
                case '4' -> 4;
                default -> 0;
            }; // 3 Punkte
            for (int j = 0; j < repeatCount; j++) { // 1 Punkt
                decompressed += compressed.charAt(i + 1); // 1 Punkt
            }
        }
        System.out.println("Decompressed Web: " + decompressed); // 0,5 Punkte
    }
}

// Gesamtpunktzahl: 14 Punkte