package StrategyDesignPattern;

public class TextFormatterService {

    TextFormatter textFormatter;

    TextFormatterService(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public void formatText(String text) {
        textFormatter.format(text);
    }
}
