package StrategyDesignPattern;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Select Text to Format 1:");
        String textFormat = input.nextLine();
        TextFormatterService textFormatter = new TextFormatterService(new PlainTextEditor());
        textFormatter.formatText(textFormat);

        System.out.println("Select Text to Format 2:");
        String textFormat2 = input.nextLine();
        TextFormatterService textFormatter2 = new TextFormatterService(new HTMLEditor());
        textFormatter2.formatText(textFormat);




    }
}
