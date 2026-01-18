package designPatterns.behavioral.strategy;

public class CreditCardPayment implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid $" + amount + " using CreditCard");
    }
}
