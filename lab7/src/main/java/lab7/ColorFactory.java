package lab7;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ColorFactory {
    private final Map<String, Color> pool = new ConcurrentHashMap<>();

    public Color getColor(String name) {
        // only create if it doesn't exist yet
        return pool.computeIfAbsent(name.toLowerCase(), Color::new);
    }

    public int getPoolSize() {
        return pool.size();
    }
}
