package main.java;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
        getUniqueMovieNamesSorted(movies).forEach(System.out::println); // 1 Punkt
    }

//    private static void getUniqueMovieNamesSorted(List<Order> orders) {
    private static Set<String> getUniqueMovieNamesSorted(List<Movie> movies) { // 2 Punkte
        Set<String> uniqueNames = new TreeSet<>(); // 2 Punkte
        for (Movie movie : movies) { // 1 Punkt
            uniqueNames.add(movie.movieName()); // 2 Punkte
        }
        return uniqueNames; // 1 Punkt
    }

}

// Gesamtpunktzahl: 9 Punkte