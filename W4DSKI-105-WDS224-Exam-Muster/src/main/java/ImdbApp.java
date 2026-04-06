package main.java;

import java.util.HashMap;
import java.util.Map;

public class ImdbApp {

    public static void main(String[] args) {
        Map<String, Double> movieRatings = new HashMap<>(); // 1 Punkt
        movieRatings.put("Fight Club", 8.8); // 0,5 Punkte
        movieRatings.put("How to Train Your Dragon", 8.1); // 0,5 Punkte

        try { // 1 Punkt
            System.out.println("Rating of 'Fight Club': " + findMovieRating(movieRatings, "Fight Club")); // 0,5 Punkte
            System.out.println("Rating of 'Saving Private Ryan': " + findMovieRating(movieRatings, "Saving Private Ryan")); // 0,5 Punkte
        } catch (MovieNotFoundException e) { // 1 Punkt
            System.out.println("Warning: " + e.getMessage()); // 1 Punkt
            movieRatings.put(e.getMovieName(), 0.0); // 1 Punkt
        }
    }

    private static double findMovieRating(Map<String, Double> ratings, String movieName) throws MovieNotFoundException { // 1 Punkt
        if (!ratings.containsKey(movieName)) { // 1 Punkt
            throw new MovieNotFoundException("Movie '" + movieName + "' not found", movieName); // 1 Punkt
        }
        return ratings.get(movieName); // 1 Punkt
    }

}

// Gesamtpunktzahl: 11 Punkte