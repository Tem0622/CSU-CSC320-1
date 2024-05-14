package Week4;

import java.util.Scanner;
public class PINValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pin;
        while (true) {
            System.out.print("Please enter a 4-digit PIN: ");
            pin = scanner.nextLine();
            // Check if the PIN is exactly 4 digits and numeric
            if (pin.matches("\\d{4}")) {  // Regex validation
                System.out.println("PIN You entered is a valid PIN.");
                break;  // exists the loop
            } else {
                System.out.println("Invalid PIN. It must be exactly 4 digits.");
            }
        }
        scanner.close();
    }
}