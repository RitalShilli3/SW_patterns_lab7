package lab7;

public class Rectangle extends Shape {
    private final int width;
    private final int height;

    public Rectangle(String id, int width, int height, Color color) {
        super(id, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing Rectangle[id=%s, %dx%d, color=%s]%n",
                id, width, height, color);
    }
}

