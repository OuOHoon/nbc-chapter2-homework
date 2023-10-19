package model;


public class Kiosk {

    // 현재 주문 목록
    private Order order;
    // 판매 목록
    private Order completeOrder;

    public Kiosk() {
        order = new Order();
        completeOrder = new Order();
    }

    public void cleanOrder() {
        order.clearGoods();
    }
}
