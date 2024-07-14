// RetailCompany.java
class RetailCompany {
    private String name;
    private String businessID;
    private String phoneNumber;
    private String email;
    private String address;

    public RetailCompany(String name, String businessID, String phoneNumber, String email, String address) {
        this.name = name;
        this.businessID = businessID;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "'" + name + "', '" + businessID + "', '" + phoneNumber + "', '" + email + "', '" + address + "'";
    }
}
