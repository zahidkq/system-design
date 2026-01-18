package designPatterns.creational.factory;

public class WordDocument implements Document{
    @Override
    public void open(){
        System.out.println("Printing WORD Document...");
    }
}
