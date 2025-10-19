package lab7;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private final List<CharacterUsage> document = new ArrayList<>();
    private final CharacterFactory factory = new CharacterFactory();

    public void addCharacter(char symbol, int position, int fontSize, String color) {
        ConcreteCharacter c = factory.getCharacter(symbol);
        document.add(new CharacterUsage(c, position, fontSize, color));
        c.draw(position, fontSize, color);
    }

    public int getFlyweightCount() {
        return factory.getPoolSize();
    }

    private static class CharacterUsage {
        final ConcreteCharacter c;
        final int pos;
        final int fontSize;
        final String color;
        CharacterUsage(ConcreteCharacter c, int pos, int fontSize, String color) {
            this.c = c; this.pos = pos; this.fontSize = fontSize; this.color = color;
        }
    }
}
