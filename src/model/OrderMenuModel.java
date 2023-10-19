package model;

import vo.Menu;
import vo.MenuType;

import java.util.Arrays;
import java.util.List;

public class OrderMenuModel extends AbstractMenuModel<List<Menu>>{

    public OrderMenuModel() {
        menus = Arrays.asList(
                new Menu("주문", "", MenuType.ORDER),
                new Menu("메뉴판", "", MenuType.ORDER)
        );
    }
}
