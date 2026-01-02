package Level1;

public class KmToMiles {
    public static void main(String[] args){
        float distanceKm=10.8f;
        float oneMilePerKm=1.6f;
        float distanceMiles=distanceKm/oneMilePerKm;
        System.out.println("The distance "+distanceKm+" km in miles is "+distanceMiles);
    }
}
