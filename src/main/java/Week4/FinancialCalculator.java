package Week4;
import java.util.Scanner;

public class FinancialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        double total = 0.0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double input;
        int count = 0;

        System.out.println("Enter five floating-point values:");

        // Read five floating-point numbers
        while (count < 5) {
            if (scanner.hasNextDouble()) {
                input = scanner.nextDouble();
                total += input;
                if (input > max) {
                    max = input;
                }
                if (input < min) {
                    min = input;
                }
                count++;
            } else {
                System.out.println("Invalid input. Please enter a floating-point number:");
                scanner.next(); // consume the non-double input
            }
        }

        // Calculate average
        double average = total / 5;

        // Calculate interest on total at 20%
        double interest = total * 0.20;

        // Print results
        System.out.printf("Total: %.2f\n", total);
        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Maximum: %.2f\n", max);
        System.out.printf("Minimum: %.2f\n", min);
        System.out.printf("Interest on Total at 20%%: %.2f\n", interest);

        scanner.close();
    }
}
