package feature_18_2_26;

public class DIP_followed {

    public static void main(String[] args) {

        PaymentMethod method= new DebitCard_();
        GooglePay_ gPay= new GooglePay_(method);
        gPay.pay();
    }
}

interface PaymentMethod{

    void doPay();
}

class DebitCard_ implements PaymentMethod{

    public void doPay(){
        System.out.println("Paying through Debit Card");
    }
}

class GooglePay_{

    PaymentMethod payment;

    public GooglePay_(PaymentMethod payment){
        this.payment=payment;
    }

    void pay(){
        payment.doPay();
    }
}

