package main.java;

import java.math.BigDecimal;

public class WalmartApp {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(5, new BigDecimal("20.0"));

        BigDecimal totalPrice = cart.totalPrice();
        System.out.println("Total Price: " + totalPrice);

        BigDecimal discountedPrice = cart.totalPrice("SUMMER10"); // 1 Punkt
        System.out.println("Total Price with discount: " + discountedPrice); // 1 Punkt
    }

}

// Gesamtpunktzahl: 2 Punkte