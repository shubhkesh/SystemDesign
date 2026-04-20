package DecoratorDesignPattern;

public class Main {

    public static void main(String[] args) {

        Coffee coffee = new BasicCoffee();
        coffee = new MilkCoffee(coffee);
        coffee = new SugarCoffee(coffee);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getPrice());


    }
}
