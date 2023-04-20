public class StrapDecorator extends WatchDecorator {
    private Watch watch;
    private String strapMaterial;

    public StrapDecorator(Watch watch, String strapMaterial) {
        super(watch.getModel(), watch.getPrice());
        this.watch = watch;
        this.strapMaterial = strapMaterial;
    }

    @Override
    public String getModel() {
        return watch.getModel() + " (" + strapMaterial + " strap)";
    }

    @Override
    public int getPrice() {
        return watch.getPrice() + 20; // additional cost for strap customization
    }

    @Override
    public void printDetails() {
        System.out.println("Model: " + getModel() + ", Price: " + getPrice());
    }
}
