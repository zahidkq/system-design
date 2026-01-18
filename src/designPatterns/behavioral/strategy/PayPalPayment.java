package designPatterns.behavioral.strategy;

public class PayPalPayment implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid $" + amount + " using PayPal");
    }
}
