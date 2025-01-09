package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // 인덱스 번호 몰라도 됨
        list.add(30);
        list.add(44);
        list.add(11);

        // Arrays.toString() 배열의 내용물
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("--------------------------------------------------------");
        list.remove(Integer.valueOf(44));
        list.remove(44);

        System.out.println(list);
        System.out.println(list.size());

        System.out.println("--------------------------------------------------------");
        Collections.sort(list); // Dual-pivot QuickSort
    }
}