package lab7;

public abstract class Shape {
    protected final String id;
    protected final Color color; // shared flyweight

    protected Shape(String id, Color color) {
        this.id = id;
        this.color = color;
    }

    public abstract void draw();
}
