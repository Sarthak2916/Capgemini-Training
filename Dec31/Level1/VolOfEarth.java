package Level1;

public class VolOfEarth {
    static double pi=3.14;
    public static void main(String[] args) {
        double radiusKm=6378;
        double kmPerMile=1.6;
        double radiusM= radiusKm/kmPerMile;
        double volCubicKm = ((4.0/3.0)*pi*Math.pow(radiusKm,3));
        double volCubicM = ((4.0/3.0)*pi*Math.pow(radiusM,3));
        System.out.println("The volume of earth in cubic kilometers is "+volCubicKm+" and cubic miles is "+volCubicM);
        System.out.printf("The volume of earth in cubic kilometers is %.2f ,and cubic miles is %.2f",volCubicKm ,volCubicM);

    }
}
