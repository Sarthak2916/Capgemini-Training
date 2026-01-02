package Level2;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noOfChocolates= input.nextInt();
        int noOfChildren = input.nextInt();
        int chocolatesPerChild= noOfChocolates/noOfChildren;
        int remainingChocolates= noOfChocolates%noOfChildren;
        System.out.println("The number of chocolates each child gets is "+chocolatesPerChild+" and the number of remaining chocolates are "+remainingChocolates);
    }
}
