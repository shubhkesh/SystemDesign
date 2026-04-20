package DecoratorDesignPattern;

public class BasicCoffee implements Coffee {


    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public int getPrice() {
        return 20;
    }
}
