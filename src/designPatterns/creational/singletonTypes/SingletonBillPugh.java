package designPatterns.creational.singletonTypes;

//No synchronization needed, Lazy Loaded, Thread Safesty

public class SingletonBillPugh {
    private SingletonBillPugh(){
        //can't be instantiated
    }
    private static class Holder{
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }
    public static SingletonBillPugh getInstance(){
        return Holder.INSTANCE;
    }
}
