package views;

import dto.Menu;

import java.util.ArrayList;
import java.util.List;

public abstract class View {
    protected static final String WELCOME_TEXT = "\"SHAKESHAKE BURGER 에 오신걸 환영합니다.\"";

    /**
     * 뷰를 출력하는 메소드
     */
    public abstract void print(List<Menu> menus);
}
