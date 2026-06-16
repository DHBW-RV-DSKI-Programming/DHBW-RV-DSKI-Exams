package main.java;

import java.util.List;

record Song(String title, String artist, int year) {}

public class SongApp {

    public static void main(String[] args) {
        List<Song> songs = List.of(
                new Song("Inception (Time)", "Hans Zimmer", 2010),
                new Song("Interstellar (Main Theme)", "Hans Zimmer", 2014),
                new Song("Hedwig's Theme", "John Williams", 2001),
                new Song("The Dark Knight (Why So Serious?)", "Hans Zimmer", 2008),
                new Song("Gladiator (Now We Are Free)", "Hans Zimmer", 2000),
                new Song("Jurassic Park (Main Theme)", "John Williams", 1993),
                new Song("Pirates of the Caribbean (He's a Pirate)", "Klaus Badelt", 2003),
                new Song("The Lord of the Rings (Concerning Hobbits)", "Howard Shore", 2001),
                new Song("Dune (Paul's Dream)", "Hans Zimmer", 2021),
                new Song("Avatar (I See You)", "James Horner", 2009)
        );

        // TODO: Hier Aufgabe 2 implementieren
    }

    // TODO: Hier Aufgabe 2 implementieren

}