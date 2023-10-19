package controller.kiosk;

import controller.KioskController;
import vo.Menu;
import model.OrderMenuModel;
import util.UserInput;
import views.OrderMenuView;

import java.util.ArrayList;
import java.util.List;

public class OrderState implements KioskState {

    private static final OrderMenuModel model = new OrderMenuModel();
    private static final OrderMenuView view = new OrderMenuView();

    @Override
    public void handleInteraction(KioskController kc) {
        List<Menu> menus = new ArrayList<>(kc.getKiosk().getBasket());
        menus.addAll(model.getMenus());
        view.print(menus);

        System.out.print(INPUT_TEXT);
        int userInput = UserInput.userInput(model.getMenus().size());
        Menu menu = model.getMenus().get(userInput);
        if (menu.getName().equals("주문")) {
            kc.getKiosk().buy();
            kc.setNextState(new OrderFinishState());
        } else if (menu.getName().equals("메뉴판")) {
            kc.setNextState(new MainState());
        }
    }
}
