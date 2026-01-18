package designPatterns.structural.adapter;

// Allow two incompatible interfaces to work together without changing their existing code.

public class AdapterApp {
    public static void main(String[] args){
        PaymentProcessor paymentProcessor = new PaymentAdapter(new OldPaymentProcessor());
        paymentProcessor.pay(25.66);
    }
}
