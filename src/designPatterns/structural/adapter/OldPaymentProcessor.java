package designPatterns.structural.adapter;

public class OldPaymentProcessor {
    public void makePayment(double amount){
        System.out.println("Payment done with Old Payment Method, amount: " + amount);
    }
}
