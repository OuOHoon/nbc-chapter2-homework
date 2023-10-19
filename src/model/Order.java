package model;

import vo.Goods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Order {
    private final List<Goods> goods;

    public Order() {
        goods = new ArrayList<>();
    }

    /**
     * 상품 추가 메소드. 이미 추가된 상품이라면 개수만 증가시키고 아니라면 추가한다.
     *
     * @param goods
     */
    public void addGoods(Goods goods) {
        Optional<Goods> findGoods = this.goods.stream().filter(
                item -> {
                    if (goods.isOptionSelected()) {
                        return item.getName().equals(goods.getName()) &&
                                item.getSelectedOption().getName()
                                        .equals(goods.getSelectedOption().getName());
                    }
                    return item.getName().equals(goods.getName());
                }
        ).findFirst();
        if (findGoods.isPresent()) {
            findGoods.get().increaseCount();
        } else {
            this.goods.add(goods);
        }
    }

    public void clearGoods() {
        goods.clear();
    }

    public List<Goods> getGoods() {
        return Collections.unmodifiableList(goods);
    }
}
