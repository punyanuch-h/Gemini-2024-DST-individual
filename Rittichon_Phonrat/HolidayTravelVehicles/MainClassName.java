package Rittichon_Phonrat.HolidayTravelVehicles;


public class MainClassName {
    public static void main(String[] args) {
        // ตัวอย่างการสร้าง Manufacturer
        Manufacturer manufacturer = new Manufacturer("M001", "Toyota", "1234 Main St", "123-456-7890");
        
        // ตัวอย่างการสร้าง Vehicle
        Vehicle vehicle = new Vehicle("V001", "Camry", "Sedan", 2024, manufacturer, 30000);
        
        // ตัวอย่างการสร้าง Customer
        Customer customer = new Customer("C001", "John Doe", "5678 Elm St", "987-654-3210");
        
        // ตัวอย่างการสร้าง Salesperson
        Salesperson salesperson = new Salesperson("S001", "Jane Smith", "4321 Oak St", "567-890-1234");
        
        // ตัวอย่างการสร้าง TradeInVehicle
        TradeInVehicle tradeInVehicle = new TradeInVehicle("T001", "123ABC", "Honda", "Civic", 2020);
        
        // ตัวอย่างการสร้าง DealerInstalledOption
        DealerInstalledOption option = new DealerInstalledOption("D001", "Leather Seats", 2000, "Camry", 2024);
        
        // ตัวอย่างการสร้าง SalesInvoice
        SalesInvoice invoice = new SalesInvoice("INV001", customer, salesperson, vehicle, tradeInVehicle, 5000, option, 32000, 2560, 500);
        
        // แสดงข้อมูลใบเสนอราคา
        System.out.println(invoice);
    }
}

class Manufacturer {
    private String manufacturerID;
    private String name;
    private String address;
    private String phoneNumber;
    
    public Manufacturer(String manufacturerID, String name, String address, String phoneNumber) {
        this.manufacturerID = manufacturerID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name + " (" + manufacturerID + ")";
    }
}

class Vehicle {
    private String vehicleSerialNumber;
    private String name;
    private String model;
    private int year;
    private Manufacturer manufacturer;
    private double baseCost;
    
    public Vehicle(String vehicleSerialNumber, String name, String model, int year, Manufacturer manufacturer, double baseCost) {
        this.vehicleSerialNumber = vehicleSerialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    @Override
    public String toString() {
        return name + " " + model + " (" + year + ")";
    }
}

class Customer {
    private String customerID;
    private String name;
    private String address;
    private String phoneNumber;
    
    public Customer(String customerID, String name, String address, String phoneNumber) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Salesperson {
    private String salespersonID;
    private String name;
    private String address;
    private String phoneNumber;
    
    public Salesperson(String salespersonID, String name, String address, String phoneNumber) {
        this.salespersonID = salespersonID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name;
    }
}

class TradeInVehicle {
    private String tradeInVehicleID;
    private String serialNumber;
    private String make;
    private String model;
    private int year;
    
    public TradeInVehicle(String tradeInVehicleID, String serialNumber, String make, String model, int year) {
        this.tradeInVehicleID = tradeInVehicleID;
        this.serialNumber = serialNumber;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return make + " " + model + " (" + year + ")";
    }
}

class DealerInstalledOption {
    private String optionCode;
    private String description;
    private double price;
    private String model;
    private int year;
    
    public DealerInstalledOption(String optionCode, String description, double price, String model, int year) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return description + " ($" + price + ")";
    }
}

class SalesInvoice {
    private String invoiceID;
    private Customer customer;
    private Salesperson salesperson;
    private Vehicle vehicle;
    private TradeInVehicle tradeInVehicle;
    private double tradeInAllowance;
    private DealerInstalledOption dealerInstalledOptions;
    private double finalPrice;
    private double tax;
    private double registrationFee;
    
    public SalesInvoice(String invoiceID, Customer customer, Salesperson salesperson, Vehicle vehicle,
                        TradeInVehicle tradeInVehicle, double tradeInAllowance, DealerInstalledOption dealerInstalledOptions,
                        double finalPrice, double tax, double registrationFee) {
        this.invoiceID = invoiceID;
        this.customer = customer;
        this.salesperson = salesperson;
        this.vehicle = vehicle;
        this.tradeInVehicle = tradeInVehicle;
        this.tradeInAllowance = tradeInAllowance;
        this.dealerInstalledOptions = dealerInstalledOptions;
        this.finalPrice = finalPrice;
        this.tax = tax;
        this.registrationFee = registrationFee;
    }
    
    @Override
    public String toString() {
        return "Sales Invoice #" + invoiceID + "\n" +
               "Customer: " + customer + "\n" +
               "Salesperson: " + salesperson + "\n" +
               "Vehicle: " + vehicle + "\n" +
               (tradeInVehicle != null ? "Trade-in: " + tradeInVehicle + " (Allowance: $" + tradeInAllowance + ")\n" : "") +
               (dealerInstalledOptions != null ? "Options: " + dealerInstalledOptions + "\n" : "") +
               "Final Price: $" + finalPrice + "\n" +
               "Tax: $" + tax + "\n" +
               "Registration Fee: $" + registrationFee;
    }
}
