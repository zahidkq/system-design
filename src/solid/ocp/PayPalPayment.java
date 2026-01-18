package solid.ocp;

public class PayPalPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Payment via PayPal: " + amount);
    }
}
