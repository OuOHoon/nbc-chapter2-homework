package domain;

import domain.Menu;

public class Goods extends Menu {
    private double price;
    public Goods(String name, String description, double price) {
        super(name, description);
        this.price = price;
    }
}
