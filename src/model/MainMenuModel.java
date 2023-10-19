package model;

import dto.Menu;
import dto.MenuType;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainMenuModel {
    private List<Menu> menus;
    public MainMenuModel() {
        this.menus = Arrays.asList(
                new Menu("Burgers", "앵거스 비프 통살을 다져만든 버거", MenuType.CATEGORY),
                new Menu("Frozen Custard", "매장에서 신선하게 만드는 아이스크림", MenuType.CATEGORY),
                new Menu("Drinks", "매장에서 직접 만드는 음료", MenuType.CATEGORY),
                new Menu("Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주", MenuType.CATEGORY),
                new Menu("Order", "장바구니를 확인 후 주문합니다.", MenuType.ORDER),
                new Menu("Cancel", "진행중인 주문을 취소합니다.", MenuType.ORDER)
        );
    }
    public List<Menu> getMenus() {
        return Collections.unmodifiableList(menus);
    }
}
