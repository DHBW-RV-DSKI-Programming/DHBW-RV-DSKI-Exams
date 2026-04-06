package main.java;

class MovieNotFoundException extends Exception { // 1 Punkt

  private final String movieName; // 1 Punkt

  MovieNotFoundException(String message, String movieName) {
    super(message);
    this.movieName = movieName;
  } // 1 Punkt

  String getMovieName() {
    return movieName;
  }

}

// Gesamtpunktzahl: 3 Punkte
