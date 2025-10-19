package lab7;

public class ImageLoader {
    public void showThumbnail(String url) {
        System.out.println("Showing placeholder thumbnail for: " + url);
    }

    public void viewFullImage(Image image) {
        image.display();
    }
}
