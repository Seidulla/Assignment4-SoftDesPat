import java.util.ArrayList;
import java.util.List;

public class ImageProcessor {
    private List<ImageObserver> observers = new ArrayList<>();

    public void addObserver(ImageObserver observer) {
        observers.add(observer);
    }

    public void processImage(String image) {
        for (ImageObserver observer : observers) {
            observer.update("Image processing completed");
        }
    }
}
