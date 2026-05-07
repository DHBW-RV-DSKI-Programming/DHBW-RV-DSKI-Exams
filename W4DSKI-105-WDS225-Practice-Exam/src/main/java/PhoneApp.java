package main.java;

class PhoneBook {

    // TODO: Hier Aufgabe 3 implementieren

    public void addContact(String name, String number) {
        // TODO: Hier Aufgabe 3 implementieren
    }

    public String findContact(String name) {
        // TODO: Hier Aufgabe 3 implementieren
        return null; // Platzhalter
    }

    public void deleteContact(String name) {
        // TODO: Hier Aufgabe 3 implementieren
    }

}

public class PhoneApp {

    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();

        book.addContact("Eragon",   "0711-111111");
        book.addContact("Arya",     "0711-222222");
        book.addContact("Brom", "0711-333333");
        book.addContact("Arya",   "0711-999999");

        System.out.println("\n" + book.findContact("Eragon"));
        System.out.println(book.findContact("Orik") + "\n");

        book.deleteContact("Brom");
    }

}