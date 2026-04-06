package main.java.de.good_stock;

class Electronics extends Product {

    private String manufacturer;
    private int warrantyMonths;

    Electronics(String id, String name, String category, double price, String manufacturer, int warrantyMonths) {
        super(id, name, category, price);
        this.manufacturer = manufacturer;
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "manufacturer='" + manufacturer + '\'' +
                ", warrantyMonths=" + warrantyMonths +
                '}';
    }
}