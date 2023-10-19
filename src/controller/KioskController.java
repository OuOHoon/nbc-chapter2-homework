package controller;

import controller.kiosk.KioskState;
import controller.kiosk.MainState;
import model.Kiosk;

public class KioskController {
    private Kiosk kiosk;
    private KioskState kioskState;
    private boolean isRun;

    public KioskController() {
        kioskState = new MainState();
        kiosk = new Kiosk();
        isRun = false;
    }
    public void run() {
        isRun = true;
        while (isRun) {
            kioskState.handleInteraction(this);
        }
    }

    public Kiosk getKiosk() {
        return kiosk;
    }

    /**
     * 다음 상태로 전환하는 메소드
     * @param state
     */
    public void setNextState(KioskState state) {
        this.kioskState = state;
    }
    public void stop() {
        isRun = false;
    }
}
