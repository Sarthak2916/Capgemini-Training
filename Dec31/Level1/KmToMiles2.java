package Level1;

import java.util.Scanner;

public class KmToMiles2 {
    public static void main(String[] args){
        double km;
        Scanner input = new Scanner(System.in);
        km=input.nextDouble();
        double oneMilePerKm=1.6;
        double distanceMiles=km/oneMilePerKm;
        System.out.println("Total Miles is "+distanceMiles+" mile for the given "+km+" km");
    }
}
