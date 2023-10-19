package controller;

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
    private MainMenuModel mainMenu;
    private boolean isRun;

    public KioskController() {
        view = new MainMenuView();
        kiosk = new Kiosk();
        isRun = false;
    }

    public void changeView(View view) {
        this.view = view;
    }

    public void run() {
        isRun = true;
        while (isRun) {
            view.print(getMenu(view));
            userInteract();
        }
    }

    private List<Menu> getMenu(View view) {
        if (view instanceof MainMenuView) {
            // 이런 식으로 할까.. 말까..
        }
        return null;
    }

    private Menu userInteract() {
        List<Menu> menus = getMenu(view);
        return null;
    }

    private static int userInput() {
        int userInput = -1;
        while (userInput == -1) {
            try {
                userInput = scanner.nextInt();
                if (isInvalidInput(userInput)) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException exception) {
                MyPrint.println("잘못된 입력입니다. 메뉴에 존재하는 숫자를 입력하세요.", PrintColor.RED);
            }
        }
        return userInput;
    }

    private static boolean isInvalidInput(int input) {
        if (input < 0) {
            return true;
        }
        return false;
    }
}
