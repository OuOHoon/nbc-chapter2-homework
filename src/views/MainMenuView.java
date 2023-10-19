package views;

import dto.Menu;
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
    private List<Menu> goodsMenus;
    private List<Menu> orderMenus;
    public MainMenuView(List<Menu> goodsMenus, List<Menu> orderMenus) {
        this.goodsMenus = goodsMenus;
        this.orderMenus = orderMenus;
        this.getMenus().addAll(this.goodsMenus);
        this.getMenus().addAll(this.orderMenus);
    }

    @Override
    public void print() {
        MyPrint.println(WELCOME_TEXT, PrintColor.GREEN);
        System.out.println(INTRO_TEXT);

        System.out.println();
        printMenu();
    }


    private void printMenu() {
        System.out.println(SHAKESHAKE_MENU_TEXT);
        int i = 1;
        for (; i <= goodsMenus.size(); i++) {
            Menu menu = goodsMenus.get(i - 1);
            String menuName = "%d. %-16s" .formatted(i, menu.getName());
            String menuDescription = "| %s" .formatted(menu.getDescription());

            MyPrint.print(menuName, PrintColor.YELLOW);
            MyPrint.println(menuDescription, PrintColor.WHITE);
        }
        System.out.println();
        System.out.println(ORDER_MENU_TEXT);
        for (i = 0; i < orderMenus.size(); i++) {
            Menu menu = orderMenus.get(i);
            String menuName = "%d. %-16s" .formatted(1 + i + goodsMenus.size(), menu.getName());
            String menuDescription = "| %s" .formatted(menu.getDescription());

            MyPrint.print(menuName, PrintColor.YELLOW);
            MyPrint.println(menuDescription, PrintColor.WHITE);
        }
    }
}
