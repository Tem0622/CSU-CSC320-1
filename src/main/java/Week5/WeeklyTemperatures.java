package Week5;

import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperatures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        // Initialize days of the week
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        // Input temperatures for each day
        System.out.println("Please enter the average temperatures for each day of the week:");
        for (String day : days) {
            System.out.print(day + ": ");
            double temp = scanner.nextDouble();
            temperatures.add(temp);
        }

        // Loop to allow continuous querying
        while (true) {
            System.out.println("Enter a day of the week to get the temperature, type 'week' for the weekly summary, or type 'exit' to quit:");
            String input = scanner.next();

            // Exit condition
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // Display the temperature for a specific day or for the whole week
            if (input.equalsIgnoreCase("week")) {
                double total = 0;
                System.out.println("Weekly Temperature Summary:");
                for (int i = 0; i < days.size(); i++) {
                    System.out.println(days.get(i) + ": " + temperatures.get(i) + " degrees");
                    total += temperatures.get(i);
                }
                double average = total / days.size();
                System.out.println("Average Weekly Temperature: " + average + " degrees");
            } else {
                int dayIndex = days.indexOf(input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase());
                if (dayIndex != -1) {
                    System.out.println(input + ": " + temperatures.get(dayIndex) + " degrees");
                } else {
                    System.out.println("Invalid input. Please enter a valid day.");
                }
            }
        }

        scanner.close();
        System.out.println("Program terminated.");
    }
}
