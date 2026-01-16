package feature_16_1_26.java_constructors;

public class Circle {
    private double radius;

    // Default Constructor (calls parameterized)
    Circle() {
        this(1.0);
    }

    // Parameterized Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (Math.PI * radius * radius));
    }
}

