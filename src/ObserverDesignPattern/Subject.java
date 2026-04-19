package ObserverDesignPattern;

public interface Subject {

    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers(String stockName, double price);
    void setStockPrice(String stockName,double currentPrice, double newPrice);

}
