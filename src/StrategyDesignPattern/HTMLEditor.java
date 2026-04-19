package StrategyDesignPattern;

public class HTMLEditor implements TextFormatter{


    @Override
    public void format(String text) {
        System.out.println("HTML Formatted Text: <html>" + text + "</html>");
    }
}
