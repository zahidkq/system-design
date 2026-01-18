package designPatterns.behavioral.observer;

public interface StockSubject {
    void registerObserver(StockObserver stockObserver);
    void removeObserver(StockObserver stockObserver);
    void notifyAllObserver();
}
