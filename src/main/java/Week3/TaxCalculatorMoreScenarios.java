package Week3;

import java.util.Scanner;

public class TaxCalculatorMoreScenarios{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your income:");
        double income = scanner.nextDouble();
        System.out.println(formatTaxMessage(income));

        // Call testAllScenarios to test all possible scenarios
        testAllScenarios();
    }

    // Method to calculate and format tax message
    private static String formatTaxMessage(double income) {
        int taxRate = determineTaxRate(income);
        double tax = income * taxRate / 100;
        return String.format("With an income of $%.2f, your tax rate is %d%% and tax amount is $%.2f", income, taxRate, tax);
    }

    // Method to determine the tax rate based on income
    private static int determineTaxRate(double income) {
        if (income < 500) {
            return 10;
        } else if (income >= 500 && income < 1500) {
            return 15;
        } else if (income >= 1500 && income < 2500) {
            return 20;
        } else if (income >= 2500) {
            return 30;
        }
        return 0; // Default case, should not be reached
    }

    // Method to test all scenarios
    private static void testAllScenarios() {
        double[] testIncomes = {0, 499, 500, 1000, 1499, 1500, 2000, 2499, 2500, 3000};
        System.out.println("\nTesting all scenarios:");
        for (double income : testIncomes) {
            System.out.println(formatTaxMessage(income));
        }
    }
}
