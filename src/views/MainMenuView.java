package views;

import dto.Menu;
import dto.MenuType;
import util.MyPrint;
import util.PrintColor;

import java.util.List;


/*
 메인 메뉴 출력 뷰

 */
public class MainMenuView extends View {

    private static final String INTRO_TEXT = "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.";
    private static final String SHAKESHAKE_MENU_TEXT = "[ SHAKESHAKE MENU ] ";
    private static final String ORDER_MENU_TEXT = "[ ORDER MENU ]";

    @Override
    public void print(List<Menu> menus) {
        MyPrint.println(WELCOME_TEXT, PrintColor.GREEN);
        System.out.println(INTRO_TEXT);

        System.out.println();
        printMenu(menus);
    }

    private void printMenu(List<Menu> menus) {
        System.out.println(SHAKESHAKE_MENU_TEXT);
        int i = 1;
        while (menus.get(i-1).getMenuType() == MenuType.CATEGORY) {
            Menu menu = menus.get(i - 1);
            String menuName = "%d. %-16s" .formatted(i, menu.getName());
            String menuDescription = "| %s" .formatted(menu.getDescription());

            MyPrint.print(menuName, PrintColor.YELLOW);
            MyPrint.println(menuDescription, PrintColor.WHITE);
            i++;
        }
        System.out.println();
        System.out.println(ORDER_MENU_TEXT);

        while (i <= menus.size()) {
            Menu menu = menus.get(i - 1);
            String menuName = "%d. %-16s" .formatted(1 + i + menus.size(), menu.getName());
            String menuDescription = "| %s" .formatted(menu.getDescription());

            MyPrint.print(menuName, PrintColor.YELLOW);
            MyPrint.println(menuDescription, PrintColor.WHITE);
            i++;
        }
    }
}
