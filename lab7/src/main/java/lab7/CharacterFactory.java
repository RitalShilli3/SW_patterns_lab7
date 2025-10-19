package lab7;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CharacterFactory {
    private final Map<CharacterKey, ConcreteCharacter> pool = new ConcurrentHashMap<>();

    public ConcreteCharacter getCharacter(char symbol) {
        CharacterKey key = new CharacterKey(symbol);
        return pool.computeIfAbsent(key, k -> new ConcreteCharacter(symbol));
    }

    public int getPoolSize() {
        return pool.size();
    }

    private static class CharacterKey {
        private final char symbol;
        CharacterKey(char s) { this.symbol = s; }

       
        @Override
        public int hashCode() {
            return java.lang.Character.hashCode(symbol);
        }

        @Override public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof CharacterKey)) return false;
            return ((CharacterKey)o).symbol == this.symbol;
        }
    }
}
