public class Gui implements ImageObserver {
    @Override
    public void update(String message) {
        System.out.println("GUI: " + message);
    }
}
