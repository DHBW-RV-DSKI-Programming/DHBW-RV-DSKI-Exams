package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicLibraryApp {

    public static void main(String[] args) {
        List<Song> songs = generateSongs();

        // 1. Natural sorting (by popularity, highest first)
        Collections.sort(songs); // Using the Comparable implementation
        System.out.println("Songs sorted by popularity (standard):");
        songs.forEach(song -> System.out.println("- " + song));
        System.out.println();

        // 2. Sort by year, then artist, then title
        songs.sort(new SongComparator()); // 1 Punkt
        System.out.println("Songs sorted by year, artist, then title:");
        songs.forEach(song -> System.out.println("- " + song));
        System.out.println();
    }
    
    private static List<Song> generateSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("Stairway to Heaven", "Led Zeppelin", 482, 1971, 95));
        songs.add(new Song("Radio Ga Ga", "Queen", 343, 1984, 85));
        songs.add(new Song("Billie Jean", "Michael Jackson", 293, 1983, 93));
        songs.add(new Song("Yesterday", "The Beatles", 125, 1965, 92));
        songs.add(new Song("Bohemian Rhapsody", "Queen", 355, 1975, 98));
        songs.add(new Song("Imagine", "John Lennon", 183, 1971, 90));
        songs.add(new Song("Californication", "Red Hot Chili Peppers", 329, 1999, 88));
        songs.add(new Song("Sweet Child O' Mine", "Guns N' Roses", 356, 1987, 94));
        songs.add(new Song("Hotel California", "Eagles", 391, 1977, 96));
        songs.add(new Song("Smells Like Teen Spirit", "Nirvana", 301, 1991, 97));
        songs.add(new Song("Like a Rolling Stone", "Bob Dylan", 373, 1965, 91));
        songs.add(new Song("Purple Rain", "Prince", 520, 1984, 89));
        songs.add(new Song("Back in Black", "AC/DC", 255, 1980, 92));
        songs.add(new Song("Wonderwall", "Oasis", 258, 1995, 87));
        songs.add(new Song("Hey Jude", "The Beatles", 431, 1968, 95));
        songs.add(new Song("I Want To Break Free", "Queen", 200, 1984, 100));
        return songs;
    }

}

// Gesamtpunktzahl: 1 Punkt