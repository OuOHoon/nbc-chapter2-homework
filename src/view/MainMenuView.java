package view;

import java.awt.*;
import java.util.List;


/*
 기능 목록
 1. ㄷ
 */
public class MainMenuView implements View{

    private static final String INTRO_TEXT = "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.";

    @Override
    public <T extends Menu> void print(T items) {
        System.out.println(WELCOME_TEXT);
        System.out.println(INTRO_TEXT);

        System.out.println();
    }

    private void printMenu(List<Menu> menus) {
        System.out.println(SHAKESHAKE_MENU_TEXT);
        for (Menu menu : menus) {

        }
    }
}
