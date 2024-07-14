public class TimeSpaFinance {

    // Method to calculate the total gross income for a year
    public static double calculateTotalYearlyIncome(double[] monthlyIncomes) {
        double total = 0;
        for (double income : monthlyIncomes) {
            total += income;
        }
        return total;
    }

    // Method to find the months with above-average gross income
    public static void printAboveAverageMonths(double[] monthlyIncomes, double average) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "August", "Sep", "Oct", "Nov", "Dec"};
        System.out.println("Months with above-average gross income:");
        for (int i = 0; i < monthlyIncomes.length; i++) {
            if (monthlyIncomes[i] > average) {
                System.out.println(months[i] + ": $" + monthlyIncomes[i]);
            }
        }
    }

    public static void main(String[] args) {
        // Monthly gross incomes for 4 years
        double[][] yearlyIncomes = {
            {140, 120, 136, 122, 142, 138, 142, 151, 144, 120, 143, 147},
            {130, 122, 126, 122, 140, 181, 141, 128, 168, 122, 141, 148},
            {127, 131, 134, 124, 142, 158, 142, 165, 142, 121, 140, 154},
            {140, 127, 137, 125, 141, 138, 141, 154, 180, 123, 142, 139}
        };

        // Calculating and printing the total gross income per year
        for (int i = 0; i < yearlyIncomes.length; i++) {
            double totalIncome = calculateTotalYearlyIncome(yearlyIncomes[i]);
            double averageIncome = totalIncome / yearlyIncomes[i].length;
            System.out.println("Year " + (i + 1) + " Total Gross Income: $" + totalIncome);
            System.out.println("Year " + (i + 1) + " Average Monthly Gross Income: $" + averageIncome);

            // Printing months with above-average income
            printAboveAverageMonths(yearlyIncomes[i], averageIncome);
            System.out.println(); // Add a blank line for readability
        }
    }
}
