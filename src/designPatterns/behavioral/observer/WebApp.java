package designPatterns.behavioral.observer;

public class WebApp implements StockObserver{
    @Override
    public void update(double price){
        System.out.println("Web App: Stock price updated to $" + price);
    }
}
