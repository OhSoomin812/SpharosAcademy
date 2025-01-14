package org.example.kiosk.order;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;

// 조회 필요할 경우 Getter
@Getter
@ToString
public class Order {

    private int ono;    // 주문 번호
    private ArrayList<OrderItem> orderItemList;

    // 초기화
    public Order() {
        orderItemList = new ArrayList<>();
    }

    // 새로운 OrderItem을 추가
    public void addOrderItem(OrderItem newItem) {
        orderItemList.add(newItem);
    }
}
