package designPatterns.creational.factory;

// Define an interface for creating an object, but let subclasses decide which class to instantiate.
// This allows loose coupling between client code and object creation logic.

public class FactoryApp {
    public static void main(String[] args){
        DocumentFactory doc = new PdfFactory();
        doc.openDocument();
    }
}
