package Week3;

import java.util.Scanner;

public class IncomeRangeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for tax rate
        System.out.println("Enter your tax rate as a whole number (e.g., 10 for 10%):");
        int taxRate = scanner.nextInt();

        // Using switch to find the corresponding income range
        switch (taxRate) {
            case 10:
                System.out.println("Your income is less than $500.");
                break;
            case 15:
                System.out.println("Your income is between $500 and $1499.");
                break;
            case 20:
                System.out.println("Your income is between $1500 and $2499.");
                break;
            case 30:
                System.out.println("Your income is $2500 or more.");
                break;
            default:
                System.out.println("Invalid tax rate or your income does not fit the predefined brackets.");
                break;
        }
    }
}
