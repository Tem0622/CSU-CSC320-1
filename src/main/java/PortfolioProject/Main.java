package PortfolioProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Vehicle myCar = new Vehicle("Toyota", "Corolla", "Blue", 2010, 50000);

            System.out.println("Vehicle Information:");
            for (String info : myCar.listVehicleInfo()) {
                System.out.println(info);
            }

            String removalMessage = myCar.removeVehicle("Toyota", "Corolla", "Blue", 2010, 50000);
            System.out.println(removalMessage);

            System.out.println("Vehicle Information After Removal:");
            for (String info : myCar.listVehicleInfo()) {
                System.out.println(info);
            }

            String addMessage = myCar.addVehicle("Honda", "Civic", "Red", 2015, 30000);
            System.out.println(addMessage);

            System.out.println("Vehicle Information After Adding New Vehicle:");
            for (String info : myCar.listVehicleInfo()) {
                System.out.println(info);
            }

            String updateMessage = myCar.updateVehicle("Honda", "Civic", "Black", 2015, 35000);
            System.out.println(updateMessage);

            System.out.println("Vehicle Information After Update:");
            for (String info : myCar.listVehicleInfo()) {
                System.out.println(info);
            }

            System.out.print("Do you want to print the information to a file? (Y/N): ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("Y")) {
                String filePath = "C:\\Temp\\Autos.txt";
                String printMessage = myCar.printToFile(filePath);
                System.out.println(printMessage);
            } else {
                System.out.println("A file will not be printed.");
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
