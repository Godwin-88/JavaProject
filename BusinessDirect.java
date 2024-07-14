public class BusinessDirect extends RetailChannel {
    public BusinessDirect(String name, double sales) {
        super(name, sales, 0.03); // 3% commission rate
    }
}