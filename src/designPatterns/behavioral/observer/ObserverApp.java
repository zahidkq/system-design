package designPatterns.behavioral.observer;

// Define a one-to-many dependency so that when one object changes state, all dependent objects are notified automatically.

public class ObserverApp {
    public static void main(String[] a){
        Stock appleSubject = new Stock();
        StockObserver observer = new MobileApp();
        StockObserver observer1 = new WebApp();
        appleSubject.registerObserver(observer);
        appleSubject.registerObserver(observer1);
        appleSubject.setPrice(29.99);
    }
}
