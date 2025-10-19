package lab7;

public class ConcreteCharacter implements Character {
    private final char symbol; // intrinsic, shared

    public ConcreteCharacter(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void draw(int position, int fontSize, String color) {
        System.out.printf("Drawing character '%c' at pos %d with fontSize=%d and color=%s%n",
                          symbol, position, fontSize, color);
    }

    @Override
    public char getSymbol() {
        return symbol;
    }
}
