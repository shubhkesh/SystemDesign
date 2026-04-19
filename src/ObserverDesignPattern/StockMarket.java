package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject {

    public List<Observer> observers;
    String stockName;

    public StockMarket() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers(String stockName, double price) {
        for (Observer observer : observers) {
            observer.updatePrice(stockName, price);
        }

    }

    @Override
    public void setStockPrice(String stockName, double currentPrice, double previousPrice) {

        if(currentPrice > previousPrice) {
            this.stockName = stockName;
            notifyObservers(stockName, currentPrice);
        }

    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
}
