package views;

import vo.Goods;
import vo.Menu;
import vo.MenuType;
import util.MyPrint;
import util.PrintColor;

import java.util.List;

public class OrderMenuView implements View {
    @Override
    public void print(List<Menu> menus) {
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println();
        printTitle("Orders");
        int i = 0;
        double totalPrice = 0f;
        while (menus.get(i).getMenuType() == MenuType.FOOD) {
            Goods menu = (Goods) menus.get(i);
            MyPrint.print("%-16s| W %.1f | ".formatted(menu.getName(), menu.getPrice()), PrintColor.RED);
            System.out.printf("%d개 | %s\n", menu.getCount(), menu.getDescription());
            totalPrice += menu.getTotalPrice();
            i++;
        }
        System.out.println();
        printTotal(totalPrice);
        System.out.println();

        int j = 1;
        while (i < menus.size()) {
            MyPrint.printf("%d. ".formatted(j), PrintColor.YELLOW);
            System.out.printf("%-10s", menus.get(i).getName());
            i++; j++;
        }
    }

    private void printTitle(String title) {
        System.out.print("[");
        MyPrint.print(" %s ".formatted(title), PrintColor.RED);
        System.out.println("]");
    }

    private void printTotal(double totalPrice) {
        printTitle("Total");
        MyPrint.println("W %.1f" .formatted(totalPrice), PrintColor.RED);
    }

}
