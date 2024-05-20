package PortfolioProject;

import java.io.FileWriter;
import java.io.IOException;

public class Vehicle {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    // Default constructor
    public Vehicle() {
        this.make = "";
        this.model = "";
        this.color = "";
        this.year = 0;
        this.mileage = 0;
    }

    // Parameterized constructor
    public Vehicle(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    // Method to add a new vehicle
    public String addVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle added successfully.";
        } catch (Exception e) {
            return "Error adding vehicle: " + e.getMessage();
        }
    }

    // Method to list vehicle information
    public String[] listVehicleInfo() {
        return new String[]{
                "Make: " + make,
                "Model: " + model,
                "Color: " + color,
                "Year: " + year,
                "Mileage: " + mileage
        };
    }

    // Method to remove a vehicle if the attributes match
    public String removeVehicle(String autoMake, String autoModel, String autoColor, int autoYear, int autoMileage) {
        try {
            if (this.make.equals(autoMake) && this.model.equals(autoModel) && this.color.equals(autoColor)
                    && this.year == autoYear && this.mileage == autoMileage) {
                this.make = "";
                this.model = "";
                this.color = "";
                this.year = 0;
                this.mileage = 0;
                return "Vehicle information removed successfully.";
            } else {
                return "No matching vehicle information found.";
            }
        } catch (Exception e) {
            return "Error removing vehicle: " + e.getMessage();
        }
    }

    // Method to update vehicle attributes
    public String updateVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle updated successfully.";
        } catch (Exception e) {
            return "Error updating vehicle: " + e.getMessage();
        }
    }

    // Method to print vehicle info to a file
    public String printToFile(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (String info : listVehicleInfo()) {
                writer.write(info + "\n");
            }
            return "Information printed to file successfully.";
        } catch (IOException e) {
            return "Error printing to file: " + e.getMessage();
        }
    }
}
