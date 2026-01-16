package feature_16_1_26.java_constructors;

public class Main {
    public static void main(String[] args) {

        System.out.println("Book Class");
        Book b1 = new Book();
        Book b2 = new Book("Atomic Habits", "James Clear", 499.0);
        b1.display();
        b2.display();
        System.out.println();

        System.out.println("Circle Class");
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);
        c1.display();
        c2.display();
        System.out.println();

        System.out.println("Person Copy Constructor");
        Person p1 = new Person("Sarthak", 20);
        Person p2 = new Person(p1);
        p1.display();
        p2.display();
        System.out.println();

        System.out.println("Hotel Booking System");
        HotelBooking hb1 = new HotelBooking();
        HotelBooking hb2 = new HotelBooking("Rahul", "Deluxe", 3);
        HotelBooking hb3 = new HotelBooking(hb2);
        hb1.display();
        hb2.display();
        hb3.display();
        System.out.println();

        System.out.println("Library Book System:");
        LibraryBook lb1 = new LibraryBook("Java", "Sarthak", 650.0, true);
        lb1.display();
        lb1.borrowBook();
        lb1.borrowBook();
        lb1.display();
        System.out.println();

        System.out.println("Car Rental System");
        CarRental cr1 = new CarRental();
        CarRental cr2 = new CarRental("Aman", "Honda City", 4);
        cr1.display();
        cr2.display();
        System.out.println();
    }
}

