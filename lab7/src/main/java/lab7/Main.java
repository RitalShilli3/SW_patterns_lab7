package lab7;

public class Main {
    public static void main(String[] args) {
        
        System.out.println(" === in lab task 1: === ");
        TextEditor editor = new TextEditor();
        editor.addCharacter('A', 1, 12, "black");
        editor.addCharacter('B', 2, 14, "red");
        editor.addCharacter('A', 3, 18, "blue");
        editor.addCharacter('C', 4, 12, "black");
        editor.addCharacter('B', 5, 14, "red");

        System.out.println("Flyweight objects created: " + editor.getFlyweightCount());


        System.out.println(" === assignment 1: === ");
        ColorFactory colorFactory = new ColorFactory();

        Shape circle1 = new Circle("C1", 10, colorFactory.getColor("Red"));
        Shape circle2 = new Circle("C2", 15, colorFactory.getColor("Red"));
        Shape rectangle1 = new Rectangle("R1", 8, 12, colorFactory.getColor("Blue"));
        Shape rectangle2 = new Rectangle("R2", 10, 20, colorFactory.getColor("Blue"));
        Shape rectangle3 = new Rectangle("R3", 5, 10, colorFactory.getColor("Green"));

        circle1.draw();
        circle2.draw();
        rectangle1.draw();
        rectangle2.draw();
        rectangle3.draw();

        System.out.println("\nUnique Color objects created: " + colorFactory.getPoolSize());
    

        System.out.println(" === assignment 2: === ");
        Image img1 = new ProxyImage("https://example.com/pic1.jpg");
        Image img2 = new ProxyImage("https://example.com/pic2.jpg");

        System.out.println(" Image thumbnails loaded ");
        // placeholders only
        ImageLoader loader = new ImageLoader();
        loader.showThumbnail("https://example.com/pic1.jpg");
        loader.showThumbnail("https://example.com/pic2.jpg");

        System.out.println("\n Now viewing full image 1 ");
        img1.display(); // triggers actual download

        System.out.println("\n Viewing image 1 again ");
        img1.display(); // already loaded, skips download

        System.out.println("\n Now viewing full image 2 ");
        img2.display(); // triggers download
    }
}