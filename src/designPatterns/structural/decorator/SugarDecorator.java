package designPatterns.structural.decorator;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 5.99;
    }
    @Override
    public String description(){
        return coffee.description() + ",Sugar";
    }
}
