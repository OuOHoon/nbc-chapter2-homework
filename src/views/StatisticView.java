package views;

import util.MyPrint;
import util.PrintColor;
import vo.Goods;
import vo.Menu;

import java.util.List;

public class StatisticView implements View {
    @Override
    public void print(List<Menu> menus) {
        System.out.println("[ 총 판매상품 목록 현황 ]");
        System.out.println("현재까지 총 판매된 상품 목록은 아래와 같습니다.");
        System.out.println();

        double totalSalesAmount = 0f;
        for (int i = 0; i < menus.size(); i++) {
            Goods goods = (Goods) menus.get(i);

            // TODO: IF문 지우기
            if (goods.isOptionSelected()) {
                MyPrint.print("- %-26s| %d개 | W %.1f\n" .formatted(goods.getName()
                                + "(" + goods.getSelectedOption().getName() + ")",
                        goods.getCount(), goods.getTotalPrice()), PrintColor.RED);
            } else {
                MyPrint.print("- %-26s| %d개 | W %.1f\n" .formatted(goods.getName(),
                        goods.getCount(), goods.getTotalPrice()), PrintColor.RED);
            }
            totalSalesAmount += goods.getTotalPrice();
        }
        System.out.println("[ 총 판매금액 현황 ]");
        System.out.printf("현재까지 총 판매된 금액은 [ W %.1f ] 입니다.\n", totalSalesAmount);

        System.out.printf("1. 돌아가기     ");
    }
}
