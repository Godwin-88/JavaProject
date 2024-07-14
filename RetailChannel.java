public abstract class RetailChannel {
    protected String name;
    protected double sales;
    protected double commissionRate;

    public RetailChannel(String name, double sales, double commissionRate) {
        this.name = name;
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    public double calculateCommission() {
        return this.sales * this.commissionRate;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public double getSales() {
        return sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
}
