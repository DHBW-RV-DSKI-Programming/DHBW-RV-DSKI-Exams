package main.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileMerger {

    public static void main(String[] args) throws IOException {
        List<Path> paths = List.of(
                Path.of("data", "words1.txt"),
                Path.of("data", "words2.txt"),
                Path.of("data", "words3.txt")
        );
        System.out.println(mergeFiles(paths));
    }

    private static String mergeFiles(List<Path> paths) throws IOException {
        List<String> words = new ArrayList<>(); // 1 Punkt
        for (Path path : paths) { // 1 Punkt
            List<String> lines = Files.readAllLines(path); // 2 Punkte
            for (String line : lines) { // 1 Punkt
                if (!line.trim().isEmpty()) { // 2 Punkte
                    words.add(line.trim()); // 2 Punkte
                }
            }
        }
        return String.join("; ", words); // 3 Punkte
    }

}

// Gesamtpunktzahl: 12 Punkte