package designPatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements StockSubject{
    private List<StockObserver> observerList = new ArrayList<>();
    private double price;

    @Override
    public void registerObserver(StockObserver stockObserver){
        observerList.add(stockObserver);
    }

    @Override
    public void removeObserver(StockObserver stockObserver){
        observerList.remove(stockObserver);
    }

    public void setPrice(double amount){
        this.price = amount;
        notifyAllObserver();
    }

    @Override
    public void notifyAllObserver(){
        for(StockObserver observer : observerList){
            observer.update(price);
        }
    }
}
