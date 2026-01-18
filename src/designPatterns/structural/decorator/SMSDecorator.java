package designPatterns.structural.decorator;

public class SMSDecorator extends NotificationDecorator{
    public SMSDecorator(Notification notification){
        super(notification);
    }
    @Override
    public void send(String message){
        notification.send(message);
        System.out.println("SMS Notification: " + message);
    }
}
