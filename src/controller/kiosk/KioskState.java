package controller.kiosk;

import controller.KioskController;
import dto.Menu;
import views.View;

public interface KioskState {
    void handleInteraction(KioskController kioskController, Menu selectMenu);
}
