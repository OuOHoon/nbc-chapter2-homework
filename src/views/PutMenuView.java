package views;

import vo.Goods;
import vo.Menu;
import util.MyPrint;
import util.PrintColor;

import java.util.List;

public class PutMenuView implements View {
    @Override
    public void print(List<Menu> menus) {
        Goods menu = (Goods) menus.get(0);
        MyPrint.println("%-16s| W %.1f | %s".formatted(menu.getName(), menu.getPrice(), menu.getDescription()), PrintColor.GREEN);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        for (int i = 1; i < menus.size(); i++) {
            MyPrint.printf("%d. ".formatted(i), PrintColor.YELLOW);
            System.out.printf("%-10s", menus.get(i).getName());
        }
    }

    public void printSuccessMessage(String menuName) {
        MyPrint.print("%-16s".formatted(menuName), PrintColor.RED);
        System.out.println("가 장바구니에 추가되었습니다.");
    }
}
