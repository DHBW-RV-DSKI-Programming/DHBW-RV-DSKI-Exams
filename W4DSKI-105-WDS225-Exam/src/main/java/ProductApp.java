package main.java;

import java.util.ArrayList;
import java.util.List;

record Product(String name, String category, double price, int stock) {}

public class ProductApp {

    public static void main(String[] args) {
        List<Product> PRODUCTS = List.of(
                new Product("Laptop",  "Electronics",  1200.0, 5),
                new Product("Phone",   "Electronics",  800.0,  0),
                new Product("Desk",    "Furniture",    350.0,  12),
                new Product("Chair",   "Furniture",    150.0,  8),
                new Product("Monitor", "Electronics",  400.0,  3)
        );
        System.out.println(getTopProducts(PRODUCTS));
    }

    private static List<String> getTopProducts(List<Product> products) {
        // TODO: Hier Aufgabe 1 implementieren
        return new ArrayList<>(); // Platzhalter
    }

}
