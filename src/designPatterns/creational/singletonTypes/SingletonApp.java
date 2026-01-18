package designPatterns.creational.singletonTypes;

// Ensure a class has only one instance and provide a global point of access to it.

public class SingletonApp {
    public static void main(String[] args){
        SingletonLazy instance = SingletonLazy.getInstance();
        SingletonLazy instance1 = SingletonLazy.getInstance();
        SingletonSynchronized singletonSynchronized = SingletonSynchronized.getInstance();
        SingletonSynchronized singletonSynchronized1 = SingletonSynchronized.getInstance();
        SingletonBillPugh singletonBillPugh = SingletonBillPugh.getInstance();
        SingletonBillPugh singletonBillPugh1 = SingletonBillPugh.getInstance();

        System.out.println(instance == instance1);
        System.out.println(singletonSynchronized == singletonSynchronized1);
        System.out.println(singletonBillPugh == singletonBillPugh1);
    }
}
