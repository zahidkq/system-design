package designPatterns.creational.factory;

public class PdfDocument implements Document{
    @Override
    public void open(){
        System.out.println("Opening PDF document...");
    }
}
