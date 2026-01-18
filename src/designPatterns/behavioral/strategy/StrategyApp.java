package designPatterns.behavioral.strategy;

// Define a family of algorithms, encapsulate each one, and make them interchangeable at runtime.
public class StrategyApp {
    public static void main(String[] args){
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setStrategy(new CreditCardPayment());
        paymentContext.makePayment(28.99);

        paymentContext.setStrategy(new UPIPayment());
        paymentContext.makePayment(87.77);
    }
}
