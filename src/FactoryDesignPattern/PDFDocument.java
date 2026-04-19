package FactoryDesignPattern;

public class PDFDocument implements Document {
    @Override
    public void createDocument() {
            System.out.println("Creating PDF Document...");
    }
}
