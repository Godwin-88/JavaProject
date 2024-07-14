public class Client {
    private int clientId;
    private String name;
    private String address;
    
    public Client(int clientId, String name, String address) {
        this.clientId = clientId;
        this.name = name;
        this.address = address;
    }

    // Getters and setters
    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

