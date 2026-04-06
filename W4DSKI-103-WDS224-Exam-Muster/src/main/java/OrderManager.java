package main.java;

import java.util.ArrayList;
import java.util.List;

class OrderManager {

    private List<Order> orders = new ArrayList<>();

    void addOrder(Order order) {
        orders.add(order);
    }

    void processPendingOrders() {
//        for (Order order : orders) {
        for (int i = 0; i < orders.size(); i++) { // 3 Punkte
            Order order = orders.get(i); // 2 Punkte
            if (order.getStatus().equals("PENDING")) {
                System.out.println("Processing order: " + order.getId());
                order.setStatus("COMPLETED");
                orders.remove(order);
                i--; // 3 Punkte
            }
        }
    }

    void printOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

}

// Gesamtpunktzahl: 8 Punkte
