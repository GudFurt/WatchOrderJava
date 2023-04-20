public class Watch {
    private static Watch instance;
    private String model;
    private int price;

    public Watch(String model, int price) {
        this.model = model;
        this.price = price;
    }
    public static Watch getInstance(){
        if(instance == null){
            instance = new Watch("Base model", 500);
        }
        return instance;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printDetails() {
        System.out.println("Name: " + model + ", Price: " + price);
    }
}