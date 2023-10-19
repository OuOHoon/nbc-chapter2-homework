package controller.kiosk;

import controller.KioskController;
import views.OrderFinishMenuView;

public class OrderFinishState implements KioskState{

    private static final OrderFinishMenuView view = new OrderFinishMenuView();
    @Override
    public void handleInteraction(KioskController kc) {
        view.print(null);
        kc.setNextState(new MainState());
    }
}
