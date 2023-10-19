package model;

import vo.Menu;
import vo.MenuType;

import java.util.Arrays;
import java.util.List;

public class OrderCancelMenuModel extends AbstractMenuModel<List<Menu>> {

    public OrderCancelMenuModel() {
        menus = Arrays.asList(
                new Menu("확인", "", MenuType.ORDER),
                new Menu("취소", "", MenuType.ORDER)
        );
    }
}
