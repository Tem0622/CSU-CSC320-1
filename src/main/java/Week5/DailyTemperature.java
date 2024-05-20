package Week5;

public class DailyTemperature {
    public static void main(String[] args) {
        // Stores daily temperatures
        int[] temperatures = {68, 70, 75, 72, 69, 71, 73};

        // Prints initial temperatures
        System.out.println("Initial daily temperatures:");
        printTemperatures(temperatures);

        // Modifies temperatures
        modifyTemperature(temperatures, 2, 78);
        modifyTemperature(temperatures, 5, 74);

        // Prints updated temperatures
        System.out.println("\nUpdated daily temperatures:");
        printTemperatures(temperatures);
    }

    // Method to print all temperatures
    public static void printTemperatures(int[] temperatures) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday","Saturday", "Sunday"};
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println(days[i] + ": " + temperatures[i] + "°F");
        }
    }

    // Method to modify a temperature
    public static void modifyTemperature(int[] temperatures, int dayIndex,
                                         int newTemperature) {
        if (dayIndex >= 0 && dayIndex < temperatures.length) {
            temperatures[dayIndex] = newTemperature;
        } else {
            System.out.println("Invalid day index!");
        }
    }
}