package FactoryDesignPattern;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the document you would like to create:");
        String name = input.nextLine();
        Document document = DocumentFactory.createDocument(name);
        document.createDocument();

    }
}
