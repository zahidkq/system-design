package designPatterns.creational.singletonTypes;

//Thread Safe

public class SingletonSynchronized {
    private static SingletonSynchronized instance;
    private SingletonSynchronized(){
        //can't be instantiated
    }
    public static synchronized SingletonSynchronized getInstance(){
        if(instance == null) instance = new SingletonSynchronized();
        return instance;
    }
}
