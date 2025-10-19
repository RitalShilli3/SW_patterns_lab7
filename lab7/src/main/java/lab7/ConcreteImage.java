package lab7;

public class ConcreteImage implements Image {

    private final String url;

    public ConcreteImage (String url) {
        this.url = url;
        loadFromNetwork();
    }

    private void loadFromNetwork() {
        System.out.println("Downloading image from: " + url);
        try {
            Thread.sleep(500); // simulate delay for network download
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + url);
    }
}


