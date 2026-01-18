package designPatterns.structural.decorator;

public class CondensedMilkDecorator extends CoffeeDecorator{
    public CondensedMilkDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 12.49;
    }
    @Override
    public String description(){
        return coffee.description() + ",Condensed Milk";
    }
}
