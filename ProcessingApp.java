public class ProcessingApp {
    public static void main(String[] args) {
        ImageProcessor imageProcessor = new ImageProcessor();
        Logging loggingObserver = new Logging();
        Gui guiObserver = new Gui();

        imageProcessor.addObserver(loggingObserver);
        imageProcessor.addObserver(guiObserver);

        imageProcessor.processImage("sample_image.jpg");

        FactoryImageFilter filterFactory = new FactoryImageFilter();
        FilterImage filter = filterFactory.createFilter("Grayscale");
        if (filter != null) {
            filter.applyFilter("sample_image.jpg");
        }
    }
}
