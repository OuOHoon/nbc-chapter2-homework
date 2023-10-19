package controller;

import controller.kiosk.KioskState;
import controller.kiosk.MainMenuState;
import model.Kiosk;
import model.MainMenuModel;
import dto.Menu;
import util.MyPrint;
import util.PrintColor;
import views.MainMenuView;
import views.View;

import java.util.List;

import static util.MyScanner.scanner;

public class KioskController {
    private static final String MENU_CHOICE_TEXT = "메뉴를 선택하세요. ";

    private View view;
    private Kiosk kiosk;
    private KioskState kioskState;
    private MainMenuModel mainMenuModel;
    private boolean isRun;

    public KioskController() {
        view = new MainMenuView();
        kioskState = new MainMenuState();
        mainMenuModel = new MainMenuModel();
        kiosk = new Kiosk();
        isRun = false;
    }
    public void run() {
        isRun = true;
        while (isRun) {
            // 사용자의 입력에 따라 다른 뷰로 넘어가거나 키오스크 모델 데이터를 변경하는 비즈니스 로직을 실행해야함.
            // 각 뷰와 모델마다 다른 메소드를 생성하게되면 엄청 슈퍼 클래스가 될텐데..
            // 어떻게 쪼개나
            // 상태 패턴으로 캡슐화할까?
            view.print(getMenu(view));
            Menu selectMenu = userInteract();
            kioskState.handleInteraction(this, selectMenu);
        }
    }

    private Menu userInteract() {
        List<Menu> menus = getMenu(view);
        return menus.get(userInput(menus.size()));
    }

    private int userInput(int menuSize) {
        int userInput = -1;
        while (userInput == -1) {
            try {
                userInput = scanner.nextInt();
                if (isInvalidInput(userInput, menuSize)) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException exception) {
                MyPrint.println("잘못된 입력입니다. 메뉴에 존재하는 숫자를 입력하세요.", PrintColor.RED);
            }
        }
        return userInput;
    }

    private boolean isInvalidInput(int input, int menuSize) {
        if (input < 0 || input > menuSize) {
            return true;
        }
        return false;
    }

    private List<Menu> getMenu(View view) {
        // 이런 식으로 하는게 최선인가.. 그럼 View가 추가될 때마다 해당 모델과 함께 여기에 추가해야 하는데..
        // 뷰 클래스에서 메뉴 정보를 갖지 않으려면 메뉴 맵핑 작업을 어디서 하긴 반드시 해야 할 것 같네
        if (view instanceof MainMenuView) {
            return mainMenuModel.getMenus();
        }
        return List.of();
    }

    public void setNextState(KioskState state, View view) {
        this.kioskState = state;
        this.view = view;
    }
}
