package controller.kiosk;

import controller.KioskController;
import util.UserInput;
import views.StatisticView;
import vo.Goods;
import vo.Menu;

import java.util.ArrayList;
import java.util.List;

public class StatisticState implements KioskState {

    private static final StatisticView view = new StatisticView();
    @Override
    public void handleInteraction(KioskController kc) {
        List<Menu> menus = new ArrayList<>(kc.getKiosk().getSell());
        view.print(menus);

        int userInput = UserInput.userInput(1);
        kc.setNextState(new MainState());
    }
}
