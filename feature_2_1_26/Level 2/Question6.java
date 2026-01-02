package Level2;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int salary = input.nextInt();
        int bonus = input.nextInt();
        int totalIncone= salary+(salary*bonus)/100;
        System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+totalIncone);
    }
}
