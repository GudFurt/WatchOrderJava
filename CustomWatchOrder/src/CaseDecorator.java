public class CaseDecorator extends WatchDecorator {
    private Watch watch;
    private String caseMaterial;

    public CaseDecorator(Watch watch, String caseMaterial) {
        super(watch.getModel(), watch.getPrice());
        this.watch = watch;
        this.caseMaterial = caseMaterial;
    }

    @Override
    public String getModel() {
        return watch.getModel() + " (" + caseMaterial + " case)";
    }

    @Override
    public int getPrice() {
        return watch.getPrice() + 50; // additional cost for case customization
    }

    @Override
    public void printDetails() {
        System.out.println("Model: " + getModel() + ", Price: " + getPrice());
    }
}
