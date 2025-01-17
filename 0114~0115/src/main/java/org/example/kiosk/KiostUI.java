package org.example.kiosk;

import org.example.kiosk.menu.Menu;
import org.example.kiosk.menu.MenuService;
import org.example.kiosk.order.Order;
import org.example.kiosk.order.OrderItem;
import org.example.kiosk.order.OrderService;

import java.util.ArrayList;
import java.util.Scanner;

public class KiostUI {

    private Scanner scanner;

    public void startOrder() {
        while(true) {
            this.greeting();
            this.makeOrder();
            this.thanks();
        }
    }

    public void greeting() {
        System.out.println("안녕하세요!");
    }

    public void makeOrder() {
        this.scanner = new Scanner(System.in);

        Order order = new Order();

        while (true) {
            ArrayList<Menu> menus = MenuService.INSTANCE.getMenus();
            menus.forEach(m -> System.out.println(m));

            System.out.print("주문하실 메뉴번호룰 입력해주세요: ");
            int num = Integer.parseInt(scanner.nextLine());

            System.out.print("수량을 입력하세요: ");
            int qty = Integer.parseInt(scanner.nextLine());

            OrderItem orderItem = OrderItem.builder().menuNo(num).qty(qty).build();

            System.out.print("주문을 계속 하시겠습니까? Y/N: ");
            String oper = scanner.nextLine();

            if(oper.equals("N")){
                break;
            }
        }
        // 주문 끝

        int orderNum = OrderService.INSTANCE.addOrder(order);
        System.out.println("주문 번호 " + orderNum);
    }

    public void thanks() {
        System.out.println("안녕히가세요. 행복하세요!");
    }
}
