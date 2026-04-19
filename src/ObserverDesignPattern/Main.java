package ObserverDesignPattern;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Stock Name");
        String stockName = sc.nextLine();
        System.out.println("Enter the Current Stock Price");
        double currentPrice = sc.nextDouble();
        System.out.println("Enter the Previous Stock Price");
        double previousPrice = sc.nextDouble();

        StockMarket stockMarket = new StockMarket();
        TV tv = new TV("Samsung TV");
        Mobile mobile = new Mobile("iPhone Mobile");

        stockMarket.addObserver(tv);
        stockMarket.addObserver(mobile);

        stockMarket.setStockPrice(stockName, currentPrice, previousPrice);
    }
}
