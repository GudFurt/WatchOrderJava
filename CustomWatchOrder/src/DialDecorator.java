public class DialDecorator extends WatchDecorator {
    private Watch watch;
    private String dialColor;

    public DialDecorator(Watch watch, String dialColor) {
        super(watch.getModel(), watch.getPrice());
        this.watch = watch;
        this.dialColor = dialColor;
    }

    @Override
    public String getModel() {
        return watch.getModel() + " (" + dialColor + " dial)";
    }

    @Override
    public int getPrice() {
        return watch.getPrice() + 30; // additional cost for dial customization
    }

    @Override
    public void printDetails() {
        System.out.println("Model: " + getModel() + ", Price: " + getPrice());
    }
}
