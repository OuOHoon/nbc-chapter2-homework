package model;

import vo.Goods;
import vo.Menu;
import vo.MenuType;
import vo.Option;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoodsMenuModel extends AbstractMenuModel<Map<String, List<Menu>>> {

    public GoodsMenuModel() {
        menus = new HashMap<>();
        menus.put("Burgers", Arrays.asList(
                new Goods("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거",
                        MenuType.FOOD, 6.9, Arrays.asList(
                        new Option("Single", 5.4),
                        new Option("Double", 9.0))
                ),
                new Goods("SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", MenuType.FOOD, 8.9),
                new Goods("Shroom Burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", MenuType.FOOD, 9.4),
                new Goods("Cheeseburger", "포에티오 번과 비프패티, 치즈가 토핑된 치즈버거", MenuType.FOOD, 6.9),
                new Goods("Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거", MenuType.FOOD, 5.4)
        ));
        menus.put("Frozen Custard", Arrays.asList(
                new Goods("Shakes", "바닐라, 초콜렛, 솔티드 카라멜", MenuType.FOOD, 5.9),
                new Goods("Shake of the Week", "특별한 커스터드 플레이버", MenuType.FOOD, 6.5),
                new Goods("Red Bean Shake", "신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크", MenuType.FOOD, 6.5)
        ));
        menus.put("Drinks", Arrays.asList(
                new Goods("Shake-made Lemonade", "매장에서 직접 만드는 상큼한 레몬에이드", MenuType.FOOD, 3.9),
                new Goods("Fresh Brewed Iced Tea", "직접 유기농 홍차를 우려낸 아이스티", MenuType.FOOD, 3.4),
                new Goods("Fifty/Fifty", "레몬에이드와 아이스티의 만남", MenuType.FOOD, 3.5)
        ));
        menus.put("Beer", Arrays.asList(
                new Goods("ShakeMeister Ale", "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주", MenuType.FOOD, 9.8)
        ));
    }

    public List<Menu> getMenusByCategory(String category) {
        return menus.get(category);
    }
}
