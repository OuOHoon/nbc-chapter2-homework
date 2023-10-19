package model;

import dto.Goods;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoodsMenuModel {

    private Map<String, List<Goods>> menus;

    public GoodsMenuModel() {
        menus = getGoodsMenu();
    }

    private Map<String, List<Goods>> getGoodsMenu() {
        Map<String, List<Goods>> menu = new HashMap<>();
        menu.put("Burgers", Arrays.asList(
                new Goods("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9),
                new Goods("SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9),
                new Goods("Shroom Burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4),
                new Goods("Cheeseburger", "포에티오 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9),
                new Goods("Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4),
                ));
        menu.put("Frozen Custard", Arrays.asList(
                new Goods("Shakes", "바닐라, 초콜렛, 솔티드 카라멜", 5.9),
                new Goods("Hamburger", "특별한 커스터드 플레이버", 6.5),
                new Goods("Hamburger", "신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크", 6.5),
                ));
        menu.put("Drinks", Arrays.asList(
                new Goods("Shake-made Lemonade", "매장에서 직접 만드는 상큼한 레몬에이드", 3.9),
                new Goods("Fresh Brewed Iced Tea", "직접 유기농 홍차를 우려낸 아이스티", 3.4),
                new Goods("Fifty/Fifty", "레몬에이드와 아이스티의 만남", 3.5),
                ));
        menu.put("Beer", Arrays.asList(
                new Goods("ShakeMeister Ale", "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주", 9.8)
        ));
        return menu;
    }
}
