package model;

import vo.Menu;
import vo.MenuType;

import java.util.Arrays;
import java.util.List;

public class PutMenuModel extends AbstractMenuModel<List<Menu>> {

    public PutMenuModel() {
        menus = Arrays.asList(
                new Menu("확인", "", MenuType.ORDER),
                new Menu("취소", "", MenuType.ORDER)
        );
    }
}
