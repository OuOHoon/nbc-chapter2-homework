package controller.kiosk;

import controller.KioskController;
import vo.Menu;
import vo.MenuType;
import model.MainMenuModel;
import util.UserInput;
import views.MainMenuView;

import java.util.List;

public class MainState implements KioskState {
    private static final MainMenuModel model = new MainMenuModel();
    private static final MainMenuView view = new MainMenuView();
    @Override
    public void handleInteraction(KioskController kc) {
        // 메뉴 출력 및 사용자 입력
        List<Menu> menus = model.getMenus();
        view.print(menus);
        System.out.print(INPUT_TEXT);
        int userInput = UserInput.userInput(menus.size());

        // 다음 상태로 설정
        Menu menu = menus.get(userInput);
        if (menu.getMenuType() == MenuType.ORDER) {
            if (menu.getName().equals("Order")){
                kc.setNextState(new OrderState());
            } else if (menu.getName().equals("Cancel")) {
                kc.setNextState(new OrderCancelState());
            }

        } else {
            kc.setNextState(new GoodsState(menu.getName()));
        }
    }
}
