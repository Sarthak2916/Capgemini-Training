package feature_21_1_26.encapsulation_polymorphism_interface_abstractclass;

import java.util.ArrayList;
import java.util.List;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {

    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price!");
        }
    }

    public abstract double calculateDiscount();

    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Electronics extends Product implements Taxable {

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18% GST";
    }
}

class Clothing extends Product implements Taxable {

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 12% GST";
    }
}

class Groceries extends Product {

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

public class EcommercePlatform {

    public static void printFinalPrices(List<Product> products) {

        System.out.println("FINAL BILL DETAILS:");

        for (Product p : products) {
            double price = p.getPrice();
            double discount = p.calculateDiscount();

            double tax = 0;
            String taxInfo = "No Tax Applied";

            if (p instanceof Taxable) {
                Taxable t = (Taxable) p;
                tax = t.calculateTax();
                taxInfo = t.getTaxDetails();
            }

            double finalPrice = price + tax - discount;

            p.displayProduct();
            System.out.println("Discount: " + discount);
            System.out.println(taxInfo);
            System.out.println("Tax Amount: " + tax);
            System.out.println("Final Price: " + finalPrice);

        }
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(1, "Laptop", 60000));
        products.add(new Clothing(2, "T-Shirt", 1000));
        products.add(new Groceries(3, "Rice (10kg)", 700));

        printFinalPrices(products);
    }
}

