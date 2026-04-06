package main.java;

public class OrderApp {

    public static void main(String[] args) {
        Order order1 = new Order("1", "PENDING");
        Order order2 = new Order("2", "PENDING");
        Order order3 = new Order("3", "PENDING");
        Order order4 = new Order("4", "PENDING");

        OrderManager orderManager = new OrderManager();
        orderManager.addOrder(order1);
        orderManager.addOrder(order2);
        orderManager.addOrder(order3);
        orderManager.addOrder(order4);

        orderManager.printOrders();
        orderManager.processPendingOrders();
        orderManager.printOrders();
    }

}
