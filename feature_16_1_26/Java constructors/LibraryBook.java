package feature_16_1_26.java_constructors;

public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    // Default Constructor
    LibraryBook() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.availability = true;
    }

    // Parameterized Constructor
    LibraryBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    void borrowBook() {
        if (availability) {
            System.out.println("Book borrowed successfully: " + title);
            availability = false;
        } else {
            System.out.println("Book not available: " + title);
        }
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }
}

