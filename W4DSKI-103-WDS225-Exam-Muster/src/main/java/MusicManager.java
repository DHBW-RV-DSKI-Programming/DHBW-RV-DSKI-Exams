package main.java;

public class MusicManager {

    public static void main(String[] args) {
        System.out.println(processInstrumentData("  GITARRE;Saiteninstrument;6_Saiten  "));
    }

    private static String processInstrumentData(String rawData) { // 1 Punkt
        String cleanData = rawData.trim(); // 1 Punkt
        String[] parts = cleanData.split(";"); // 1 Punkt
        String name = parts[0]; // 1 Punkt
        name = name.toLowerCase(); // 1 Punkt
        String detailsText = parts[2]; // 1 Punkt
        detailsText = detailsText.replace("_", " "); // 1 Punkt
        return String.format("Instrument: %s, Details: %s", name, detailsText); // 1 Punkt
    }

}

// Gesamtpunktzahl: 8 Punkte