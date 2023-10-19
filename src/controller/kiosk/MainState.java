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

        // 메뉴에 없는 통계 화면
        if (userInput == -1) {
            kc.setNextState(new StatisticState());
            return;
        }
        // 다음 상태로 설정
        Menu menu = menus.get(userInput);
        switch (menu.getName()) {
            case "Order" -> kc.setNextState(new OrderState());
            case "Cancel" -> kc.setNextState(new OrderCancelState());
            case "Quit" -> kc.setNextState(new QuitState());
            default -> kc.setNextState(new GoodsState(menu.getName()));
        }
    }
}
