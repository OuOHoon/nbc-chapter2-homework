package model;


import vo.Goods;

import java.util.List;

public class Kiosk {

    // 장바구니
    private Order basket;
    // 판매 목록
    private Order solds;

    public Kiosk() {
        basket = new Order();
        solds = new Order();
    }

    public void put(Goods goods) {
        basket.addGoods(goods);
    }
    public void buy() {
        basket.getGoods().forEach((goods) -> {
            solds.addGoods(goods);
        });
        basket.clearGoods();
    }

    public void clearBasket() {
        basket.clearGoods();
    }

    public List<Goods> getBasket() {
        return basket.getGoods();
    }

    public List<Goods> getSolds() {
        return solds.getGoods();
    }
}
