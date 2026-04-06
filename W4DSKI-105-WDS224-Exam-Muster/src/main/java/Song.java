package main.java;

public class Song implements Comparable<Song> { // 0,5 Punkte

    private String title;
    private String artist;
    private int duration;
    private int releaseYear;
    private int popularity;

    public Song(String title, String artist, int duration, int releaseYear, int popularity) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.releaseYear = releaseYear;
        this.popularity = popularity;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getPopularity() {
        return popularity;
    }

    @Override // 0,5 Punkte
    public int compareTo(Song other) { // 0,5 Punkte
        // Sort by popularity in descending order (highest first)
        return Integer.compare(other.popularity, this.popularity); // 1 Punkt
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - %d, %d s, popularity: %d",
                title, artist, releaseYear, duration, popularity);
    }

}

// Gesamtpunktzahl: 2,5 Punkte