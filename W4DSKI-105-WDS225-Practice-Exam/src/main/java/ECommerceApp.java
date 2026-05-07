package main.java;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

enum Category {
    ELECTRONICS, FURNITURE, STATIONERY, CLOTHING, SPORTS
}

record Product(String name, Category category, double price, int stock) {
}

public class ECommerceApp {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Laptop",       Category.ELECTRONICS,  999.99, 5),
                new Product("Headphones",   Category.ELECTRONICS,   49.99, 0),
                new Product("Smartphone",   Category.ELECTRONICS,  799.99, 3),
                new Product("Desk",         Category.FURNITURE,    199.99, 8),
                new Product("Chair",        Category.FURNITURE,    149.99, 0),
                new Product("Pen",          Category.STATIONERY,     1.99, 50),
                new Product("Notebook",     Category.STATIONERY,     8.99, 30),
                new Product("Jacket",       Category.CLOTHING,     89.99, 10),
                new Product("Sneakers",     Category.SPORTS,       119.99, 7),
                new Product("Yoga Mat",     Category.SPORTS,        29.99, 15)
        );

        System.out.println("\n--- Out of Stock (by price desc) ---");
        // TODO: Hier Aufgabe 4 implementieren

        String allNames = "";
        // TODO: Hier Aufgabe 4 implementieren
        System.out.println("\n--- All Products ---\n" + allNames);
    }
}