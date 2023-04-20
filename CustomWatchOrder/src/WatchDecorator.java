public abstract class WatchDecorator extends Watch {
    public WatchDecorator(String model, int price) {
        super(model, price);
    }

    public abstract String getModel();
}

