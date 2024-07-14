public class Product {
    private String name;
    private int size; // in ml
    private double price; // in $

    public Product(String name, int size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

