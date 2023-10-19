package views;

import vo.Menu;

import java.util.List;

public interface View { String WELCOME_TEXT = "\"SHAKESHAKE BURGER 에 오신걸 환영합니다.\"";

    /**
     * 뷰를 출력하는 메소드
     */
    void print(List<Menu> menus);
}
