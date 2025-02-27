import java.util.List;

public class Vehicle {
    private String vehicleSerialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;

    // Method
    public Vehicle(String vehicleSerialNumber, String name, String model, int year, String manufacturer, double baseCost){
        this.vehicleSerialNumber = vehicleSerialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    public void printInfo() {
        System.out.println("Serial No: " + vehicleSerialNumber);
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Base Cost: " + baseCost);
    }
}