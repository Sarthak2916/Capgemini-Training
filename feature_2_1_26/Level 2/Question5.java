package Level2;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double farenheit= input.nextDouble();
        double celsius= (farenheit-32)*5/9;
        System.out.println("The "+farenheit+" farenheit is "+celsius+" celsius");
    }
}
