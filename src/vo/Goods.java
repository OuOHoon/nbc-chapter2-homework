package vo;

public class Goods extends Menu {
    private double price;
    private int count;
    public Goods(String name, String description, MenuType menuType, double price) {
        super(name, description, menuType);
        this.price = price;
        this.count = 1;
    }

    public double getPrice() {
        return price;
    }
    public double getTotalPrice() {
        return this.count * this.price;
    }
    public int getCount() {
        return count;
    }
    public int increaseCount() {
        return ++count;
    }
}
