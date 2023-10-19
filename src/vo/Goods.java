package vo;

import java.util.ArrayList;
import java.util.List;

public class Goods extends Menu {
    private double price;
    private int count;
    private List<Menu> options;

    public Goods(String name, String description, MenuType menuType, double price) {
        super(name, description, menuType);
        this.price = price;
        this.count = 1;
        this.options = new ArrayList<>();
    }
    public Goods(String name, String description, MenuType menuType, double price, List<Menu> options) {
        this(name, description, menuType, price);
        this.options = options;
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
