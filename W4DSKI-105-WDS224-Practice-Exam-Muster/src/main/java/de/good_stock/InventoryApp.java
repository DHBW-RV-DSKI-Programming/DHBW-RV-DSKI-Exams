package main.java.de.good_stock;

import java.util.Optional;

public class InventoryApp {
    public static void main(String[] args) {
        ProductInventory<Product> inventory = new ProductInventory<>();

        inventory.addProduct(new Electronics("E001", "Smartphone", "Mobile", 599.99, "Apple", 12));
        inventory.addProduct(new Clothing("C001", "Shirt", "Clothing", 19.99, "Large", "Black"));
        inventory.addProduct(new Product("P001", "Cola", "Drink", 1.99));

        Optional<Product> productOpt = inventory.findProductByCategory("Drink");
        productOpt.ifPresent(product -> System.out.println("Stats: " + product));
    }
}

