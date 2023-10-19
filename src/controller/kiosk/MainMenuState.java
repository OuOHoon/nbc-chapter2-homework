package controller.kiosk;

import controller.KioskController;
import dto.Menu;

public class MainMenuState implements KioskState {
    @Override
    public void handleInteraction(KioskController kioskController, Menu selectMenu) {
        kioskController.setNextState(null, null);
    }
}
