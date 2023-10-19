package model;

import dto.Menu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainMenuModel {
    private List<Menu> goods;
    private List<Menu> orders;
    public MainMenuModel() {
        goods = getMainGoodsMenus();
        orders = getMainOrderMenus();
    }

    public List<Menu> getGoods() {
        return Collections.unmodifiableList(goods);
    }

    public List<Menu> getOrders() {
        return Collections.unmodifiableList(orders);
    }

    private List<Menu> getMainGoodsMenus() {
        return Arrays.asList(
                new Menu("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new Menu("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new Menu("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new Menu("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거")
        );
    }

    private List<Menu> getMainOrderMenus() {
        return Arrays.asList(
                new Menu("Order", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new Menu("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new Menu("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new Menu("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거")
        );
    }
}
