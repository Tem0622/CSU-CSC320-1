package Week3;

import java.util.Scanner;

public class TaxCalculatorIncorrect {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your income:");
        double income = scanner.nextDouble();
        int taxRate = 0;

        if (income < 500) {
            taxRate = 10;
        } else if (income < 1500) {
            taxRate = 15;
        } else if (income < 2500) {
            taxRate = 20;
        } else {
            taxRate = 30;
        }

        // Calculation of tax based on income
        double tax = income * taxRate / 100;
        System.out.printf("With an income of $%.2f, your tax rate is %d%% and tax amount is $%.2f\n", income, taxRate, tax);
    }
}
