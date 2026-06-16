package main.java;

import java.util.ArrayList;

record Book(String title, String author, int pages) {}

public class Library {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("The Fellowship of the Ring", "J.R.R. Tolkien", 423));
        books.add(new Book("Dune", "Frank Herbert", 688));
        books.add(new Book("1984", "George Orwell", 328));
        books.add(new Book("The Two Towers", "J.R.R. Tolkien", 352));
        books.add(new Book("Blood Meridian", "Cormac McCarthy", 351));
        books.add(new Book("Dune Messiah", "Frank Herbert", 272));
        books.add(new Book("The Return of the King", "J.R.R. Tolkien", 416));
        books.add(new Book("The Brothers Karamazov", "Fyodor Dostoevsky", 796));
        books.add(new Book("The Road", "Cormac McCarthy", 287));
        books.add(new Book("Animal Farm", "George Orwell", 112));
        books.add(new Book("Foundation", "Isaac Asimov", 255));

        // TODO: Hier Aufgabe 3 implementieren
    }

}