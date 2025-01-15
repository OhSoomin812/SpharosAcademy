package org.example.kiosk.order;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;

// 주문을 받는 사람
// 주문(Order) 에 대한 CRUD 처리하는 존재
@Log4j2
public enum OrderService {
    // 몇개나 미리 만들것인가?
    INSTANCE;

    private ArrayList<Order> orders;

    private int idx;

    private OrderService() {
        orders = new ArrayList<Order>();
    }

    // 주문을 받는다 (추가한다)
    public int addOrder(Order order) {
        log.info(order);
        log.info("current idx: " + idx);

        idx++;
        order.setOno(idx);
        orders.add(order);

        log.info(idx);
        return idx;
    }


}
