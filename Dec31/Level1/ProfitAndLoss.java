package Level1;

public class ProfitAndLoss {
    public static void main(String[] args) {
        int costPrice=129;
        int sellingPrice=191;
        int Profit = sellingPrice-costPrice;
        float ProfitPercentage = (float)(Profit*100)/costPrice;
        System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice+
                "\nThe Profit is INR "+Profit+" and the Profit Percentage is "+ProfitPercentage
        );
    }
}
