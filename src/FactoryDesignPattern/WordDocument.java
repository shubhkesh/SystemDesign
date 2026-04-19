package FactoryDesignPattern;

public class WordDocument implements Document {
    @Override
    public void createDocument() {
        System.out.println("Creating PDF Document...");
    }
}
