package main.java;

class Wero implements PaymentMethod { // 2 Punkte

    @Override // 1 Punkt
    public void pay(double amount) { // 1 Punkt
        System.out.println("Paid: " + amount); // 1 Punkt
    }

    @Override // 1 Punkt
    public void refund(double amount) { // 1 Punkt
        System.out.println("Refunded: " + amount); // 1 Punkt
    }

}

// Gesamtpunktzahl: 8 Punkte