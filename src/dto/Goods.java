package dto;

import dto.Menu;

public class Goods extends Menu {
    private double price;
    private int count;
    public Goods(String name, String description, double price) {
        super(name, description);
        this.price = price;
        this.count = 0;
    }

    public double getPrice() {
        return price;
    }
    public int getCount() {
        return count;
    }
}
