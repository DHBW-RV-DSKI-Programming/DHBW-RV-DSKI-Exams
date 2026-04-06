package main.java;

import java.util.ArrayList;

class LibraryManager {

    private ArrayList<String> bookNames;

    LibraryManager(ArrayList<String> bookNames) {
        this.bookNames = bookNames;
    }

    ArrayList<String> searchBooks(String keyword) { // 1 Punkt
        ArrayList<String> foundBooks = new ArrayList<>(); // 1 Punkt
        for (String book : bookNames) { // 1 Punkt
            if (book.contains(keyword)) { // 1 Punkt
                foundBooks.add(book); // 1 Punkt
            }
        }
        return foundBooks; // 1 Punkt
    }

}

// Gesamtpunktzahl: 6 Punkte
