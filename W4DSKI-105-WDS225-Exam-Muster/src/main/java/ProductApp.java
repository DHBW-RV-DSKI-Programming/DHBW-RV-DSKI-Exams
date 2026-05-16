package main.java;

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
        return products.stream() // 1 Punkt
                .filter(p -> p.category().equals("Electronics") && p.stock() > 0) // 3 Punkte
                .sorted((a, b) -> Double.compare(b.price(), a.price())) // 2 Punkte
                .map(p -> p.name() + " (" + p.price() + "€)") // 1 Punkt
                .toList(); // 1 Punkt
    }

}

// Gesamtpunktzahl: 8 Punkte
