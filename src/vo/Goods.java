package vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Goods extends Menu {
    private double price;
    private int count;
    private List<Option> options;
    private Option selectedOption;

    public Goods(String name, String description, MenuType menuType, double price) {
        super(name, description, menuType);
        this.price = price;
        this.count = 1;
        this.options = new ArrayList<>();
        selectedOption = null;
    }
    public Goods(String name, String description, MenuType menuType, double price, List<Option> options) {
        this(name, description, menuType, price);
        this.options = options;
    }

    public double getPrice() {
        return price;
    }
    public double getTotalPrice() {
        if (isOptionSelected()) {
            return selectedOption.getPrice() * count;
        }
        return this.count * this.price;
    }
    public int getCount() {
        return count;
    }

    public List<Option> getOptions() {
        return Collections.unmodifiableList(options);
    }

    public void selectOption(Option option) {
        selectedOption = option;
    }

    public boolean isOptionSelected() {
        if (selectedOption == null)
            return false;
        return true;
    }

    public Option getSelectedOption() {
        return selectedOption;
    }

    public static Goods deepCopy(Goods goods) {
        Goods newGoods = new Goods(goods.getName(), goods.getDescription(), goods.getMenuType(), goods.getPrice(),
                goods.getOptions());
        newGoods.selectOption(goods.selectedOption);
        return newGoods;
    }

    public int increaseCount() {
        return ++count;
    }
}
