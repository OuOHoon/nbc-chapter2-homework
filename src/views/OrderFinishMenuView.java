package views;

import vo.Menu;

import java.util.List;

public class OrderFinishMenuView implements View{

    @Override
    public void print(List<Menu> menus) {
        System.out.println("주문이 완료되었습니다!");
        System.out.println();
        System.out.println("대기번호는 [ 1 ] 번 입니다.");
        for (int i = 0; i < 3; i++) {
            try {
                System.out.printf("(%d초후 메뉴판으로 돌아갑니다.)\n", 3-i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
