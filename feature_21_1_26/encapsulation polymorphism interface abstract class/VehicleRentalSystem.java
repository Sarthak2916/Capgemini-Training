package feature_21_1_26.encapsulation_polymorphism_interface_abstractclass;

import java.util.ArrayList;
import java.util.List;

interface Insurable {
    double calculateInsurance(int days);
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    protected Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate (per day): " + rentalRate);
    }
}

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getMaskedPolicyNumber() {
        if (insurancePolicyNumber == null || insurancePolicyNumber.length() < 4) return "****";
        return "****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        if (days <= 0) return 0;
        double cost = getRentalRate() * days;
        if (days >= 7) cost *= 0.90;
        return cost;
    }

    @Override
    public double calculateInsurance(int days) {
        if (days <= 0) return 0;
        return 200 * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance | Policy: " + getMaskedPolicyNumber();
    }
}

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getMaskedPolicyNumber() {
        if (insurancePolicyNumber == null || insurancePolicyNumber.length() < 4) return "****";
        return "****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        if (days <= 0) return 0;
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance(int days) {
        if (days <= 0) return 0;
        return 80 * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance | Policy: " + getMaskedPolicyNumber();
    }
}

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getMaskedPolicyNumber() {
        if (insurancePolicyNumber == null || insurancePolicyNumber.length() < 4) return "****";
        return "****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        if (days <= 0) return 0;
        double base = getRentalRate() * days;
        double surcharge = base * 0.15;
        return base + surcharge;
    }

    @Override
    public double calculateInsurance(int days) {
        if (days <= 0) return 0;
        return 350 * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance | Policy: " + getMaskedPolicyNumber();
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("MH12CAR1234", 1500, "CARPOL987654"));
        vehicles.add(new Bike("MH12BIK5678", 500, "BIKPOL123456"));
        vehicles.add(new Truck("MH12TRK9999", 3000, "TRKPOL456789"));

        int days = 5;

        for (Vehicle v : vehicles) {
            double rentalCost = v.calculateRentalCost(days);

            double insuranceCost = 0;
            String insuranceDetails = "Not Insured";

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                insuranceCost = ins.calculateInsurance(days);
                insuranceDetails = ins.getInsuranceDetails();
            }

            v.displayDetails();
            System.out.println("Days: " + days);
            System.out.println("Rental Cost: " + rentalCost);
            System.out.println(insuranceDetails);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("Total Cost: " + (rentalCost + insuranceCost));
        }
    }
}

