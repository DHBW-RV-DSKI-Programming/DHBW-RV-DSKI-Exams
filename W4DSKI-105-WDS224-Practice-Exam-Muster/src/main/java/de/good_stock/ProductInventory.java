package main.java.de.good_stock;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class ProductInventory<T extends Product> { // 1 Punkt

    private List<T> products = new ArrayList<>(); // 1 Punkt

    public Optional<T> findProductByCategory(String category) { // 1 Punkt
        T result = null; // 0,5 Punkte
        for (T product : products) { // 0,5 Punkte
            result = product; // 0,5 Punkte
            if (result.getCategory().equals(category)) { // 0,5 Punkte
                return Optional.of(result); // 1 Punkt
            }
        }

        return Optional.ofNullable(result); // 1 Punkt
    }

    public void addProduct(T newItem) {
        products.add(newItem);
    }

}

// Gesamtpunktzahl: 7 Punkte
