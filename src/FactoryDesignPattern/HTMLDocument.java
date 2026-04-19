package FactoryDesignPattern;

public class HTMLDocument implements Document {
    @Override
    public void createDocument() {
        System.out.println("Creating an HTML document...");
    }
}
