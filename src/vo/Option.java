package vo;

public class Option extends Menu {
    private double price;
    public Option(String name, double price) {
        super(name);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
