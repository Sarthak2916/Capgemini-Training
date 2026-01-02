package Level1;

import java.util.Scanner;

public class CourseDiscount2 {
    public static void main(String[] args) {
        int fee;
        int discountPercent;
        Scanner input = new Scanner(System.in);
        fee = input.nextInt();
        discountPercent = input.nextInt();
        int discountedAmount = (discountPercent*fee)/100;
        int discountedFee = fee-discountedAmount;
        System.out.println("The discount amount is INR "+discountedAmount+" and final discounted fee is INR "+discountedFee);
    }
}
