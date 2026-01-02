package Level2;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double side1= input.nextInt();
        double side2= input.nextInt();
        double side3= input.nextInt();
        double distanceToCover=5;
        double totalRounds= (side1+side2+side3)/distanceToCover;
        System.out.println("The total number of rounds the athlete will run is "+totalRounds+" to complete 5 km");
    }
}
