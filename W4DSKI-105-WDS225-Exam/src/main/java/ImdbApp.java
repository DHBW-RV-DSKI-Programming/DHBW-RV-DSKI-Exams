package main.java;

import java.util.List;

record Movie(String movieId, String movieName, double rating) {}

public class ImdbApp {

    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("O1", "Good Will Hunting", 10.0),
                new Movie("O2", "Batman Begins", 8.2),
                new Movie("O3", "Moneyball", 7.6),
                new Movie("O4", "Ballerina",  6.8),
                new Movie("O5", "Good Will Hunting", 8.4),
                new Movie("O6", "Ballerina", 9.0),
                new Movie("O7", "Notting Hill", 8),
                new Movie("O8", "The King's Speech", 9)
        );
        // TODO: Hier Aufgabe 4 implementieren
        getUniqueMovieNamesSorted(movies);
    }

    // TODO: Hier Aufgabe 4 implementieren
    private static void getUniqueMovieNamesSorted(List<Movie> movies) {
    }

}
