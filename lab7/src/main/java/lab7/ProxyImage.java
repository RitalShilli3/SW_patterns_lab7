package lab7;

public class ProxyImage implements Image {
    private final String url;
    private ConcreteImage realImage;

    public ProxyImage(String url) {
        this.url = url;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("Creating RealImage object...");
            realImage = new ConcreteImage(url);
        }
        realImage.display();
    }
}
