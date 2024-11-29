package Main;

public class Punctuation {
    private final char symbol;
    public Punctuation(char symbol) {
        this.symbol = symbol;
    }
    public char getSymbol() {
        return symbol;
    }
    public String toString() {
        return String.valueOf(symbol);
    }
}
