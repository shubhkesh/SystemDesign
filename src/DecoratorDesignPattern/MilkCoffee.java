package DecoratorDesignPattern;

public class MilkCoffee extends CoffeeDecorator {
    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Milk";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 15;
    }
}
