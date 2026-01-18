package solid.ocp;

// Open/Closed Principle - Software entities(classes, modules, functions) should be open for extension and closed for modification
// add new behaviour(extension)
// without changing existing code(closed to modification)

public class OCP {
    public static void main(String[] args){
        PaymentProcessor processor = new PaymentProcessor();
        processor.process(new CreditCardPayment(), 100);
        processor.process(new PayPalPayment(), 200);
    }
}
