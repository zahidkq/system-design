package designPatterns.creational.factory;

public class PdfFactory extends DocumentFactory{
    public Document createDocument(){
        return new PdfDocument();
    }
}
