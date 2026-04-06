package main.java.de.good_stock;

class Clothing extends Product {

    private String size;
    private String material;

    Clothing(String id, String name, String category, double price, String size, String material) {
        super(id, name, category, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
