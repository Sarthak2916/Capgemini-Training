package Level1;
import java.util.Scanner;
public class HeightConverter {
    static double oneInchToCm=2.54;
    static int oneFootToInch=12;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heightInCm=input.nextInt();
        double heightInInches=heightInCm/oneInchToCm;
        int heightInFeet = (int)heightInInches/oneFootToInch;
        int inches = (int)heightInInches%oneFootToInch;
        System.out.println("Your Height in cm is "+heightInCm+" while in feet is "+heightInFeet+" and inches is "+inches);
    }
}
