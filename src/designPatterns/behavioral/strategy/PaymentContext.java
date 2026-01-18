package designPatterns.behavioral.strategy;

public class PaymentContext {
    Payment payment;
    public void setStrategy(Payment payment){
        this.payment = payment;
    }
    public void makePayment(double amount){
        payment.pay(amount);
    }
}
