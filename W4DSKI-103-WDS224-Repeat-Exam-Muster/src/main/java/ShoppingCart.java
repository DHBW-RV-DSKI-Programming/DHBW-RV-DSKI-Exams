package main.java;

import java.math.BigDecimal;

record ShoppingCart(int quantity, BigDecimal pricePerItem) {

    BigDecimal totalPrice() {
        return pricePerItem().multiply(new BigDecimal(quantity()));
    }

    BigDecimal totalPrice(String discountCode) { // 1 Punkt
        BigDecimal discount; // 1 Punkt
        switch (discountCode) { // 1 Punkt
            case "SUMMER10": // 1 Punkt
                discount = new BigDecimal("0.10"); // 1 Punkt
                break; // 1 Punkt
            case "WINTER20": // 1 Punkt
                discount = new BigDecimal("0.20"); // 1 Punkt
                break; // 1 Punkt
            default: // 1 Punkt
                discount = BigDecimal.ZERO; // 1 Punkt
        }
        return totalPrice().multiply((BigDecimal.ONE.subtract(discount))); // 1 Punkt
    }

}

// Gesamtpunktzahl: 12 Punkte