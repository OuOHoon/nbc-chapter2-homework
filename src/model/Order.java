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
     * 상품 추가 메소드. 이미 추가된 상품이라면 개수만 증가시키고 아니라면 객체를 복사해서 추가한다.
     * @param goods
     */
    public void addGoods(Goods goods) {
        Optional<Goods> findGoods = this.goods.stream().filter(
                item -> item.getName().equals(goods.getName()) && item.getPrice() == goods.getPrice()
        ).findFirst();
        if (findGoods.isPresent()) {
            findGoods.get().increaseCount();
        } else {
            Goods newGoods = new Goods(goods.getName(), goods.getDescription(), goods.getMenuType(), goods.getPrice());
            this.goods.add(newGoods);
        }
    }

    public void clearGoods() {
        goods.clear();
    }

    public List<Goods> getGoods() {
        return Collections.unmodifiableList(goods);
    }
}
