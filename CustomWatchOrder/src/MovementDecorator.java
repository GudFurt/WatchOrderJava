public class MovementDecorator extends WatchDecorator {
    private Watch watch;
    private String movementType;

    public MovementDecorator(Watch watch, String movementType) {
        super(watch.getModel(), watch.getPrice());
        this.watch = watch;
        this.movementType = movementType;
    }

    @Override
    public String getModel() {
        return watch.getModel() + " (" + movementType + " movement)";
    }

    @Override
    public int getPrice() {
        return watch.getPrice() + 100; // additional cost for movement customization
    }

    @Override
    public void printDetails() {
        System.out.println("Model: " + getModel() + ", Price: " + getPrice());
    }
}
