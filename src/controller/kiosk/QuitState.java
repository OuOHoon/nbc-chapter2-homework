package controller.kiosk;

import controller.KioskController;
import util.MyPrint;
import util.PrintColor;

public class QuitState implements KioskState {
    @Override
    public void handleInteraction(KioskController kc) {
        MyPrint.println("프로그램을 종료합니다.", PrintColor.BLUE);
        kc.stop();
    }
}
