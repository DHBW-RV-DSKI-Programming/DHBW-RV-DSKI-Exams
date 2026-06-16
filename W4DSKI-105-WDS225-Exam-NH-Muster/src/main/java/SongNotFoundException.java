package main.java;

public class SongNotFoundException extends RuntimeException { // 1 Punkt
    public SongNotFoundException(String title) { // 1 Punkt
        super(String.format("Song '%s' not found", title)); // 2 Punkte
    }
}

// Gesamtpunktzahl: 4 Punkte