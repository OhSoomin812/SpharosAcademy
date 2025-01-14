package org.example.kiosk.menu;

import java.util.ArrayList;

// 만드는 순서 : 로직 -> 변수 -> 생성자

public enum MenuService {

    // 주어진 메뉴 데이터들을 제공하는 기능

    INSTANCE;
    private ArrayList<Menu> menus;

    // 초기화
    private MenuService() {
        this.menus = new ArrayList<>();
        menus.add(new Menu(1, "아메리카노", 3000));
        menus.add(new Menu(2, "라떼", 3500));
        menus.add(new Menu(3, "카푸치노", 4000));
        menus.add(new Menu(4, "에스프레소", 2500));
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }

}
