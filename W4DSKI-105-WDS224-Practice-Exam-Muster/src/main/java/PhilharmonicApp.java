import net.neue_philharmonie.UnknownInstrumentException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PhilharmonicApp {
    
    private static final List<String> knownInstruments = List.of("Violin",
            "Viola",
            "Cello",
            "Double Bass",
            "Flute",
            "Piccolo",
            "Oboe",
            "Clarinet",
            "Bassoon",
            "French Horn",
            "Trumpet",
            "Trombone",
            "Tuba",
            "Piano",
            "Harp",
            "Timpani",
            "Xylophone",
            "Marimba",
            "Cymbals",
            "Triangle",
            "Snare Drum",
            "Bass Drum");

    public static void main(String[] args) throws IOException {
        List<String> elements = Files.readAllLines(Paths.get("data", "InstrumentList.txt")); // 1 Punkt
        try { // 1 Punkt
            List<String> unknownInstruments = elements.stream()
                    .filter(instrument -> !knownInstruments.contains(instrument))
                    .toList(); // 1 Punkt
            boolean allKnown = unknownInstruments.isEmpty(); // 1 Punkt

            if (!allKnown) { // 1 Punkt
                throw new UnknownInstrumentException("Unexpected instruments: " + String.join(", ", unknownInstruments), unknownInstruments); // 1 Punkt
            }
        } catch (UnknownInstrumentException e) { // 1 Punkt
            System.out.println(e.getMessage()); // 1 Punkt
        }
    }
    
}

// Gesamtpunktzahl: 8 Punkte