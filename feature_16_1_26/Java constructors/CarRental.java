package feature_16_1_26.java_constructors;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay;

    // Default Constructor
    CarRental() {
        this.customerName = "Customer";
        this.carModel = "Basic Car";
        this.rentalDays = 1;
        this.costPerDay = 500.0;
    }

    // Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = 1000.0;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Cost/Day: " + costPerDay);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

