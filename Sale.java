import java.util.List;

public class Sale {
    private int saleId;
    private List<Product> products;
    private Client client;
    
    public Sale(int saleId, List<Product> products, Client client) {
        this.saleId = saleId;
        this.products = products;
        this.client = client;
    }

    // Getters and setters
    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}