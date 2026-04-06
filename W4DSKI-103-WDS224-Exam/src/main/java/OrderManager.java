package main.java;

import java.util.ArrayList;
import java.util.List;

class OrderManager {

    private List<Order> orders = new ArrayList<>();

    void addOrder(Order order) {
        orders.add(order);
    }

    void processPendingOrders() {
        for (Order order : orders) {
            if (order.getStatus().equals("PENDING")) {
                System.out.println("Processing order: " + order.getId());
                order.setStatus("COMPLETED");
                orders.remove(order);
            }
        }
    }

    void printOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

}
