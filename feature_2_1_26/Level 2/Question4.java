package Level2;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double celsius = input.nextDouble();
        double farenheit= celsius*(9.0/5.0)+32;
        System.out.println("The "+celsius+" celsius is "+farenheit+" fahrenheit");
    }
}
