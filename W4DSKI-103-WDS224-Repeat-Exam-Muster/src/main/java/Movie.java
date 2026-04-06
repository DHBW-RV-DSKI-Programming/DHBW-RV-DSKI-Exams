package main.java;

class Movie { // 1 Punkt

    private String title; // 1 Punkt
    private String director; // 1 Punkt
    private int releaseYear; // 1 Punkt
    private double rating; // 1 Punkt

    Movie(String title, String director, int releaseYear, double rating) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
    } // 1 Punkt

    String getTitle() {
        return title;
    } // 1 Punkt

    String getDirector() {
        return director;
    } // 1 Punkt

    int getReleaseYear() {
        return releaseYear;
    } // 1 Punkt

    double getRating() {
        return rating;
    } // 1 Punkt

}

// Gesamtpunktzahl: 10 Punkte
