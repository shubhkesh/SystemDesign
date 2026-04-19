package StrategyDesignPattern;

public class PlainTextEditor implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println("Plain Text Formatted Text: " + text);
    }
}
