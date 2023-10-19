package controller.kiosk;

import controller.KioskController;
import vo.Goods;
import vo.Menu;
import model.PutMenuModel;
import util.UserInput;
import views.PutMenuView;

import java.util.ArrayList;
import java.util.List;

public class PutState implements KioskState {

    private static final PutMenuView view = new PutMenuView();
    private static final PutMenuModel model = new PutMenuModel();

    private Goods putMenu;
    public PutState(Goods menu) {
        this.putMenu = menu;
    }
    @Override
    public void handleInteraction(KioskController kc) {
        List<Menu> menus = new ArrayList<>();
        menus.add(putMenu);
        menus.addAll(model.getMenus());
        view.print(menus);

        System.out.println(INPUT_TEXT);
        int userInput = UserInput.userInput(model.getMenus().size());
        Menu menu = model.getMenus().get(userInput);
        if (menu.getName().equals("확인")) {
            kc.getKiosk().put(putMenu);
            view.printSuccessMessage(putMenu.getName());
        }
        kc.setNextState(new MainState());
    }
}
