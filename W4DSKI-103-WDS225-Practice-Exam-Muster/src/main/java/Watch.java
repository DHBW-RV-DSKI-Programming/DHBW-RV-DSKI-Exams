package main.java;

public class Watch { // 1 Punkt

    private String brand; // 0,5 Punkte
    private String model; // 0,5 Punkte
    private double price; // 0,5 Punkte

    public Watch(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    } // 1 Punkt

    public Watch(String brand, String model) {
        this(brand, model, 0.0);
    } // 1 Punkt

    @Override
    public String toString() {
        return "Watch{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    } // 1 Punkt

}

// Gesamtpunktzahl: 5,5 Punkte