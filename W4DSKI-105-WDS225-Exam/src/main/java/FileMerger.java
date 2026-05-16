package main.java;

import java.io.IOException;
import java.nio.file.Path;
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
        // TODO: Hier Aufgabe 2 implementieren
        return ""; // Platzhalter
    }

}
