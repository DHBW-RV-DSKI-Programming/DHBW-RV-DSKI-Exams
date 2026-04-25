package main.java;

public final class BankUtils {

    public static void main(String[] args) {
        String rawCard = " 4532-1234-5678-9012 ";
        String cleanCard = rawCard.trim(); // 1 Punkt
        cleanCard = cleanCard.replace("-", ""); // 1 Punkt
        String masked = "****-****-****-" + cleanCard.substring(cleanCard.length() - 4); // 3 Punkte

        String cardType = cleanCard.startsWith("4") ? "VISA" : "UNKNOWN"; // 1 Punkt
        System.out.println("Status: " + cardType); // 0,5 Punkte
        System.out.println("Display: " + masked); // 0,5 Punkte
    }

}

// Gesamtpunktzahl: 7 Punkte