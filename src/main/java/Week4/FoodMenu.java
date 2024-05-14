package Week4;

import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) {
        // import scanner class for user input
        Scanner input = new Scanner(System.in);

        // declared variables
        int choice;
        boolean invalidChoice;

        // arrays to store menu items and prices
        String menuItems[] = { "Fish", "Rice", "Goat", "Milk" };
        double menuPrices[] = { 12.95, 5.00, 7.85, 3.99 };

        // do while loop that executes code at least once
        do {
            // sets the variable to false at each iteration of the loop
            invalidChoice = false;

            // displays the line prompting user to select
            System.out.print("Choose one: ");

            // for loop that iterates over the menu items and prices
            for (int i = 0; i < menuItems.length; i++) {
                System.out.println((i + 1) + ". " + menuItems[i] + "\t\t" + menuPrices[i]);
            }

            // reads the integer input from user
            choice = input.nextInt();

            // checks user input within the defined bounds of menu items
            if (choice >= 1 && choice <= menuItems.length) {
                System.out.println("You chose " + menuItems[choice - 1] + " priced at: $" + menuPrices[choice - 1]);
            } else {
                System.out.println("Invalid choice!");
                invalidChoice = true;
            }
        } while (invalidChoice);

        // closes input for resource leak
        input.close();
    }
}
