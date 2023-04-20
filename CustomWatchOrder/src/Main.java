

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Watch baseWatch = Watch.getInstance();
        WatchDecorator customWatch = new StrapDecorator(new MovementDecorator(new DialDecorator(new CaseDecorator(baseWatch, "Stainless Steel"), "Blue"), "Automatic"), "Leather");
        customWatch.printDetails();

    }
}