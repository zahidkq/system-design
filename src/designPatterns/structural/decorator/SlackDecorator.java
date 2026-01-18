package designPatterns.structural.decorator;

public class SlackDecorator extends NotificationDecorator{
    public SlackDecorator(Notification notification){
        super(notification);
    }
    @Override
    public void send(String message){
        notification.send(message);
        System.out.println("Slack Notification: " + message);
    }
}
