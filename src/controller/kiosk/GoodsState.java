package controller.kiosk;

import controller.KioskController;
import vo.Goods;
import vo.Menu;
import model.GoodsMenuModel;
import util.UserInput;
import views.GoodsMenuView;

import java.util.List;

public class GoodsState implements KioskState {
    private String category;
    private static final GoodsMenuModel model = new GoodsMenuModel();
    private static final GoodsMenuView view = new GoodsMenuView();

    public GoodsState(String category) {
        this.category = category;
    }

    @Override
    public void handleInteraction(KioskController kc) {
        // 메뉴 출력 및 사용자 입력
        List<Menu> menus = model.getMenusByCategory(category);
        System.out.printf("[ %S MENU ]\n", category);
        view.print(menus);

        System.out.print(INPUT_TEXT);
        int userInput = UserInput.userInput(menus.size());
        Goods menu = (Goods) menus.get(userInput);

        // 다음 상태로 설정
        Goods newGoods = Goods.deepCopy(menu);
        if (menu.getOptions().size() > 0) { // 선택할 수 있는 옵션이 있으면 옵션 선택 상태로
            kc.setNextState(new OptionState(newGoods));
        } else {
            kc.setNextState(new PutState(newGoods));
        }
    }
}
