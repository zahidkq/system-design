package solid.ocp;

public class CreditCardPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Payment via CreditCard: " + amount);
    }
}
