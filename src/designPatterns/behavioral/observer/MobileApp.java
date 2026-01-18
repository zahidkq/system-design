package designPatterns.behavioral.observer;

public class MobileApp implements StockObserver{
    @Override
    public void update(double price){
        System.out.println("Mobile App: Stock price updated to $" + price);
    }
}
