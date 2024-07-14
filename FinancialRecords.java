public class FinancialRecords {
    private double[][] monthlyProfits = {
        {140, 120, 136, 122, 142, 138, 142, 151, 144, 120, 143, 147},
        {130, 122, 126, 122, 140, 181, 141, 128, 168, 122, 141, 148},
        {127, 131, 134, 124, 142, 158, 142, 165, 142, 121, 140, 154},
        {140, 127, 137, 125, 141, 138, 141, 154, 180, 123, 142, 139}
    };

    public void calculateAndPrintFinancialSummaries() {
        for (int i = 0; i < monthlyProfits.length; i++) {
            double totalProfit = calculateTotalProfit(i);
            double averageProfit = totalProfit / monthlyProfits[i].length;
            
            System.out.printf("Year %d total profit: $%.2f%n", i + 1, totalProfit);
            System.out.printf("Year %d average monthly profit: $%.2f%n", i + 1, averageProfit);

            System.out.println("Months in year " + (i + 1) + " with above average profits:");
            for (int j = 0; j < monthlyProfits[i].length; j++) {
                if (monthlyProfits[i][j] > averageProfit) {
                    System.out.printf("Month %d: $%.2f%n", j + 1, monthlyProfits[i][j]);
                }
            }
            System.out.println();
        }
    }

    private double calculateTotalProfit(int yearIndex) {
        double sum = 0;
        for (double profit : monthlyProfits[yearIndex]) {
            sum += profit;
        }
        return sum;
    }

    public static void main(String[] args) {
        FinancialRecords records = new FinancialRecords();
        records.calculateAndPrintFinancialSummaries();
    }
}

