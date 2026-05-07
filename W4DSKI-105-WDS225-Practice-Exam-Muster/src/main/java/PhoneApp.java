package main.java;

import java.util.HashMap;
import java.util.Map;

class PhoneBook {

    private final Map<String, String> contacts = new HashMap<>(); // 2 Punkte

    public void addContact(String name, String number) {
        if (contacts.containsKey(name)) { // 1 Punkt
            System.out.println(name + " already exists. Use update instead."); // 0,5 Punkte
            return; // 1 Punkt
        }
        contacts.put(name, number); // 1 Punkt
        System.out.println(name + " added."); // 0,5 Punkte
    }

    public String findContact(String name) {
        if (!contacts.containsKey(name)) { // 1 Punkt
            return name + " not found."; // 1 Punkt
        }
        return name + ": " + contacts.get(name); // 1 Punkt
    }

    public void deleteContact(String name) {
        if (!contacts.containsKey(name)) { // 1 Punkt
            System.out.println(name + " not found."); // 0,5 Punkte
            return; // 1 Punkt
        }
        contacts.remove(name); // 1 Punkt
        System.out.println(name + " deleted."); // 0,5 Punkte
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

// Gesamtpunktzahl: 13 Punkte