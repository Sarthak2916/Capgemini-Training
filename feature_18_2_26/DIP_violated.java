package feature_18_2_26;

public class DIP_violated {

    public static void main(String[] args) {

        GooglePay payment= new GooglePay();
        payment.payUsingDebitCard();
    }
}

class DebitCard{

    void doPay(){
        System.out.println("Paying through Debit Card");
    }
}

class GooglePay{

    DebitCard dCard;

    public GooglePay(){
        dCard= new DebitCard();
    }

    void payUsingDebitCard(){
        dCard.doPay();
    }
}
