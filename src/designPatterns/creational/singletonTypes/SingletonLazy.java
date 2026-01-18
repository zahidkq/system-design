package designPatterns.creational.singletonTypes;

//Lazy Initialization - Basic Implementation

public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy(){
        //can't be instantiated
    }
    public static SingletonLazy getInstance(){
        if(instance == null) instance = new SingletonLazy();
        return instance;
    }
}
