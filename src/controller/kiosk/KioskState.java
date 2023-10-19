package controller.kiosk;

import controller.KioskController;

public interface KioskState {
    String INPUT_TEXT = "번호를 입력해주세요. ";
    void handleInteraction(KioskController kc);
}
