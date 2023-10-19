package views;

import util.MyPrint;
import util.PrintColor;
import vo.Menu;

import java.util.List;

public class OrderCancelMenuView implements View {
    @Override
    public void print(List<Menu> menus) {
        System.out.println();
        System.out.println("진행하던 주문을 취소하시겠습니까?");

        for (int i = 0; i < menus.size(); i++) {
            MyPrint.printf("%d. ".formatted(i + 1), PrintColor.YELLOW);
            System.out.printf("%-10s", menus.get(i).getName());
        }
    }

    public void printSuccessMessage() {
        System.out.println("진행하던 주문이 취소되었습니다.");
    }
}
