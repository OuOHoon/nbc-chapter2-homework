package views;

import dto.Goods;
import util.MyPrint;
import util.PrintColor;

import java.util.*;

public class GoodsMenuView extends View {

    private Map<String, List<Goods>> menu = new HashMap<>();
    private String category;

    public GoodsMenuView(Map<String, List<Goods>> menu, String category) {


        this.category = category;
    }

    @Override
    public void print() {
        List<Goods> goods = menu.get(this.category);
        for (int i = 1; i <= goods.size(); i++) {
            Goods item = goods.get(i - 1);
            String menuText = "%d. %-16s | W %.1f | ".formatted(i, item.getName(), item.getPrice());
            String descriptionText = "%s" .formatted(item.getDescription());
            MyPrint.print(menuText, PrintColor.YELLOW);
            MyPrint.println(descriptionText, PrintColor.RESET);
        }
    }

}
