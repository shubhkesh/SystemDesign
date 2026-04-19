package ObserverDesignPattern;

public class TV implements Observer {

    private String name;

    public TV(String name) {
        this.name = name;
    }

    @Override
    public void updatePrice(String stockName,double price) {

        System.out.println("Current Stock Price in " + name + "is " + price + "for Stock " + stockName);
    }
}
