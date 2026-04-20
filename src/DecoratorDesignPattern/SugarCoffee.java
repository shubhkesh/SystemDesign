package DecoratorDesignPattern;

public class SugarCoffee extends CoffeeDecorator{

    public SugarCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with sugar";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 5;
    }
}
