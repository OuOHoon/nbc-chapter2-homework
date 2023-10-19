package controller.kiosk;

import controller.KioskController;
import util.UserInput;
import views.OptionMenuView;
import vo.Goods;
import vo.Menu;
import vo.Option;

import java.util.Arrays;

public class OptionState implements KioskState {

    private static final OptionMenuView view = new OptionMenuView();
    private Goods goods;

    public OptionState(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void handleInteraction(KioskController kc) {
        // 메뉴 출력 및 사용자 입력
        view.print(Arrays.asList(goods));
        int userInput = UserInput.userInput(goods.getOptions().size());

        Option option = goods.getOptions().get(userInput);
        goods.selectOption(option);
        Goods newGoods = Goods.deepCopy(goods);
        // 다음 상태 설정
        kc.setNextState(new PutState(newGoods));
    }
}
