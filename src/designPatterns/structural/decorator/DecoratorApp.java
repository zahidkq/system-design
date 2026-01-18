package designPatterns.structural.decorator;

// Add new behavior to an object dynamically without modifying its class and without subclass explosion.

public class DecoratorApp {
    public static void main(String[] args){
        Coffee coffee = new Espresso();
        coffee = new CondensedMilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        System.out.println("Coffee purchased: " + coffee.description());
        System.out.println("Coffee cost: " + coffee.cost());

        Notification notification = new EmailNotification();
        notification = new SMSDecorator(notification);
        notification = new SlackDecorator(notification);
        notification.send("System Alert!!!");
    }
}
