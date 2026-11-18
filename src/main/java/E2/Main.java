package E2;

public class Main {
    public static void main(String[] args) {

        PaymentMethods.Cash cashmoney = new PaymentMethods.Cash();
        PaymentMethods.CreditCard ringItUpOnMiCard = new PaymentMethods.CreditCard();
        PaymentMethods.PayPal sugaBaby = new PaymentMethods.PayPal();

        cashmoney.pay(100);
        ringItUpOnMiCard.pay(2345);
        sugaBaby.pay(111);

    }
}
