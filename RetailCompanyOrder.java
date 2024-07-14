class RetailCompanyOrder extends OrderItem {
    private String companyName;
    private String address;

    public RetailCompanyOrder(String companyName, String address, String businessID, String orderNumber, String productType, String productSize, int numberOfItems, double itemCost) {
        super(businessID, orderNumber, productType, productSize, numberOfItems, itemCost);
        this.companyName = companyName;
        this.address = address;
    }

    @Override
    public double calculateTotalAmount() {
        return this.numberOfItems * this.itemCost;
    }

    // Print details for the retail company order
    public void printOrderDetails() {
        System.out.println(companyName + ", " + address + ", " + orderNumber + ", " + productType + " " + productSize + ", Nos " + numberOfItems + ", $" + formattedAmount());
    }
}
