import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Main class for the first prompt
public class Main {
        public static void main(String[] args) {
        Product shampoo = new Product("Olive Oil Shampoo", 100, 3.49);
        Product conditioner = new Product("Rose Oil Conditioner", 400, 6.49);

        List<Product> products = Arrays.asList(shampoo, conditioner);
        Client client = new Client(1, "Beauty Spa", "1234 Spa Lane");
        Order order = new Order(101, products);
        Sale sale = new Sale(201, products, client);

        // Print variables
        System.out.println("Product Name: " + shampoo.getName());
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Client Name: " + client.getName());
        System.out.println("Sale ID: " + sale.getSaleId());
    }
}

// Another class for the second prompt with its own main method
class SecondPrompt {
public static void main(String[] args) {
        RetailChannel businessDirect = new BusinessDirect("Business Direct", 100000);
        RetailChannel internationalRetail = new InternationalRetail("International Retail", 200000);
        RetailChannel spaPartnershipRetail = new SpaPartnershipRetail("Spa Partnership", 150000);

        System.out.println("Business Direct Sales: $" + businessDirect.getSales() + 
                           ", Commission: $" + businessDirect.calculateCommission());
        System.out.println("International Retail Sales: $" + internationalRetail.getSales() + 
                           ", Commission: $" + internationalRetail.calculateCommission());
        System.out.println("Spa Partnership Sales: $" + spaPartnershipRetail.getSales() + 
                           ", Commission: $" + spaPartnershipRetail.calculateCommission());
    }
}
// Another class for the third prompt with its own main method
class ThirdPrompt {
    public static void main(String[] args) {
        List<RetailCompany> companyList = new ArrayList<>();
        
        // Add 10 medical and beauty retail companies
        companyList.add(new RetailCompany("Smith and Partners", "001", "01234567891", "manager@smithpartners.com", "35 High Street, Oxford"));
        companyList.add(new RetailCompany("BeautyWorks", "002", "01234567892", "contact@beautyworks.com", "123 Rose Avenue, Cambridge"));
        companyList.add(new RetailCompany("MediCare Essentials", "003", "01234567893", "support@medicareessentials.com", "67 Bloom Lane, Manchester"));
        // ... add more companies as needed to reach at least 10
        
        // Print all companies
        for (RetailCompany company : companyList) {
            System.out.println(company.toString());
        }
    }
}


// Another class for the Fourth prompt with its own main method
class FourthPrompt {
        public static void main(String[] args) {
        List<RetailCompanyOrder> orders = new ArrayList<>();

        // Create orders based on the provided data
        orders.add(new RetailCompanyOrder("Smith and Partners", "35 High Street, Oxford", "001", "Pr321", "Rose Oil Shampoo", "400ml", 45, 6.49));
        orders.add(new RetailCompanyOrder("Glamour Boutique", "123 Fashion Ave, Milan", "002", "Pr322", "Tea Tree and Lemon Shampoo", "100ml", 30, 2.99));
        orders.add(new RetailCompanyOrder("Natural Elements", "789 Green St, Portland", "003", "Pr323", "Extra Moisturizing Shampoo", "1000ml", 20, 9.00));

        // Print details for each order
        for (RetailCompanyOrder order : orders) {
            order.printOrderDetails();
        }
    }
}
 // Continue this pattern for additional prompts as needed



