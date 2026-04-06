package main.java;

import java.util.ArrayList;

public class LibraryApp {

    public static void main(String[] args) {
        ArrayList<String> bookNames = new ArrayList<>();
        bookNames.add("The Great Gatsby");
        bookNames.add("To Kill a Mockingbird");
        bookNames.add("1984");
        bookNames.add("The Fault in Our Stars");
        bookNames.add("The Lord of the Rings - The Fellowship of the Ring");
        bookNames.add("The Lord of the Rings - The Two Towers");
        bookNames.add("The Lord of the Rings - The Return of the King");
        bookNames.add("Lord of the Flies");

        LibraryManager libraryManager = new LibraryManager(bookNames); // 1 Punkt
        ArrayList<String> foundBooks = libraryManager.searchBooks("Lord"); // 1 Punkt
        System.out.println("Found books: " + foundBooks); // 1 Punkt
    }

}

// Gesamtpunktzahl: 3 Punkte