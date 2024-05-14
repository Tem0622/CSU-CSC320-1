package Week4;

import java.util.ArrayList;
import java.util.Scanner;

public class RecipeMaker {

    public static void printRecipe(ArrayList<String> ingredients) {
        System.out.println("Recipe:");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> ingredients = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the recipe maker!");

        while (true) {
            System.out.print("Enter an ingredient (or type 'done' to finish): ");
            String ingredient = scanner.nextLine();

            if (ingredient.equalsIgnoreCase("done")) {
                break;
            }

            ingredients.add(ingredient);
        }

        if (ingredients.isEmpty()) {
            System.out.println("No ingredients added. Exiting.");
        } else {
            System.out.println("\nHere's your recipe:");
            printRecipe(ingredients);
        }

        scanner.close();
    }
}
