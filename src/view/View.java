package view;

import java.awt.*;

public interface View {
    String WELCOME_TEXT = "\"SHAKESHAKE BURGER 에 오신걸 환영합니다.\"";
    String SHAKESHAKE_MENU_TEXT = "[ SHAKESHAKE MENU ] ";
    String ORDER_MENU_TEXT = "[ ORDER MENU ]";

    <T extends Menu> void print(T items);
    Integer input();
}
