package controller.kiosk;

import controller.KioskController;
import model.OrderCancelMenuModel;
import util.UserInput;
import views.OrderCancelMenuView;
import vo.Menu;

import java.util.List;

public class OrderCancelState implements KioskState {

    private static final OrderCancelMenuView view = new OrderCancelMenuView();
    private static final OrderCancelMenuModel model = new OrderCancelMenuModel();
    @Override
    public void handleInteraction(KioskController kc) {
        List<Menu> menus = model.getMenus();
        view.print(menus);

        int userInput = UserInput.userInput(menus.size());
        Menu menu = menus.get(userInput);
        if (menu.getName().equals("확인")) {
            kc.getKiosk().clearBasket();
            view.printSuccessMessage();
        } else if (menu.getName().equals("취소")) {

        }
        kc.setNextState(new MainState());
    }
}
