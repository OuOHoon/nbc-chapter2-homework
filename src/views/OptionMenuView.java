package views;

import util.MyPrint;
import util.PrintColor;
import vo.Goods;
import vo.Menu;
import vo.Option;

import java.util.List;

public class OptionMenuView implements View {
    @Override
    public void print(List<Menu> menus) {
        Goods menu = (Goods) menus.get(0);

        MyPrint.println("\"%-16s | W %.1f | %s\"" .formatted(menu.getName(),
                menu.getPrice(), menu.getDescription()), PrintColor.GREEN);
        System.out.println("위 메뉴의 어떤 옵션으로 추가하시겠습니까?");

        List<Option> options = menu.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Option option = options.get(i);
            MyPrint.print("%d. %s(W %.1f)    " .formatted(i + 1, option.getName(), option.getPrice()), PrintColor.RED);
        }
    }
}
