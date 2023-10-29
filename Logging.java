public class Logging implements ImageObserver {
    @Override
    public void update(String message) {
        System.out.println("Logging: " + message);
    }
}
