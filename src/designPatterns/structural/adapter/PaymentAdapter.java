package designPatterns.structural.adapter;

public class PaymentAdapter implements PaymentProcessor{
    OldPaymentProcessor oldPaymentProcessor;

    public PaymentAdapter(OldPaymentProcessor paymentProcessor){
        this.oldPaymentProcessor = paymentProcessor;
    }

    @Override
    public void pay(double amount){
        oldPaymentProcessor.makePayment(amount);
    }

}
