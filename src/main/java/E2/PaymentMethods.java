package E2;

public class PaymentMethods {

    interface payment {
        void pay(double amount);
    }

    static class CreditCard implements payment {
        public void pay(double amount) {
            System.out.println("Payment $" + amount + " credited to account.");
        }
    }

    static class PayPal implements payment {
        public void pay(double amount) {
            System.out.println("$" + amount + " accepted. Thank you for using PayPal!");
        }
    }

    static class Cash implements payment {
        public void pay(double amount) {
            System.out.println("I'll be taking that $" + amount + ".");
        }
    }
}
