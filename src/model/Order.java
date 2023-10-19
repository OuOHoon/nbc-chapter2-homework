package model;

import dto.Goods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
    private final List<Goods> goods;

    public Order() {
        goods = new ArrayList<>();
    }

    public void addGoods(Goods goods) {
        this.goods.add(goods);
    }
    public void clearGoods() {
        goods.clear();
    }

    public List<Goods> getGoods() {
        return Collections.unmodifiableList(goods);
    }
}
