package lab7;

public class Circle extends Shape {
    private final int radius;

    public Circle(String id, int radius, Color color) {
        super(id, color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing Circle[id=%s, radius=%d, color=%s]%n", id, radius, color);
    }
}
