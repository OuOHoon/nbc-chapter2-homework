package views;

import dto.Goods;
import dto.Menu;
import util.MyPrint;
import util.PrintColor;

import java.util.*;

public class GoodsMenuView extends View {


    public GoodsMenuView() {
    }

    @Override
    public void print(List<Menu> menus) {
        for (int i = 1; i <= menus.size(); i++) {
            Goods item = (Goods) menus.get(i - 1);
            String menuText = "%d. %-16s | W %.1f | ".formatted(i, item.getName(), item.getPrice());
            String descriptionText = "%s" .formatted(item.getDescription());
            MyPrint.print(menuText, PrintColor.YELLOW);
            MyPrint.println(descriptionText, PrintColor.RESET);
        }
    }
}
