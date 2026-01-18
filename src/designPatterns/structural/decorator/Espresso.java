package designPatterns.structural.decorator;

public class Espresso implements Coffee{
    @Override
    public double cost(){
        // in real world read from properties-files
        return 25.99;
    }
    @Override
    public String description(){
        return "Espresso";
    }
}
