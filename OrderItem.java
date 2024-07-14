
import java.text.DecimalFormat;
abstract class OrderItem {
    protected String businessID;
    protected String orderNumber;
    protected String productType;
    protected String productSize;
    protected int numberOfItems;
    protected double itemCost;

    public OrderItem(String businessID, String orderNumber, String productType, String productSize, int numberOfItems, double itemCost) {
        this.businessID = businessID;
        this.orderNumber = orderNumber;
        this.productType = productType;
        this.productSize = productSize;
        this.numberOfItems = numberOfItems;
        this.itemCost = itemCost;
    }

    // Abstract method to calculate total amount
    public abstract double calculateTotalAmount();
    
    // Utility method to format the calculated amount
    protected String formattedAmount() {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(calculateTotalAmount());
    }
}