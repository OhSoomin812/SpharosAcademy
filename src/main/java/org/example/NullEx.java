package org.example;

public class NullEx {

    public static void main(String[] args) {

        String str = null;
        System.out.println(str == null);

        int[] arr = new int[3];
        arr = null;
        // arr[1] = 10; NullPointerException오류 발생!
    }
}
