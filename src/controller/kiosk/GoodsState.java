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
        view.print(menus);

        System.out.print(INPUT_TEXT);
        int userInput = UserInput.userInput(menus.size());
        Goods menu = (Goods) menus.get(userInput);

        // 다음 상태로 설정
        kc.setNextState(new PutState(menu));
    }
}
