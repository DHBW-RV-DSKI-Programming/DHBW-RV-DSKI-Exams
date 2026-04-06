package main.java;

import java.math.BigDecimal;

record ShoppingCart(int quantity, BigDecimal pricePerItem) {

    BigDecimal totalPrice() {
        return pricePerItem().multiply(new BigDecimal(quantity()));
    }

    // TODO: Hier Aufgabe 8 implementieren

}