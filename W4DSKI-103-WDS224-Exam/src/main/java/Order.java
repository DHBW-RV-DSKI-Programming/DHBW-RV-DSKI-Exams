package main.java;

class Order {

    private String id;
    private String status;

    Order(String id, String status) {
        this.id = id;
        this.status = status;
    }

    String getId() {
        return id;
    }

    String getStatus() {
        return status;
    }

    void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{id='" + id + "', status='" + status + "'}";
    }

}
