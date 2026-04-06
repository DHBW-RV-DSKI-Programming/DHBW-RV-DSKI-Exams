package main.java;

import java.util.Comparator;

public class SongComparator implements Comparator<Song> { // 1 Punkt

    @Override // 0,5 Punkte
    public int compare(Song s1, Song s2) { // 1 Punkt
        // Primary sort by year in descending order
        int yearComparison = Integer.compare(s2.getReleaseYear(), s1.getReleaseYear()); // 1 Punkt

        // If years are equal, sort by artist alphabetically
        if (yearComparison == 0) { // 1 Punkt
            int artistComparison = s1.getArtist().compareTo(s2.getArtist()); // 1 Punkt

            // If artists are also equal, sort by title alphabetically
            if (artistComparison == 0) { // 1 Punkt
                return s1.getTitle().compareTo(s2.getTitle()); // 1 Punkt
            }

            return artistComparison; // 1 Punkt
        }

        return yearComparison; // 1 Punkt
    }

}

// Gesamtpunktzahl: 9,5 Punkte